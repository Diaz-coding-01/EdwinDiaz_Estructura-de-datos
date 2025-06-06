package EdwinDiaz20220281;

import java.util.LinkedList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        LinkedList<String> history = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        //Agregar 5 pestañas
        history.add("Propiedades del TreeMap Java - Youtube");
        history.add("Estructuras de datos desde cero - AprendeAhora");
        history.add("Gnosis ¿Volverá este 2025? - Youtube");
        history.add("Youtube - Google");
        history.add("Más vendidos en Amazon - Amazon");

        //Pedir al usuario siguiente canción
        System.out.println("¿Presionar botón atrás? [Y/N]");

        //Si lo ingresado no es un valor válido o de las opciones se lanzará un error para que el programa no se detenga, caso contrario se borrará el último
        try{
            String opc = sc.nextLine();

            // Solo se borra si dijo Y
            if (opc.equals("Y")) {
                history.removeLast();
            } else if (!opc.equals("N")) {
                throw new Exception("Opción inválida");
            }

        } catch (Exception e) {
            System.out.println("Valor ingresado no válido");
        }


        System.out.println(" ");
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Historial de búsqueda: Hoy");
        System.out.println(" ");

        //Por cada pestaña se mostrará
        for (String pestaña : history) {
            System.out.println(pestaña);
        }
        System.out.println("-----------------------------------------------------------------");
    }
}