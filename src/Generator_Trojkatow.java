
/*
 *   Bartosz Markiewicz
 */
import java.util.Random;

public class Generator_Trojkatow {

    public static void main(String[] args) {
        Random rand = new Random();

        int X1 = rand.nextInt(1, 100);
        int Y1 = rand.nextInt(1, 100);
        int X2 = rand.nextInt(1, 100);
        int Y2 = rand.nextInt(1, 100);
        int X3 = rand.nextInt(1, 100);
        int Y3 = rand.nextInt(1, 100);

        int Odcinek1 = (int) Math.sqrt((X2 - X1) * (X2 - X1) + (Y2 - Y1) * (Y2 - Y1));
        int Odcinek2 = (int) Math.sqrt((X3 - X2) * (X3 - X2) + (Y3 - Y2) * (Y3 - Y2));
        int Odcinek3 = (int) Math.sqrt((X1 - X3) * (X1 - X3) + (Y1 - Y3) * (Y1 - Y3));

        String Wynik = null;
        String Pitagoras = null;
        if (Odcinek1 + Odcinek2 > Odcinek3 && Odcinek1 + Odcinek3 > Odcinek2 && Odcinek2 * Odcinek3 > Odcinek1) {
            Wynik = "Istnieje";
        } else {
            Wynik = "Nie istnieje";
        }
        System.out.println("Wygenerowano szesc liczb");
        System.out.println("Ktore tworza trzy odcinki odcinki");
        System.out.println("Program sprawdza czy da sie stworzyc z nich trojkat i czy jest on prostokatny");
        System.out.println("(" + X1 + "," + Y1 + ") " + "(" + X2 + "," + Y2 + ") " + "(" + X3 + "," + Y3 + ")");
        System.out.println("Trójkąt " + Wynik);
        if (Wynik == "Istnieje") {
            if ((Odcinek1 * Odcinek1) + (Odcinek2 * Odcinek2) == (Odcinek3 * Odcinek3) ||
                    (Odcinek1 * Odcinek1) + (Odcinek3 * Odcinek3) == (Odcinek2 * Odcinek2) ||
                    (Odcinek3 * Odcinek3) + (Odcinek2 * Odcinek2) == (Odcinek1 * Odcinek1)) {
                Pitagoras = "TAK";
            } else {
                Pitagoras = "NIE";
            }
            System.out.println("Trójkąt prostokątny " + Pitagoras);
        }


    }
}
