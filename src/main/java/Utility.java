import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class Utility {

    /*
     * this takes a collection of IntRange objects and returns a customizable
     * human-readable representation. Candidate may modify it, but that should
     * not be necessary.
     *
     * sample retvalue (separator = " to ", rangeseparator = ", ")
     *   "-2 to 30, 43 to 500, 121 to 122"
     */
    public static String asString(Collection<IntRange> ranges, String separator, String rangeSeparator) {
        List<IntRange> listOfRanges = new ArrayList<>(ranges);
        listOfRanges.sort(Comparator.comparing(IntRange::getFloor));

        List<String> parts = new ArrayList<>();
        listOfRanges.forEach(r -> {
            if (r.getCeiling() == r.getFloor()) {
                parts.add(r.getCeiling() + "");
            } else {
                parts.add(r.getFloor() + separator + r.getCeiling());
            }
        });
        return String.join(rangeSeparator, parts);
    }
}
