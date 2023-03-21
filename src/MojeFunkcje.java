/* Bartosz Markiewicz */

import java.util.Random;

public class MojeFunkcje {
    /**
     * @param Tablica Tablica liczb
     * @param size    Rozmiar tablicy
     * @return Funkcja zwraca uzupelniona tablice liczb
     * @author Bartosz Markiewicz
     */
    public static void TworzenieTablicy(int[] Tablica, int size) {
        Random rand = new Random();
        int lewy = -400;
        int prawy = 400;
        for (int i = 0; i < Tablica.length; i++) {
            Tablica[i] = rand.nextInt((prawy - lewy + 1) + lewy);
        }
    }

    /**
     * @param Tablica        Tablica liczb
     * @param size           Rozmiar tablicy
     * @param szukanyElement Szukany element
     * @return Funkcja zwraca ilosc wystapien szukanego elementu
     * @author Bartosz Markiewicz
     */
    public static int SzukanieElementu(int[] Tablica, int size, int szukanyElement) {
        int ilosc = 0;
        for (int i = 0; i < Tablica.length; i++) {
            if (Tablica[i] == szukanyElement) {
                ilosc++;
            }
        }
        if (ilosc == 0) ilosc = -1;
        return ilosc;
    }

    /**
     * @param Tablica Tablica liczb
     * @param size    Rozmiar tablicy
     * @return Funkcja zwraca najwiekszy element wystepujacy w tablicy
     * @author Bartosz Markiewicz
     */
    public static int NajwiekszyElement(int[] Tablica, int size) {
        int max = Tablica[0];
        for (int i = 0; i < Tablica.length; i++) {
            if (max < Tablica[i]) {
                max = Tablica[i];
            } else {
                max = max;
            }
        }
        return max;
    }

    /**
     * @param Tablica Tablica liczb
     * @param size    Rozmiar tablicy
     * @return Funkcja zwraca sume liczb parzystych wystepujacych w tablicy
     * @author Bartosz Markiewicz
     */
    public static int SumaParzystych(int[] Tablica, int size) {
        int suma = 0;
        for (int i = 0; i < Tablica.length; i++) {
            if (Tablica[i] % 2 == 0) {
                suma += Tablica[i];
            }
        }
        return suma;
    }

    /**
     * @param Tablica Tablica liczb
     * @param size    Rozmiar tablicy
     * @return Funkcja zwraca srednia liczb nieparzystych wystepujacych w tablicy
     * @author Bartosz Markiewicz
     */
    public static double SredniaNieParzystych(int[] Tablica, int size) {
        int suma = 0;
        int ile = 0;
        for (int i = 0; i < Tablica.length; i++) {
            if (Tablica[i] % 2 != 0) {
                suma += Tablica[i];
                ile++;
            }
        }
        double srednia = suma / ile;
        return srednia;
    }

}
