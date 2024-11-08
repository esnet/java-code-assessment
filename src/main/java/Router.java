import java.util.*;

/*
 * holds data about a particular Router device all the EthernetPorts that exist on it
 */
public class Router {
    private String name;
    private List<EthernetPort> ports;

    public Router(String name, List<EthernetPort> ports) {
        this.name = name;
        this.ports = ports;
    }

    public String getName() {
        return name;
    }

    public List<EthernetPort> getPorts() {
        return ports;
    }

    public Router() {
        // empty constructor for deserialization
    }

}