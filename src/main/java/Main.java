
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileInputStream;
import java.io.InputStream;

public class Main {

    public  void run() {
        try {
            InputStream is = new FileInputStream("input/data.json");

            Router[] routers = new ObjectMapper().readValue(is, Router[].class);
            for (Router r : routers) {
                System.out.println(r.getName());
            }
        } catch (Exception ex) {
            System.out.println("An exception!" + ex.getMessage());
        }

      /*
      ====================================================================
      Task 1 
      ====================================================================
      Instead of printing a list of router names, print out a report by
      customers, including all the router / port / vlan ids they are associated with:

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
      Print out a report of all unused VLAN ids by router and port in this format:
      alpha:
      - ge-1/1/0: 0 to 9, 11 to 19, 21 to 4095
      etc

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

    }



    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }


}