package EdwinDiaz20220281;

import java.util.HashSet;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<String> codigosAsistentes = new HashSet<>();
        String cod;
        int opc;

        codigosAsistentes.add("007");
        codigosAsistentes.add("123");
        codigosAsistentes.add("321");

        while (true){
            System.out.println("");
            System.out.println(" [0] Salir");
            System.out.println(" [1] Registrar código");
            opc = sc.nextInt();
            if(opc == 1){
                System.out.println("Código que desea registrar: ");
                cod = sc.next();
                if (codigosAsistentes.contains(cod)){
                    System.out.println("Ya está registrado");
                }
                else{
                    codigosAsistentes.add(cod);
                    System.out.println("Registrado exitosamente");
                }
            }else {
                break;
            }
        }
        mostrarAsistentes(codigosAsistentes);
        sc.close();
    }
    public static void mostrarAsistentes(HashSet<String> asistentes){
        System.out.println("Asistentes: " + asistentes);
    }
}