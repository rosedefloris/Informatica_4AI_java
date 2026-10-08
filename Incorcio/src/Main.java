import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Incrocio inc = new Incrocio();
        int scelta;

        do {
            System.out.println("1) Accendi");
            System.out.println("2) Spegni");
            System.out.println("3) Avanza semaforo");
            System.out.println("4) Mostra stato");
            System.out.println("5) Colore semaforo");
            System.out.println("6) Acceso?");
            System.out.println("0) Esci");
            System.out.print("Scelta: ");
            scelta = sc.nextInt();
            sc.nextLine();

            if (scelta == 1) {
                inc.accendi();
            } else if (scelta == 2) {
                inc.spegni();
            } else if (scelta == 3) {
                System.out.print("Semaforo (N/S/E/O): ");
                char c = sc.nextLine().charAt(0);
                inc.avanza(c);
            } else if (scelta == 4) {
                System.out.println(inc);
            } else if (scelta == 5) {
                System.out.print("Semaforo (N/S/E/O): ");
                char c = sc.nextLine().charAt(0);
                System.out.println("Colore: " + inc.getColore(c));
            } else if (scelta == 6) {
                System.out.println("Acceso? " + inc.isAcceso());
            }
        } while (scelta != 0);

        sc.close();
    }
}
