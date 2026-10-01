public class GeneratoreAutoIncrementale {

    private String prefisso;
    private int numeroCifre;
    private int ultimoValore;

    // Costruttore
    public GeneratoreAutoIncrementale(String prefisso, int numeroCifre) {
        this.prefisso = prefisso;
        this.numeroCifre = numeroCifre;
        this.ultimoValore = 0;
    }

    // Genera un nuovo codice
    public String genera() {

        int massimo = (int) Math.pow(10, numeroCifre) - 1;

        if (ultimoValore >= massimo) {
            return "Codici esauriti";
        }

        ultimoValore++;

        String numero = String.format(
                "%0" + numeroCifre + "d",
                ultimoValore
        );

        return prefisso + numero;
    }

    // Restituisce le informazioni sul generatore
    @Override
    public String toString() {
        return "Prefisso: " + prefisso
                + " ultimo valore generato: "
                + ultimoValore;
    }
}