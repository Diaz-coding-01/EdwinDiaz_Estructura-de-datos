package EdwinDiaz_20220281;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main objClase = new Main();
        //Declaración de variables del metodo
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;
        int opc;

        System.out.println("Ingrese un número");
        //Válidación al obtener el carácter se asegura que solo acepte número
        try{
            num1 = sc.nextInt();
            sc.nextLine();

            System.out.println("Ingrese un segundo número");
            //Válidación al obtener el carácter se asegura que solo acepte número
            try{
                num2 = sc.nextInt();
                sc.nextLine();

                //Se muestran las opciones al usuario
                System.out.println("Elige un número de la operación que desea realizar");
                System.out.println(" [1] Sumar");
                System.out.println(" [2] Restar");
                System.out.println(" [3] Multiplicar");
                System.out.println(" [4] Dividir");
                System.out.println(" ");

                try{
                    opc = sc.nextInt();
                    sc.nextLine();
                    switch (opc){
                        case 1:
                            System.out.println("El resultado es: " + objClase.sumar(num1, num2));
                        case 2:
                            System.out.println("El resultado es: " + objClase.restar(num1, num2));
                        case 3:
                            System.out.println("El resultado es: " + objClase.multiplicar(num1, num2));
                        case 4:
                            if (num1 == 0 || num2 == 0){
                                System.out.println("No se puede dividir entre cero.");
                            }else {
                                System.out.println("El resultado es: " + objClase.dividir(num1, num2));
                            }
                    }
                } catch (Exception e) {
                    System.out.println("La opción ingresada no es válida");
                }
            }catch (Exception e) {
                System.out.println("Carácter inválido");
            }
        }catch (Exception e) {
            System.out.println("Carácter inválido");
        }
    }

    //Métodos de las operaciones aritméticas
    public int sumar(int a, int b){
        return a + b;
    }
    public int restar(int a, int b){
        return a - b;
    }
    public int multiplicar(int a, int b){
        return a * b;
    }
    public int dividir(int a, int b){
        return Math.round(a / b);
    }
}
