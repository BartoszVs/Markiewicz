import java.util.Random;

public class Lotto {
    public static void main(String[] args) {
        Random rand = new Random();
        for (int i = 1; i <= 6; i++) {
            int losowanaLiczba = rand.nextInt(1, 49);
            System.out.print(losowanaLiczba + " ");
        }
    }
}
