import lombok.*;
import java.util.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
/*
 * Holds data about a particular Ethernet Port and all the Vlans that exist on it
 */
public class EthernetPort {
    String name;
    List<Vlan> vlans;

    /*
     * the @Data annotation provides compile-time generation of
     * getters, setters, equals and hashCode (among others)
     */


}