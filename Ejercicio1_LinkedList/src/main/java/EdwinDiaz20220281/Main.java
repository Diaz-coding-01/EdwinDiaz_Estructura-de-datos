package EdwinDiaz20220281;

import java.util.LinkedList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        LinkedList<String> playlist = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        //Agregar las 10 canciones
        playlist.add("All the Stars - Kendrick");
        playlist.add("Lucid dreams - Juice WRLD");
        playlist.add("We dont care - Kanye West");
        playlist.add("Black Star - Radiohead");
        playlist.add("All the Stars - Kendrick");
        playlist.add("Enjoy the silence - Depeche Mode");
        playlist.add("Alive - Pearl Jam");
        playlist.add("The Emptiness Machine - Linkin Park");
        playlist.add("Bed of Roses - Bon Jovi");
        playlist.add("Separate Ways - Journey");

        //Pedir al usuario siguiente canción
        System.out.println("Reproducir siguiente: ");
        String sigCancion = sc.nextLine();

        playlist.addFirst(sigCancion); //Agregamos al inicio de la lista la canción
        playlist.removeLast(); //Borramos el último

        System.out.println(" ");
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Playlist: Mis top 10 >:)");
        System.out.println(" ");

        //Por cada vez que exista una canción (Tamaño de la plyalist) esta obtendrá su puntero y le hará get para mostrarlo
        for (int i = 0; i < playlist.size(); i++) {
            System.out.println(i+1 + "- " + playlist.get(i));
        }
        System.out.println("-----------------------------------------------------------------");
    }
}