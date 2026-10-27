import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Inserisci la prima parola: ");
        String p1 = in.nextLine();
        System.out.print("Inserisci la seconda parola: ");
        String p2 = in.nextLine();

        if (p1.length() >= p2.length())
            System.out.println("La parola più lunga è: " + p1);
        else
            System.out.println("La parola più lunga è: " + p2);

        in.close();
    }
}