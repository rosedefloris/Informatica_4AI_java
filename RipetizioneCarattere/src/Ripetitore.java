public class Ripetitore {

    private char carattere;
    private int numero;


    public Ripetitore(char carattere, int numero) {
        this.carattere = carattere;
        this.numero = numero;
    }


    public char getCarattere() {
        return carattere;
    }

    public void setCarattere(char carattere) {
        this.carattere = carattere;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }


    public String ripeti() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numero; i++)
            sb.append(carattere);
        return sb.toString();
    }

    @Override
    public String toString() {
        return "Ripetitore{carattere='" + carattere + "', numero=" + numero + "}";
    }
}