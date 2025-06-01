package EdwinDiaz20220281;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Ingresa un número");
            int num = sc.nextInt();

            if (num < 0){
                System.out.println("Es negativo");
            }
            else if (num > 0){
                System.out.println("Es positivo");
            }
            else {
                System.out.println("Es cero");
            }
        } catch (Exception e) {
            System.out.println("Carácter no válido");
        }
    }
}