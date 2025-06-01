package EdwinDiaz20220281;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        System.out.println("Ingrese un número: ");

        int n = sc.nextInt(); //Guardamos el valor que el usuario ingresó
        sc.close(); //Limpiamos buffer

        for (int i = 1; i <= n; i++) {
            total += i; //Se suma los valores entre i por cada vez que se repita
            System.out.println(total); //Mostramos proceso para tener transparencia de como llegar al resultado
        }
        System.out.println("El total de la suma fue: " + total);
    }
}