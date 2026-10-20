import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int[] v = new int[10];

        System.out.print("Inserisci a: ");
        int a = sc.nextInt();
        System.out.print("Inserisci b: ");
        int b = sc.nextInt();


        if (a > b) {
            int tmp = a;
            a = b;
            b = tmp;
        }

        int m = (a + b) / 2;
        System.out.println("m = (a+b)/2 = " + m);


        for (int i = 0; i < 10; i++) {
            v[i] = a + rand.nextInt(b - a + 1);
        }


        System.out.print("Vettore generato: ");
        for (int x : v) System.out.print(x + " ");
        System.out.println();


        System.out.print("Valori tra " + a + " e " + m + ": ");
        for (int x : v) {
            if (x >= a && x <= m) System.out.print(x + " ");
        }


        System.out.print("\nValori tra " + (m + 1) + " e " + b + ": ");
        for (int x : v) {
            if (x >= m + 1 && x <= b) System.out.print(x + " ");
        }
        System.out.println();

        sc.close();
    }
}
