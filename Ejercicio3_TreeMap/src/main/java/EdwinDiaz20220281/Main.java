package EdwinDiaz20220281;

import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap<String, Integer> jugadores = new TreeMap<>();

        //Agregamos datos al mapa
        jugadores.put("van Dijk", 89);
        jugadores.put("Cristiano Ronaldo", 86);
        jugadores.put("Mbappé", 91);
        jugadores.put("Messi", 88);
        jugadores.put("Raphinha", 84);

        //Jugadores ordenados por nombre
        System.out.println("Jugadores:");
        for (Map.Entry<String, Integer> entry : jugadores.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        //Jugador con mayor puntaje
        String mejorJugador = "";
        int puntajeMaximo = Integer.MIN_VALUE; //Se hace uso de esta propiedad del int que permite que cada número con el que sea comparado sea mayor a él, útil ya para el momento de sacar el mayor puntaje

        for (Map.Entry<String, Integer> entry : jugadores.entrySet()) {
            if (entry.getValue() > puntajeMaximo) { //Se compara la entrada del mapa con el puntaje máximo (Siempre será mayor entry al inicio del bucle)
                puntajeMaximo = entry.getValue(); //Así se va a ir comparando y guardando el puntaje y nombre del jugadoor
                mejorJugador = entry.getKey();
            }
        }

        System.out.println("Jugador con el puntaje más alto: ");
        System.out.println("-----------------------------------------------------------");
        System.out.println(mejorJugador + " - " + puntajeMaximo);
    }
}