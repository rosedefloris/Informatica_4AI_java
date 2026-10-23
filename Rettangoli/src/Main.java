import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static Rettangolo r1 = null, r2 = null;

    public static Punto creaPunto() {
        System.out.print("x: ");
        double x = sc.nextDouble();
        System.out.print("y: ");
        double y = sc.nextDouble();
        return new Punto(x, y);
    }

    public static Rettangolo creaRettangolo() {
        System.out.println("Inserisci vertice a:");
        Punto a = creaPunto();
        System.out.println("Inserisci vertice b:");
        Punto b = creaPunto();
        return new Rettangolo(a, b);
    }

    public static void main(String[] args) {
        int scelta;
        do {
            System.out.println("\n--- MENU RETTANGOLI ---");
            System.out.println("1. Definisci r1 e r2");
            System.out.println("2. Visualizza coordinate");
            System.out.println("3. Calcola perimetri");
            System.out.println("4. Calcola aree");
            System.out.println("5. Trasla r1 e r2");
            System.out.println("6. Verifica se r2 è contenuto in r1");
            System.out.println("0. Esci");
            System.out.print("Scelta: ");
            scelta = sc.nextInt();

            switch (scelta) {
                case 1: {
                    System.out.println("--- Rettangolo r1 ---");
                    r1 = creaRettangolo();
                    System.out.println("--- Rettangolo r2 ---");
                    r2 = creaRettangolo();
                    System.out.println("Rettangoli creati.");
                    break;
                }
                case 2: {
                    if (r1 == null || r2 == null) {
                        System.out.println("Prima crea i rettangoli!");
                        break;
                    }
                    System.out.println("r1: " + r1);
                    System.out.println("r2: " + r2);
                    break;
                }
                case 3: {
                    if (r1 == null || r2 == null) {
                        System.out.println("Prima crea i rettangoli!");
                        break;
                    }
                    System.out.println("Perimetro r1: " + r1.calcolaPerimetro());
                    System.out.println("Perimetro r2: " + r2.calcolaPerimetro());
                    break;
                }
                case 4: {
                    if (r1 == null || r2 == null) {
                        System.out.println("Prima crea i rettangoli!");
                        break;
                    }
                    System.out.println("Area r1: " + r1.calcolaArea());
                    System.out.println("Area r2: " + r2.calcolaArea());
                    break;
                }
                case 5: {
                    if (r1 == null || r2 == null) {
                        System.out.println("Prima crea i rettangoli!");
                        break;
                    }
                    System.out.print("dx: ");
                    double dx = sc.nextDouble();
                    System.out.print("dy: ");
                    double dy = sc.nextDouble();
                    r1 = r1.effettuaTrasla(dx, dy);
                    r2 = r2.effettuaTrasla(dx, dy);
                    System.out.println("Traslazione effettuata.");
                    break;
                }
                case 6: {
                    if (r1 == null || r2 == null) {
                        System.out.println("Prima crea i rettangoli!");
                        break;
                    }
                    if (r1.contenuto(r2)) {
                        System.out.println("r2 è completamente contenuto in r1");
                    } else {
                        System.out.println("r2 NON è contenuto in r1");
                    }
                    break;
                }
                case 0:
                    System.out.println("Arrivederci!");
                    break;
                default:
                    System.out.println("Scelta non valida.");
            }
        } while (scelta != 0);
    }
}