import lombok.*;
import java.util.*;

/*
 * the @Data annotation provides compile-time generation of
 * getters, setters, equals and hashCode (among others)
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
/*
 * holds data about a particular Router device all the EthernetPorts that exist on it
 */
public class Router {
    public String name;
    public List<EthernetPort> ports;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder

    /*
     * Holds data about a particular Ethernet Port and all the Vlans that exist on it
     */
    public static class EthernetPort {
        public String name;
        public List<Vlan> vlans;

        Set<Integer> inUseVlanIds() {
            return null;
        }

        Set<Integer> getFreeVlanIds() {
            return null;
        }
        Set<IntRange> freeVlanRanges() {
            return null;
        }

    }
    /*
      holds data about a particular Vlan, specifically the vlan-id (0-4095) and the customer id
      associated with it. The customer id is an opaque int, guaranteed to be the same everywehre
      for a particular customer.
     */
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class Vlan {
        public int vlanId;
        public int customer;

    }


}