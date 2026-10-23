public class Angolo {
    private int gradi;
    private int minuti;
    private int secondi;

    public Angolo(int gradi, int minuti, int secondi) {
        this.gradi = gradi;
        this.minuti = minuti;
        this.secondi = secondi;
        semplifica();
    }

    // Normalizza: 60 sec = 1 min, 60 min = 1 grado, 360° = 0°
    private void semplifica() {
        int totSecondi = gradi * 3600 + minuti * 60 + secondi;
        totSecondi = ((totSecondi % (360 * 3600)) + (360 * 3600)) % (360 * 3600);
        gradi   = totSecondi / 3600;
        minuti  = (totSecondi % 3600) / 60;
        secondi = totSecondi % 60;
    }

    public Angolo sommaAngolo(Angolo a) {
        return new Angolo(this.gradi + a.gradi,
                this.minuti + a.minuti,
                this.secondi + a.secondi);
    }

    public Angolo sottraiAngolo(Angolo a) {
        return new Angolo(this.gradi - a.gradi,
                this.minuti - a.minuti,
                this.secondi - a.secondi);
    }

    @Override
    public String toString() {
        return gradi + "° " + minuti + "' " + secondi + "\"";
    }
}