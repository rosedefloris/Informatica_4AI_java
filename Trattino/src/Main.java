import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Inserisci una stringa: ");
        String s = in.nextLine();

        StringBuilder risultato = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            risultato.append(s.charAt(i));
            if (i < s.length() - 1)
                risultato.append('-');
        }
        System.out.println(risultato);

        in.close();
    }
}