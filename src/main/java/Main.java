
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        System.out.println("\n\n\n");
        Router[] routers = {};

        try {
            InputStream is = new FileInputStream("input/data.json");

            routers = new ObjectMapper().readValue(is, Router[].class);
        } catch (Exception ex) {
            System.out.println("An exception!" + ex.getMessage());
        }


        // sample code
        for (Router r : routers) {
            System.out.println(r.getName());
        }
        // add your own logic here



      /*
      ====================================================================
      General Info
      ====================================================================
      Provided java code is at Main.java (this file), Router.java and IntRange.java
      Input JSON files under input folder. []

      Candidate can add / edit files at will.

      The JSON data in input/data.json deserializes into a Router[].
      See class definitions for data structure.





      ====================================================================
      Task 1
      ====================================================================
      Print out a report by customer-id, including all the
      router / port / vlan ids the customer-id is associated with:

      Report format:
      =============
      <customer-id>
      - <router-name> : <port-name> : <vlan-id>
      - <router-name> : <port-name> : <vlan-id>
      - <router-name> : <port-name> : <vlan-id>
      ... (more router-port-vlan entries)
      <customer-id>
      - <router-name> : <port-name> : <vlan-id>
      - <router-name> : <port-name> : <vlan-id>


      Sample output
      =============
      customer 1:
      - alpha : ge-1/1/0 : 10
      - beta : ge-2/1/0 : 103
      - beta : ge-2/1/0 : 105

      customer 2:
      ...
      ====================================================================
      */




      /*
      ====================================================================
      Task 2
      ====================================================================

      Modify EthernetPort and Vlan classes so that:

      - For an EthernetPort instance...
        - All Vlans belonging to it must have different vlanId fields from each other.
        - It can have from 0 up to 4096 Vlan entries.

      - The Vlan.vlanId field is enforced to be in the range of 0 through 4095, inclusive.
      - A particular integer in that [0, 4095] range is said to be "in-use" on a specific
      EthernetPort if that EthernetPort has a Vlan entry with that vlanId.
      Otherwise, it is said to be "free".


      Print out a report of all free VLAN ids by router and port in this format:

      <router>
      - <port-name> : <unused vlan string>

      alpha:
      - ge-1/1/0: 0 through 9, 11 through 19, 21 through 4095
      etc.


      ====================================================================
      */



      /*
      ====================================================================
      Task 3
      ====================================================================
      Generalize this program to use ALL .json files in a directory
      as input (instead of just specifically input/data.json).

      You may skip any files that cannot be deserialized to Router[],
      generating a warning message to the console.
      ====================================================================
      */

        System.out.println("\n\n\n");
    }




}