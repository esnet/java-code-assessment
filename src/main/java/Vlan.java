import lombok.*;


/*
  holds data about a particular Vlan, specifically the vlan-id (0-4095) and the customer id
  associated with it. The customer id is an opaque int, guaranteed to be the same everywehre
  for a particular customer.
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Vlan {
    int vlanId;
    int customer;

    /*
     * the @Data annotation provides compile-time generation of
     * getters, setters, equals and hashCode (among others)
     */

}