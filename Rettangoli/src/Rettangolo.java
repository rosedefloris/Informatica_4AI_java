/*public class Rettangolo {

    private Punto a, b; // vertici opposti

    public Rettangolo(Punto a, Punto b) {
        this.a = a;
        this.b = b;
    }

    public double calcolaPerimetro() {
        double base    = Math.abs(b.getX() - a.getX());
        double altezza = Math.abs(b.getY() - a.getY());
        return 2 * (base + altezza);
    }

    public double calcolaArea() {
        double base    = Math.abs(b.getX() - a.getX());
        double altezza = Math.abs(b.getY() - a.getY());
        return base * altezza;
    }

    public Rettangolo effettuaTrasla(double dx, double dy) {
        return new Rettangolo(
                new Punto(a.getX() + dx, a.getY() + dy),
                new Punto(b.getX() + dx, b.getY() + dy)
        );
    }


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
*/

public class Rettangolo {
    private Punto a, b; // vertici opposti

    public Rettangolo(Punto a, Punto b) {
        this.a = a;
        this.b = b;
    }

    // base = |b.x - a.x|
    private double base() {
        double d = b.getX() - a.getX();
        if (d < 0) d = -d;
        return d;
    }

    // altezza = |b.y - a.y|
    private double altezza() {
        double d = b.getY() - a.getY();
        if (d < 0) d = -d;
        return d;
    }

    public double calcolaPerimetro() {
        return 2 * (base() + altezza());
    }

    public double calcolaArea() {
        return base() * altezza();
    }

    public Rettangolo effettuaTrasla(double dx, double dy) {
        return new Rettangolo(
                new Punto(a.getX() + dx, a.getY() + dy),
                new Punto(b.getX() + dx, b.getY() + dy)
        );
    }

    /** Ritorna true se "this" contiene completamente il rettangolo r */
    public boolean contenuto(Rettangolo r) {
        // --- limiti di "this" ---
        double minXthis, maxXthis, minYthis, maxYthis;

        if (a.getX() < b.getX()) {
            minXthis = a.getX();
            maxXthis = b.getX();
        } else {
            minXthis = b.getX();
            maxXthis = a.getX();
        }

        if (a.getY() < b.getY()) {
            minYthis = a.getY();
            maxYthis = b.getY();
        } else {
            minYthis = b.getY();
            maxYthis = a.getY();
        }

        // --- limiti di r ---
        double minXr, maxXr, minYr, maxYr;

        if (r.a.getX() < r.b.getX()) {
            minXr = r.a.getX();
            maxXr = r.b.getX();
        } else {
            minXr = r.b.getX();
            maxXr = r.a.getX();
        }

        if (r.a.getY() < r.b.getY()) {
            minYr = r.a.getY();
            maxYr = r.b.getY();
        } else {
            minYr = r.b.getY();
            maxYr = r.a.getY();
        }

        // --- verifica contenimento ---
        boolean dentroX = minXr >= minXthis && maxXr <= maxXthis;
        boolean dentroY = minYr >= minYthis && maxYr <= maxYthis;
        return dentroX && dentroY;
    }

    @Override
    public String toString() {
        return "Rettangolo[a=" + a + ", b=" + b + "]";
    }
}