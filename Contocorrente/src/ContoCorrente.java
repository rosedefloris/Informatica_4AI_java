public class ContoCorrente {
    private String nome;
    private String cognome;
    private String codice;
    private double saldo;

    // Costruttore
    public ContoCorrente(String nome, String cognome, String codice) {
        this.nome = nome;
        this.cognome = cognome;
        this.codice = codice;
        this.saldo = 0;
    }

    // Preleva una quantità di denaro
    public double preleva(double quantita) {
        if (quantita >= 0 && saldo - quantita >= 0) {
            saldo = saldo - quantita;
        }

        return saldo;
    }


    public double deposita(double quantita) {
        if (quantita >= 0) {
            saldo = saldo + quantita;
        }

        return saldo;
    }


    public double getSaldo() {
        return saldo;
    }


    public String getCodice() {
        return codice;
    }

    public String getNominativo() {
        return nome + " " + cognome;
    }


    @Override
    public String toString() {
        return "Conto corrente\n"
                + "Nominativo: " + getNominativo() + "\n"
                + "Codice: " + codice + "\n"
                + "Saldo: " + saldo + " euro";
    }
}
