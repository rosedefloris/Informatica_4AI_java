import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] v = new int[10];
        int n;


        do {
            System.out.print("Quanti valori vuoi inserire? (max 10): ");
            n = sc.nextInt();
        } while (n < 1 || n > 10);


        for (int i = 0; i < n; i++) {
            System.out.print("Inserisci valore " + (i + 1) + ": ");
            v[i] = sc.nextInt();
        }


        int countPari = 0, countDispari = 0;
        for (int i = 0; i < n; i++) {
            if (v[i] % 2 == 0) countPari++;
            else countDispari++;
        }


        System.out.print("\nPari (" + countPari + "): ");
        for (int i = 0; i < n; i++) {
            if (v[i] % 2 == 0) System.out.print(v[i] + " ");
        }


        System.out.print("\nDispari (" + countDispari + "): ");
        for (int i = 0; i < n; i++) {
            if (v[i] % 2 != 0) System.out.print(v[i] + " ");
        }
        System.out.println();

        sc.close();
    }
}