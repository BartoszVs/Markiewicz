import java.util.Scanner;

/*
    Bartosz Markiewicz
    Treść:
		Dane jest czworokąt o wierzchołkach ABCD użytkownik podaje 8 wartości rzeczywistych.
		Obliczyć obwód czworokąta i sprawdzić czy czworokąt może być rombem.
*/
public class Czworokat {
    public static void main(String[] args) {
        Scanner Scann = new Scanner(System.in);

        System.out.println("Podaj Ax : ");
        double Ax = Scann.nextDouble();

        System.out.println("Podaj Ay : ");
        double Ay = Scann.nextDouble();

        System.out.println("Podaj Bx : ");
        double Bx = Scann.nextDouble();

        System.out.println("Podaj By : ");
        double By = Scann.nextDouble();

        System.out.println("Podaj Cx : ");
        double Cx = Scann.nextDouble();

        System.out.println("Podaj Cy : ");
        double Cy = Scann.nextDouble();

        System.out.println("Podaj Dx : ");
        double Dx = Scann.nextDouble();

        System.out.println("Podaj Dy : ");
        double Dy = Scann.nextDouble();

        double AB = Math.sqrt((Bx - Ax) * (Bx - Ax) + (By - Ay) * (By - Ay));
        double BC = Math.sqrt((Cx - Bx) * (Cx - Bx) + (Cy - By) * (Cy - By));
        double CD = Math.sqrt((Dx - Cx) * (Dx - Cx) + (Dy - Cy) * (Dy - Cy));
        double DA = Math.sqrt((Ax - Dx) * (Ax - Dx) + (Ay - Dy) * (Ay - Dy));

        double Obwod = AB + BC + CD + DA;

        String Wynik = (AB == BC && AB == CD && AB == DA && BC == CD && BC == DA) ? "TAK" : "NIE";

        System.out.println("Obwód = " + Obwod);
        System.out.println("PRAWDOPODOBNIE: " + Wynik);


    }
}
