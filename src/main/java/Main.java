
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("\n\n\n");

        // Deserializes a JSON file into an array of Router objects
        Router[] routers = {};
        try {
            InputStream is = new FileInputStream("input/data.json");
            routers = new ObjectMapper().readValue(is, Router[].class);
        } catch (Exception ex) {
            System.out.println("An exception!" + ex.getMessage());
        }

        // print out router names
        for (Router r : routers) {
            System.out.println(r.getName());
        }


        // Candidate code goes here



        /* Data structure reference

        Router
          String name
          List<EthernetPort> ports
            String name
            List<Vlan> vlans
              int vlanId
              int customer
         */

        System.out.println("\n\n\n");
    }




}