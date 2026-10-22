public class Duration {
    private int minuti;
    private int secondi;

    public Duration(int minuti, int secondi) {
        this.minuti = minuti;
        this.secondi = secondi;
    }

    public int getMinuti() {
        return minuti;
    }

    public int getSecondi() {
        return secondi;
    }

    /** Ritorna la durata totale in secondi (utile per durataTotale). */
    public int toSecondi() {
        return minuti * 60 + secondi;
    }

    @Override
    public String toString() {
        return minuti + " minuti e " + secondi + " secondi";
    }
}
