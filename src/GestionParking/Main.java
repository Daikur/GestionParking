package GestionParking;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Parking pk1 = new Parking("MCDonald");

        Map<String, Integer> plazas = new HashMap<>();

        plazas.put("a", 1);
        plazas.put("b", 2);
        plazas.put("c", 1);
        plazas.put("d", 1);
        plazas.put("e", 1);

        //System.out.println(pk1.alquilar());
        
//        Iterator<String> it = plazas.keySet().iterator();
//        while (it.hasNext()) {
//            String ssn = it.next();
//            System.out.println(ssn + " " + plazas.get(ssn));
//        }

    }
}
