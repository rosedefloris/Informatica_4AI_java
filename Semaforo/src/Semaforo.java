public class Semaforo {
    private boolean acceso;
    private String colore;

    public Semaforo() {
        this.acceso = false;
        this.colore = "";
    }

    public void accendi() {
        this.acceso = true;
        this.colore = "VERDE";
    }

    public void spegni() {
        this.acceso = false;
    }

    public void toggle() {
        if (this.acceso) {
            this.spegni();
        } else {
            this.accendi();
        }
    }

    public void avanza() {
        if (!this.acceso) {
            return;
        }
        if (this.colore.equals("VERDE")) {
            this.colore = "GIALLO";
        } else if (this.colore.equals("GIALLO")) {
            this.colore = "ROSSO";
        } else if (this.colore.equals("ROSSO")) {
            this.colore = "VERDE";
        }
    }

    public boolean Acceso() {
        return this.acceso;
    }

    public String Colore() {
        if (this.acceso) {
            return this.colore;
        } else {
            return "";
        }
    }

    @Override
    public String toString() {
        if (this.acceso) {
            return "Il semaforo è acceso sul  " + this.colore;
        } else {
            return "Il semaforo è spento";
        }
    }
}