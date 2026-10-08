public class Incrocio {

    private Semaforo nord, sud, est, ovest;
    private boolean acceso;


    public Incrocio() {
        nord = new Semaforo();
        sud = new Semaforo();
        est = new Semaforo();
        ovest = new Semaforo();
        acceso = false;
    }


    public void accendi() {
        nord.accendi();
        sud.accendi();
        est.accendi();
        ovest.accendi();
        est.avanza();
        ovest.avanza();
        acceso = true;
    }


    public void spegni() {
        nord.spegni();
        sud.spegni();
        est.spegni();
        ovest.spegni();
        acceso = false;
    }

    public boolean isAcceso() {
        return acceso;
    }


    private Semaforo prendi(char c) {
        if (c == 'N') return nord;
        if (c == 'S') return sud;
        if (c == 'E') return est;
        if (c == 'O') return ovest;
        return null;
    }


    public void avanza(char c) {
        if (!acceso) return;
        Semaforo s = prendi(c);
        if (s == null) return;

        String prima = s.getColore();
        s.avanza();


        boolean verdeNS = nord.getColore().equals("VERDE") || sud.getColore().equals("VERDE");
        boolean verdeEO = est.getColore().equals("VERDE")  || ovest.getColore().equals("VERDE");

        if (verdeNS && verdeEO) {

            s.spegni();
            if (prima.equals("ROSSO")) s.accendi();
            if (prima.equals("VERDE")) { s.accendi(); s.avanza(); }
            if (prima.equals("GIALLO")) { s.accendi(); s.avanza(); s.avanza(); }
        }
    }


    public String getColore(char c) {
        if (!acceso) return "";
        Semaforo s = prendi(c);
        if (s == null) return "";
        return s.getColore();
    }

    public String toString() {

    }
}
