package EdwinDiaz20220281;

import java.util.HashSet;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<String> palabras = new HashSet<>();

        palabras.add("Hola");
        palabras.add("Mundo");
        palabras.add("Hola"); //No se mostrará por ser repetida
        palabras.add("Java");

        for(String palabra : palabras){ //Por cada palabra en la lista de palabras se mostrará en mayúscula con toUpperCase()
            System.out.println(palabra.toUpperCase());
        }
    }
}