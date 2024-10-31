import lombok.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;


@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class IntRange {
    public int floor;
    public int ceiling;

    /*
     * Takes a collection of IntRange objects and returns a human-readable
     * representation.
     *
     * sample retvalue
     *   "-2 to 30, 43 to 500, 121 to 122"
     */

    public static String asString(Collection<IntRange> ranges) {
        List<IntRange> listOfRanges = new ArrayList<>(ranges);
        listOfRanges.sort(Comparator.comparing(IntRange::getFloor));

        List<String> parts = new ArrayList<>();
        listOfRanges.forEach(r -> {
            if (r.getCeiling() == r.getFloor()) {
                parts.add(r.getCeiling() + "");
            } else {
                parts.add(r.getFloor() + " to " + r.getCeiling());
            }
        });
        return String.join(", ", parts);
    }

    public static void example() {
        IntRange a = new IntRange(0, 10);
        IntRange b = new IntRange(5, 20);
        Set<IntRange> example = new HashSet<>();
        example.add(a);
        example.add(b);
        System.out.println(IntRange.asString(example));

    }

}