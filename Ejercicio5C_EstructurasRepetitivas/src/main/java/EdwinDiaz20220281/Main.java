package EdwinDiaz20220281;

import java.util.Objects;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password = "1234";
        String passwordUser;
        int avaliableTry = 3;
        boolean accessGranted = false;

        while (true){
            System.out.println("Ingrese la contraseña");
            passwordUser = sc.next();

            if (Objects.equals(passwordUser, password)){ //Al ser String se debe comparar usando .equals()
                accessGranted = true;
                break;
            }
            System.out.println(" ");
            System.out.println("Contraseña incorrecta");
            avaliableTry--;
            if(avaliableTry == 0){
                break;
            }
        }
        if(!accessGranted){
            System.out.println("No tiene más intentos disponibles");
        }else {
            System.out.println("Contraseña correcta! Bienvenido");
        }
    }
}