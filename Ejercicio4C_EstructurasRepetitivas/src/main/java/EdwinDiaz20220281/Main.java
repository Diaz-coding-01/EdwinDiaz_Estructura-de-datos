package EdwinDiaz20220281;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 1;

        while (true){
            System.out.println("Ingrese un número: ");
            n = sc.nextInt(); //Obtenemos el valor ingresado por usuario
            if (n == 0){ //Si el valor ingresado es 0 se saldrá del bucle
                break;
            }
            System.out.println(" ");
            for (int i = 0; i < n; i++){
                System.out.println(i+1); //Se agrega uno por que inicia desde 0
            }//Al terminar el bucle pedirá al usuario ingresar otro número denuevo
        }
        System.out.println("Contador finalizado");
        sc.close(); //Limpiamos el buffer
    }
}