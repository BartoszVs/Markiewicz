import java.util.Random;
import java.util.Scanner;

public class Gra {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner Scann = new Scanner(System.in);
        int SzukanaLiczba = rand.nextInt(10);
        System.out.println("Wprowadź liczbę <0,100> Masz 10 sznas na jej zgadniecie");

        for (int i = 1; i <= 10; i++) {
            int PodanaLiczba = Scann.nextInt();
            if (i != 10) {
                if (PodanaLiczba == SzukanaLiczba) {
                    System.out.println("Wygrałeś");
                } else {
                    if (PodanaLiczba > SzukanaLiczba) {
                        System.out.println("Wprowadź mniejszą liczbe, liczba szans " + (10 - i));
                    } else {
                        System.out.println("Wprowadź wiekszą liczbe, liczba szans " + (10 - i));
                    }
                }
            } else {
                System.out.println("Przegrałes!");
            }
        }
    }
}
