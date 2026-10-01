public class Main {
    public static void main(String[] args) {

        ContoCorrente conto = new ContoCorrente(
                "Mario",
                "Rossi",
                "EE003"
        );

        System.out.println("Test contocorrente");


        System.out.println("Nominativo: " + conto.Nominativo);


        System.out.println("Codice: " + conto.Codice);


        System.out.println("Saldo iniziale: " + conto.Saldo);


        System.out.println("Deposito di 500 euro");
        System.out.println("Saldo: " + conto.deposita(500));


        System.out.println("Deposito di 200 euro");
        System.out.println("Saldo: " + conto.deposita(200));


        System.out.println("Prelievo di 300 euro");
        System.out.println("Saldo: " + conto.preleva(300));


        System.out.println("Deposito di 100 euro");
        System.out.println("Saldo: " + conto.deposita(100));


        System.out.println("Prelievo di -50 euro");
        System.out.println("Saldo: " + conto.preleva(-50));


        System.out.println("Prelievo di 1000 euro");
        System.out.println("Saldo: " + conto.preleva(1000));


        System.out.println("INFORMAZIONI CONTO");
        System.out.println(conto);
    }
}
