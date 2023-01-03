import java.util.Scanner;

/*
    Bartosz Markiewicz
    Z klawiatury podawane są dwie liczby pierwsza int druga double
    Liczbe rzeczywista nalezy powiekszyc czterokrotnie i wypisac wynik na ekranie.
    A dla liczby calkowitej leży wypisać zaczynając od cyfry jednosci poszczegolne cyfry tej liczby

*/
public class Zadanie {
    public static void main(String[] args) {

        Scanner Scann = new Scanner(System.in);

        System.out.print("Podaj liczbe calkowita");
        int Calkowita = Scann.nextInt();
        int cyfrajednosci;

        for (;;) {
            cyfrajednosci = Calkowita%10;
            System.out.println(cyfrajednosci+" ");
            Calkowita/=10;
            if (Calkowita == 0) break;
        }

        System.out.print("Podaj liczbe rzeczywista");
        double Rzeczywista = Scann.nextDouble();
        Rzeczywista = Rzeczywista*4;
        System.out.println(Rzeczywista);
    }
}
