import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static Angolo creaAngolo() {
        System.out.print("Gradi: ");
        int g = sc.nextInt();
        System.out.print("Minuti: ");
        int m = sc.nextInt();
        System.out.print("Secondi: ");
        int s = sc.nextInt();
        return new Angolo(g, m, s);
    }

    public static void main(String[] args) {
        int scelta;
        do {
            System.out.println("\n--- MENU ANGOLI ---");
            System.out.println("1. Inserisci un angolo");
            System.out.println("2. Somma di due angoli");
            System.out.println("3. Differenza fra due angoli");
            System.out.println("0. Esci");
            System.out.print("Scelta: ");
            scelta = sc.nextInt();

            switch (scelta) {
                case 1 -> {
                    Angolo a = creaAngolo();
                    System.out.println("Angolo semplificato: " + a);
                }
                case 2 -> {
                    System.out.println("Primo angolo:");
                    Angolo a1 = creaAngolo();
                    System.out.println("Secondo angolo:");
                    Angolo a2 = creaAngolo();
                    System.out.println("Somma = " + a1.sommaAngolo(a2));
                }
                case 3 -> {
                    System.out.println("Primo angolo:");
                    Angolo a1 = creaAngolo();
                    System.out.println("Secondo angolo:");
                    Angolo a2 = creaAngolo();
                    System.out.println("Differenza = " + a1.sottraiAngolo(a2));
                }
                case 0 -> System.out.println("Arrivederci!");
                default -> System.out.println("Scelta non valida.");
            }
        } while (scelta != 0);
    }
}
