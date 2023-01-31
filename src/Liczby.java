/*
 *   Bartosz Markiewicz
 */

import java.util.Random;
import java.util.Scanner;

public class Liczby {
    public static void main(String[] args) {
        Scanner Scann = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Wprowadz liczbe losowanych liczb z przedzialu <10,500>");
        int ilosc = Scann.nextInt();

        int[] TablicaLiczb = new int[ilosc];

        for (int i = 0; i < ilosc; i++) {
            TablicaLiczb[i] = rand.nextInt(1, 501);
        }

        System.out.println("Wypisanie tablicy:");

        System.out.print("[");
        for (int i = 0; i < ilosc; i++) {
            System.out.print(TablicaLiczb[i] + ";");
        }
        System.out.println("]");

        System.out.print("[");
        for (int i = ilosc; i != 0; i--) {
            System.out.print(TablicaLiczb[i - 1] + ";");
        }
        System.out.println("]");

        int suma = 0;
        for (int i = 0; i < ilosc; i++) {
            if (TablicaLiczb[i] >= 10 && TablicaLiczb[i] <= 99) {
                suma += TablicaLiczb[i];
            }

        }

        System.out.println("Suma liczb dwucyfrowych wynosi:" + suma);
        System.out.print("Wszystkie liczby trzycyfrowe:");
        int iloscLiczbTrzyCyfrowych = 0;
        for (int i = 0; i < ilosc; i++) {
            if (TablicaLiczb[i] >= 100 && TablicaLiczb[i] <= 500) {
                System.out.print(TablicaLiczb[i] + ";");
                iloscLiczbTrzyCyfrowych++;
            }
        }
        System.out.println();
        System.out.println("Ilosc liczb trzycyfrowych:" + iloscLiczbTrzyCyfrowych);

    }
}
