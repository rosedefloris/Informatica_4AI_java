import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Semaforo s = new Semaforo();
        int scelta = 0;

        while (scelta != 6) {
            System.out.println("1 Accendi");
            System.out.println("2 Spegni");
            System.out.println("3 Toggle");
            System.out.println("4 Avanza");
            System.out.println("5 Mostra stato");
            System.out.println("6 Esci");

            scelta = in.nextInt();

            if (scelta == 1) {
                s.accendi();
            } else if (scelta == 2) {
                s.spegni();
            } else if (scelta == 3) {
                s.toggle();
            } else if (scelta == 4) {
                s.avanza();
            } else if (scelta == 5) {
                System.out.println(s);
            } else if (scelta == 6) {
                System.out.println(" ");
                break;
            }
        }
    }
}