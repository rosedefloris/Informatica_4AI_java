import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Inserisci la prima stringa: ");
        String a = in.nextLine();
        System.out.print("Inserisci la seconda stringa: ");
        String b = in.nextLine();

      
        Alternatore alt = new Alternatore(a, b);

        System.out.println("Oggetto creato: " + alt);
        System.out.println("Risultato: " + alt.alterna());


        Alternatore esempio = new Alternatore("ammirevole", "liuto");
        System.out.println("Esempio: " + esempio.alterna());


    }
}
