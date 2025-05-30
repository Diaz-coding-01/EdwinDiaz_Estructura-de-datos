package EdwinDiaz20220281;

import java.util.HashSet;
import java.util.Set;

public class Users {
    public void estructuraHashSet() {
        Set<String> users = new HashSet<>(); //Se crea una estructura HashSet

        //Se agregan 5 usuarios y algunos están repetidos
        users.add("Pepe");
        users.add("Juanito");
        users.add("Poncho");
        users.add("Juanito"); //Repetido
        users.add("Pepe"); //Repetido

        //Mostrar el hashset, al ser esta estructura todos serán usuarios únicos
        System.out.println("Usuarios únicos: " + String.valueOf(users));
        System.out.println(" ");
        System.out.println("¿Existe Juanito?: " + users.contains("Juanito")); //Busca un usuario específico
    }
}
