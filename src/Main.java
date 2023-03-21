/* Bartosz Markiewicz */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Scann = new Scanner(System.in);

        int[] TablicaLiczb = new int[100];
        MojeFunkcje.TworzenieTablicy(TablicaLiczb, 100);
        System.out.println("Utworzono tablice 100 elementow");

        System.out.println("Wprowadź szukany element:");
        int szukanyElement = Scann.nextInt();

        int ilosc = MojeFunkcje.SzukanieElementu(TablicaLiczb, 100, szukanyElement);

        System.out.println("Zawartosc tablicy:");
        for (int i = 0; i < TablicaLiczb.length; i++) {
            System.out.print(TablicaLiczb[i] + ",");
        }
        System.out.println();
        if (ilosc == -1) {
            System.out.println("Brak szukanego elementu");
        } else {
            System.out.println("Ilosc szukanego elementu " + ilosc);
        }

        int max = MojeFunkcje.NajwiekszyElement(TablicaLiczb, 100);
        System.out.println("Najwiekszy element tablicy: " + max);

        int sumaParzystych = MojeFunkcje.SumaParzystych(TablicaLiczb, 100);
        System.out.println("Suma liczb patrzystych wynosi: " + sumaParzystych);

        double srednia = MojeFunkcje.SredniaNieParzystych(TablicaLiczb, 100);
        System.out.println("Srednia liczb nieparzystych wynosi: " + srednia);


    }
}
