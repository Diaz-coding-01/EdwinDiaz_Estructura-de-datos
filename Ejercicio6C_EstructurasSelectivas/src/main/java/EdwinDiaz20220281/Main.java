package EdwinDiaz20220281;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double porcentajeDesc = 0;
        double price = 0.00;
        String name = "";
        double total = 0.00;

        System.out.println("Productos");
        try {
            System.out.println(" [1] Mouse - 15.00");
            System.out.println(" [2] Teclado - 55.00");
            System.out.println(" [3] Monitor - 105.00");
            int opc = sc.nextInt();

            switch (opc){
                case 1:
                    name = "Mouse";
                    price = 15.00;
                    porcentajeDesc = 10; //10% de descuento
                    total = price - (price * (porcentajeDesc / 100));
                    break;
                case 2:
                    name = "Teclado";
                    price = 55.00;
                    porcentajeDesc = 10; //10% de descuento
                    total = price - (price * (porcentajeDesc / 100));
                    break;
                case 3:
                    name = "Monitor";
                    price = 105.00;
                    porcentajeDesc = 10; //10% de descuento
                    total = price - (price * (porcentajeDesc / 100));
                    break;
                default:
                    throw new Exception("No existe el producto");
            }

            System.out.println("Nombre: " + name);
            System.out.println("Precio original: " + price);
            System.out.println("Porcentaje de descuento: " + porcentajeDesc + "%");
            System.out.println("Precio final con descuento: " + total);

        }catch (Exception e) {
            System.out.println("Opción inválida");
        }
    }
}