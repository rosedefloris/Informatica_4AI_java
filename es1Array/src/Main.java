import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] v = new int[10];
        int n;

        // Chiedi quanti valori inserire (max 10)
        do {
            System.out.print("Quanti valori vuoi inserire? (max 10): ");
            n = sc.nextInt();
        } while (n < 1 || n > 10);

        // Inserimento valori
        for (int i = 0; i < n; i++) {
            System.out.print("Inserisci valore " + (i + 1) + ": ");
            v[i] = sc.nextInt();
        }

        // Conteggio pari e dispari
        int countPari = 0, countDispari = 0;
        for (int i = 0; i < n; i++) {
            if (v[i] % 2 == 0) countPari++;
            else countDispari++;
        }

        // Stampa pari
        System.out.print("\nPari (" + countPari + "): ");
        for (int i = 0; i < n; i++) {
            if (v[i] % 2 == 0) System.out.print(v[i] + " ");
        }

        // Stampa dispari
        System.out.print("\nDispari (" + countDispari + "): ");
        for (int i = 0; i < n; i++) {
            if (v[i] % 2 != 0) System.out.print(v[i] + " ");
        }
        System.out.println();

        sc.close();
    }
}