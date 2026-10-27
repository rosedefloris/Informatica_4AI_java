import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner ( System.in );

    public static Punto creaPunto() {
        System.out.print("Inserisci ascissa (x): ");

        double x = sc.nextDouble();
        System.out.print("Inserisci ordinata (y): ");

        double y = sc.nextDouble();

        return new Punto(x, y);
    }


    public static Vettore creaVettore() {
        System.out.println("Inserisci l'origine del vettore");
        Punto origine = creaPunto();
        System.out.println("Inserisci verticevettore: ");
        Punto vertice = creaPunto();
        return new Vettore(origine, vertice);
    }

    public static void main(String[] args) {
        Vettore v1 = null ;
        Vettore v2= null;
        int scelta;



        do {
                System.out.println("\n===== MENU =====");
              System.out.println("1)Definisci vettore v1");
            System.out.println("2)Definisci vettore v2");
            System.out.println("3)Visualizza i vettori");
             System.out.println("4)Calcola lunghezza di un vettore");
            System.out.println("5)Sposta l'origine di un vettore");
            System.out.println("7)Verifica se due vettori hanno origine uguale");
            System.out.println("0)Esci");
            System.out.print("Input:");
            scelta = sc.nextInt();

            switch (scelta) {
                case 1:
                    System.out.println("Definizione di v1:");
                    v1 = creaVettore();
                    break;

                case 2:
                    System.out.println("Definizione di v2:");
                    v2 = creaVettore();
                    break;

                case 3:
                    System.out.println("v1 = " + (v1 != null ? v1 : "non definito"));
                    System.out.println("v2 = " + (v2 != null ? v2 : "non definito"));
                    break;

                case 4: {
                    Vettore v = sceltaVettore(v1, v2);
                    if (v != null)
                        System.out.println("Lunghezza = " + v.calcolaLunghezza());
                    break;
                }

               /* public Vettore spostaOrigine(Punto p) {
                    new Vettore
                    return new Vettore(
                            //new Punto(p.getX(), p.getY()),
                            //new Punto(vertice.getX(), vertice.getY())
                    );
                }
*/
                case 5: {

                    Vettore v = sceltaVettore(v1, v2);

                        if (v == v1) {
                            v1 = v;
                        } else {
                            v2 = v;
                        }
                        System.out.println("Inserisci il nuovo punto origine:");
                        Punto p = creaPunto();
                        v.spostaOrigine(p);
                        System.out.println("Nuovo vettore: " + v);

                        if (v == v1) {
                            v1 = v;
                        } else {
                            v2 = v;
                        }

                        break;

                }

                case 7:
                    if (v1 != null && v2 != null) {
                        boolean uguale = v1.verificaOrigine(v2.getOrigine());
                        System.out.println("Origini uguali? " + uguale);
                    } else {
                        System.out.println("Definisci prima entrambi i vettori.");
                    }
                    break;

                case 0:
                    System.out.println("Arrivederci!");
                    break;

                default:
                    System.out.println("Scelta non valida.");
            }

        } while (scelta != 0);

        //sc.close();
    }


    private static Vettore sceltaVettore(Vettore v1, Vettore v2) {
        System.out.print("Quale vettore? (1 = v1, 2 = v2): ");
        int s = sc.nextInt();
        if (s == 1) {
            if (v1 == null) System.out.println("v1 non definito.");
            return v1;
        } else if (s == 2) {
            if (v2 == null) System.out.println("v2 non definito.");
            return v2;
        }
        System.out.println("Scelta non valida.");
        return null;
    }
}