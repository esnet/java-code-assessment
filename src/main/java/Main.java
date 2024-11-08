
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("\n\n\n");

        // Deserializes a JSON file into an array of Router objects
        EthernetPort[] ports = {};
        try {
            InputStream is = new FileInputStream("input/data.json");
            ports = new ObjectMapper().readValue(is, EthernetPort[].class);
        } catch (Exception ex) {
            System.out.println("An exception!" + ex.getMessage());
        }

        // print out router names
        for (EthernetPort p : ports) {
            System.out.println(p.getName());
        }


        // Candidate code goes here



        /* Data structure reference

        EthernetPort
          String name
          List<Vlan> vlans
            int vlanId
            int customer

         */

        System.out.println("\n\n\n");
    }




}