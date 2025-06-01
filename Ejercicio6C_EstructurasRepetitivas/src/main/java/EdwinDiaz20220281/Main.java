package EdwinDiaz20220281;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String opc;
        boolean repeat = true;

        while (repeat){
            System.out.println("Sistema hecho en JAVA");
            System.out.println("----------------------------");
            System.out.println(" [1] Conocer JDK");
            System.out.println(" [2] Base de datos");
            System.out.println(" [3] Salir");
            System.out.println(" ");

            opc = sc.next();

            System.out.println(" ");

            switch (opc){
                case "1":
                    System.out.println("El JDK del sistema es el JDK 17");
                    break;
                case "2":
                    System.out.println("La base de datos es ORACLE");
                    break;
                case "3":
                    System.out.println("Saliendo...");
                    repeat = false;
                    break;
                default:
                    System.out.println("Opción no válida, seleccione una opción de las que se muestran.");
            }
        }
    }
}