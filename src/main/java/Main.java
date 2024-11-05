
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



        System.out.println("\n\n\n");
    }




}