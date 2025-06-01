package EdwinDiaz20220281;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mostrar tabla de multiplicar del número..");
        int tb = sc.nextInt();

        for (int i = 1; i <= 10; i++) { //Se mostrará la tabla de multiplicar deseada hasta [tbx10]
            System.out.println(tb + " * " + i + " = " + tb * i);
        }
    }
}