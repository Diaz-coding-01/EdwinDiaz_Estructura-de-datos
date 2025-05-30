package EdwinDiaz_20220281;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número");
        try{
            int num = sc.nextInt();
            if(num % 2 == 0){
                System.out.println("Es par");
            }else{
                System.out.println("Es impar");
            }
        } catch (Exception e) {
            System.out.println("Carácter inválido");
        }
    }
}