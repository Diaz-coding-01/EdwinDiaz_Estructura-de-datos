package EdwinDiaz20220281;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeMap<String, Double> map = new TreeMap<String, Double>();

        double precioMin = 999; //Número muy grande para compararlo con los precios más adelante
        double precioMax = 0;
        String masBarato = "";
        String masCaro = "";

        map.put("Hamburguesa", 15.5);
        map.put("Papas fritas (Con queso)", 10.5);
        map.put("Gaseosa", 5.5);
        map.put("Combo familiar", 25.5);

        System.out.println("Menú:");
        System.out.println(" [1] Ordenar alfabéticamente");
        System.out.println(" [2] Buscar por precio");
        System.out.println(" [3] Del más barato al más caro");
        int opc = sc.nextInt();

        switch (opc){
            case 1:
                System.out.println("");
                for (Map.Entry<String, Double> producto : map.entrySet()){
                    System.out.println(" Producto: " + producto.getKey() + "Precio: " + producto.getValue());
                }
                break;
            case 2:
                System.out.println("");
                System.out.println("Escriba el nombre del producto que busca: ");
                String scr = sc.next();
                System.out.println("Producto encontrado:" + map.get(scr));
                break;
            case 3:
                for (Map.Entry<String, Double> producto : map.entrySet()){
                    String nombre = producto.getKey();
                    double precio = producto.getValue();

                    if (precio < precioMin) {
                        precioMin = precio;
                        masBarato = nombre;
                    }

                    if (precio > precioMax) {
                        precioMax = precio;
                        masCaro = nombre;
                    }
                }
                System.out.println("Producto más barato: " + masBarato + " $" + precioMin);
                System.out.println("Producto más caro: " + masCaro + " $" + precioMax );
            default:
                System.out.println("");
                System.out.println("Opción ingresada no válida");
                break;
        }
    }
}