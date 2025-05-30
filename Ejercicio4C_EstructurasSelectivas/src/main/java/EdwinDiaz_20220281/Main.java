package EdwinDiaz_20220281;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la nota del estudiante");
        try{
            //Guardamos la opc del usuario en la variable grade
            int grade = sc.nextInt();
            sc.close(); //Limpiamos el buffer de scanner

            //Si es mayor a 6 su nota aprueba, si es igual o menor desaprueba
            if(grade > 6){
                System.out.println("Aprobado");
            }else{
                System.out.println("Desaprobado");
            }
        } catch (Exception e) {
            System.out.println("Ingrese una nota válida");
        }
    }
}