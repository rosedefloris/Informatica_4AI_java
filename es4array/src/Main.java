import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] v = new int[10];
        int n = 0;


        while (n < 10) {
            System.out.print("Inserisci un valore (negativo per terminare): ");
            int val = sc.nextInt();
            if (val < 0) break;
            v[n] = val;
            n++;
        }


        System.out.print("\nValori in ordine inverso: ");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(v[i] + " ");
        }
        System.out.println();

        sc.close();
    }
}
