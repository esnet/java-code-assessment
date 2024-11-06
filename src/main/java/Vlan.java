
/*
  holds data about a particular Vlan, specifically the vlan-id and the customer id
  associated with it.

  The customer id is an opaque int, assume it is pointing to an external system
 */

public record Vlan(int vlanId, int customer) {
    public static int MAX_VLAN_ID = 4095;
    public static int MIN_VLAN_ID = 0;


    public Vlan {
        if (vlanId > MAX_VLAN_ID || vlanId < MIN_VLAN_ID) {
            throw new IllegalArgumentException("vlanId must be between 0 and 4096");
        }
    }

}
