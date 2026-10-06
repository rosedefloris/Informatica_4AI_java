import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int scelta;
        Boolean attivo = false;
        GeneratoreAutoIncrementale generatore = null;
        do {
            System.out.println("1) Crea un nuovo generatore");
            System.out.println("2) Genera un nuovo codice");
            System.out.println("0) Esci");
            scelta = input.nextInt();

            switch (scelta) {
                case 1:
                    System.out.print("Inserisci il prefisso (es. ABC): ");
                    String prefisso = input.next();
                    System.out.print("Inserisci il numero di cifre (es. 4): ");
                    int cifre = input.nextInt();
                    generatore = new GeneratoreAutoIncrementale(prefisso, cifre);
                    System.out.println("Generatore creato con successo!");
                    attivo = true;
                    break;

                case 2:
                    if (attivo != true) {
                        System.out.println("Prima devi creare un generatore (opzione 1).");
                    } else {
                        System.out.println("Codice generato: " + generatore.genera());
                        System.out.println(generatore);
                    }
                    break;

                case 0:
                    System.out.println(" ");
                    break;
            }

        } while (scelta != 0);
    }
}