public class Main {
    public static void main(String[] args) {


        Punto p1 = new Punto();
        System.out.println("p1 (vuoto): " + p1);
        Punto p2 = new Punto(3, 4);
        System.out.println("p2: " + p2);
        Punto p3 = new Punto(p2);
        System.out.println("p3 (copia di p2): " + p3);
        System.out.println("Distanza p1-p2: " + p1.distanza(p2))
        Punto medio = p1.puntoMedio(p2);
        System.out.println("Punto medio p1-p2: " + medio);
        Punto p4 = new Punto(1, 0);
        System.out.println("p4 prima: " + p4);
        p4.ruota(90);
        System.out.println("p4 dopo ruota(90): " + p4);
        Punto p5 = new Punto(2, 0);
        p5.ruota(180);
        System.out.println("p5 (2,0) ruotato di 180: " + p5);
    }
}
