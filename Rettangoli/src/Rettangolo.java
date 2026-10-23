public class Rettangolo {
    private Punto a, b; // vertici opposti

    public Rettangolo(Punto a, Punto b) {
        this.a = a;
        this.b = b;
    }

    public double calcolaPerimetro() {
        double base   = Math.abs(b.getX() - a.getX());
        double altezza = Math.abs(b.getY() - a.getY());
        return 2 * (base + altezza);
    }

    public double calcolaArea() {
        double base   = Math.abs(b.getX() - a.getX());
        double altezza = Math.abs(b.getY() - a.getY());
        return base * altezza;
    }

    public Rettangolo effettuaTrasla(double dx, double dy) {
        return new Rettangolo(
                new Punto(a.getX() + dx, a.getY() + dy),
                new Punto(b.getX() + dx, b.getY() + dy)
        );
    }

    /** Ritorna true se "this" contiene completamente il rettangolo r */
    public boolean contenuto(Rettangolo r) {
        double minXthis = Math.min(a.getX(), b.getX());
        double maxXthis = Math.max(a.getX(), b.getX());
        double minYthis = Math.min(a.getY(), b.getY());
        double maxYthis = Math.max(a.getY(), b.getY());

        double minXr = Math.min(r.a.getX(), r.b.getX());
        double maxXr = Math.max(r.a.getX(), r.b.getX());
        double minYr = Math.min(r.a.getY(), r.b.getY());
        double maxYr = Math.max(r.a.getY(), r.b.getY());

        return minXr >= minXthis && maxXr <= maxXthis
                && minYr >= minYthis && maxYr <= maxYthis;
    }

    @Override
    public String toString() {
        return "Rettangolo[a=" + a + ", b=" + b + "]";
    }
}
