public class Semaforo {

    private int stato;

    public Semaforo() {
        stato = 0;
    }

    public void accendi() {
        stato = 1;
    }

    public void spegni() {
        stato = 0;
    }

    public void avanza() {
        if (stato == 0) {
            return; }
        if (stato == 1) {
            stato = 2; }
        else if (stato == 2){
            stato = 3;}
        else if (stato == 3) {
            stato = 1;}
    }

    public boolean isAcceso() {
        return stato != 0;
    }

    public String getColore() {
        if (stato == 0) return "SPENTO";
        if (stato == 1) return "ROSSO";
        if (stato == 2) return "VERDE";
        return "GIALLO";
    }

    public String toString() {
        return getColore();
    }
}
