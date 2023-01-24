/*
 *   Bartosz Markiewicz
 */

import java.util.Random;
import java.util.Scanner;

public class Kolo {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner Scann = new Scanner(System.in);

        int X1 = rand.nextInt(1, 100);
        int Y2 = rand.nextInt(1, 100);
        int R = rand.nextInt(1, 100);

        System.out.println("Wysolowano trzy liczby ktore sa srodkiem i promieniem kola");

        System.out.print("Wprowadz X punktu A:");
        int Ax = Scann.nextInt();

        System.out.print("Wprowadz Y punktu A:");
        int Ay = Scann.nextInt();

        System.out.println("Program sprawdza gdzie lezy punkt A");

        String Wynik = null;
        if ((Ax - X1) * (Ax - X1) + (Ay - Y2) * (Ay - Y2) == (R * R)) {
            Wynik = "na okregu";
        } else if ((Ax - X1) * (Ax - X1) + (Ay - Y2) * (Ay - Y2) > (R * R)) {
            Wynik = "w wewnatrz kola";
        } else {
            Wynik = "na zewnatrz kola";
        }
        System.out.println("Punkt A lezy:" + Wynik);
    }
}
