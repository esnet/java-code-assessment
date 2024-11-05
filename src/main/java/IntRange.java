
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.HashSet;



public class IntRange {
    private int floor;
    private int ceiling;

    public IntRange(int floor, int ceiling) {
        this.floor = floor;
        this.ceiling = ceiling;
    }

    public int getFloor() {
        return floor;
    }

    public int getCeiling() {
        return ceiling;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public void setCeiling(int ceiling) {
        this.ceiling = ceiling;
    }

    /*
     * Takes a collection of IntRange objects and returns a human-readable
     * representation.
     *
     * sample retvalue
     *   "-2 to 30, 43 to 500, 121 to 122"
     */

    public static String humanReadable(Collection<IntRange> ranges) {
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
        System.out.println(IntRange.humanReadable(example));

    }

}