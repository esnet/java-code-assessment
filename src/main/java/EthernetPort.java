import java.util.*;

/*
 * Holds data about a particular Ethernet Port and all the Vlans that exist on it
 */
public class EthernetPort {
    private String name;
    private List<Vlan> vlans;

    public EthernetPort(String name, List<Vlan> vlans) {
        this.name = name;
        this.vlans = vlans;
    }

    public List<Vlan> getVlans() {
        return vlans;
    }

    public String getName() {
        return name;
    }

    public void addVlan(Vlan vlan) {
        this.vlans.add(vlan);
    }

    public Set<Integer> inUseVlanIds() {
        return null;
    }

    public Set<Integer> getFreeVlanIds() {
        return null;
    }

    public Set<IntRange> freeVlanRanges() {
        return null;
    }


    public EthernetPort() {
        // empty constructor for deserialization
    }
}