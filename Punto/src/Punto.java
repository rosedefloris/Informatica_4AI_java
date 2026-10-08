public class Punto {

    private double x;
    private double y;

    public Punto() {
        x = 0;
        y = 0;
    }


    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }


    public Punto(Punto altro) {
        this.x = altro.x;
        this.y = altro.y;
    }


    public double distanza(Punto altro) {
        double dx = this.x - altro.x;
        double dy = this.y - altro.y;
        return Math.sqrt(dx * dx + dy * dy);
    }


    public Punto puntoMedio(Punto altro) {
        double mx = (this.x + altro.x) / 2;
        double my = (this.y + altro.y) / 2;
        return new Punto(mx, my);
    }


    public void ruota(double alpha) {
        double rad = Math.toRadians(alpha);
        double cos = Math.cos(rad);
        double sin = Math.sin(rad);

        double nx = x * cos - y * sin;
        double ny = x * sin + y * cos;

        x = nx;
        y = ny;
    }


    public double getX() { return x; }
    public double getY() { return y; }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}