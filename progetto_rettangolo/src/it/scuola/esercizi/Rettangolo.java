package it.scuola.esercizi;


public class Rettangolo {
    private double x1, y1, x2, y2;


    public Rettangolo(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
            this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double getBase() {
        double b = x2 - x1;
        if (b < 0) {
              b *= -1;
        }
        return b;
    }

    public double getAltezza() {
        double h = y2 - y1;
        if (h < 0) {
                  h *= -1;
        }
        return h;
    }

    public double getArea(){
        double base = getBase();
        double altezza = getAltezza();
        return base * altezza;
    }

    public double getPerimetro(){
        double b= getBase();
        double h= getAltezza();

        return (b*2)+(h*2);

    }
}