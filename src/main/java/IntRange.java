import lombok.*;


@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class IntRange {
    private int floor;
    private int ceiling;


    /*
     * the @Data annotation provides compile-time generation of
     * getters, setters, equals and hashCode (among others)
     */



}