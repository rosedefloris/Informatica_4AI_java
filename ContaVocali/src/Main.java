import java.util.Scanner;

public class TestContaVocali {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Inserisci una stringa: ");
        String s = in.nextLine();


        contaVocali cv = new contaVocali(s);

        System.out.println("Oggetto creato: " + cv);
        System.out.println("Vocali (solo minuscole): " + cv.contaVocaliMinuscole());
        System.out.println("Vocali (maiusc./minusc.): " + cv.contaVocali());


        in.close();
    }
}