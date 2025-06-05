package EdwinDiaz20220281;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        TreeMap<String, Integer> ciudades = new TreeMap<String, Integer>();

        String masCalida = "";
        String masFria;

        ciudades.put("San Salvador", 33);
        ciudades.put("Santa Ana", 34);
        ciudades.put("Acajutla", 25);
        ciudades.put("Cancún", 36);


        for (Map.Entry<String, Integer> ciudad : ciudades.entrySet()){
            System.out.println(ciudad.getKey() + " " + ciudad.getValue());
        }


        Collection<Integer> temperatures = ciudades.values();
        int tempMin = Collections.min(temperatures);
        int tempMax = Collections.max(temperatures);

        System.out.println("---------------------------------------------");
        System.out.println("Ciudad más fría: " + tempMin);
        System.out.println("Ciudad más cálida: " + tempMax);

    }
}