import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    Scanner s = new Scanner(System.in);
    Scanner in = new Scanner(System.in);
    double X,Y;

    public static Punto creaPunto(double X,double Y){
        System.out.println("Inserisci x del primo punto");
        X = in.nextDouble();
        System.out.println("Inserisci y del primo punto");
        Y = in.nextDouble();
        return new Punto (X,Y) ;
    }
    public static void main(String[] args) {
        Rettangolo r = new Rettangolo ();

        int scelta;
        do {
            System.out.println("1)Crea rettangolo");
            System.out.println("2) Calcola perimetro");
            System.out.println("3) Calcola Area");
            scelta = s.nextInt();
            switch (scelta){
                case 1:
                    a=creaPunto(double X,double Y)
                    break;
            }
        }while (scelta!=0);
        }
    }
