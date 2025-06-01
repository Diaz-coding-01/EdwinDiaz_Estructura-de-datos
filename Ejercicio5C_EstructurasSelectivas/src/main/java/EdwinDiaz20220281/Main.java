package EdwinDiaz20220281;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el número del dia que desea conocer");
        try{
            //Uso de String para guardar la variable del día porque no es operable
            String day = sc.next();
            sc.close();

            switch (day){
                case "1":
                    System.out.println("Monday");
                    break;
                case "2":
                    System.out.println("Tuesday");
                    break;
                case "3":
                    System.out.println("Wednesday");
                    break;
                case "4":
                    System.out.println("Thursday");
                    break;
                case "5":
                    System.out.println("Friday");
                    break;
                case "6":
                    System.out.println("Saturday");
                    break;
                case "7":
                    System.out.println("Sunday");
                    break;
                default:
                    System.out.println("Día inválido");
            }
        } catch (Exception e) {
            System.out.println("Carácter inválido");
        }
    }
}