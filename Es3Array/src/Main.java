import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] v = new int[10];


        for (int i = 0; i < 10; i++) {
            v[i] = rand.nextInt(100);
        }


        for (int i = 0; i < 10; i++) {
            System.out.printf("%3d", i);
        }
        System.out.println();

        for (int x : v) {
            System.out.printf("%3d", x);
        }
        System.out.println();
    }
}