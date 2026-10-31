import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Inserisci un carattere: ");
        char c = in.nextLine().charAt(0);

        System.out.print("Inserisci un numero intero: ");
        int n = Integer.parseInt(in.nextLine());


        Ripetitore r = new Ripetitore(c, n);

        System.out.println("Oggetto creato: " + r);
        System.out.println("Risultato: " + r.ripeti());


        Ripetitore esempio = new Ripetitore('*', 10);
        System.out.println("Esempio: " + esempio.ripeti());
       

        in.close();
    }
}
