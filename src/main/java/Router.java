import lombok.*;
import java.util.*;

/*
 * holds data about a particular Router device all the EthernetPorts that exist on it
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Router {
    String name;
    List<EthernetPort> ports;

    /*
     * the @Data annotation provides compile-time generation of
     * getters, setters, equals and hashCode (among others)
     */

}