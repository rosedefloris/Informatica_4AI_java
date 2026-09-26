public class Studente {
    String nome;
    String cognome;
    int eta;
    double altezza;
    double peso;

    // Costruttore con parametri
    public Studente(String nome, String cognome, int eta, double altezza, double peso) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
        this.altezza = altezza;
        this.peso = peso;
    }

    // Costruttore
    public Studente() {
    }

    public double calcolaIndice() {
        double BMI;
        BMI = (this.peso) / ((this.altezza / 100) * (this.altezza / 100));
        if (BMI < 18.5) {
            System.out.println("Sottopeso");
        } else if (BMI >= 18.5 && BMI <= 24.9) {
            System.out.println("Normopeso");
        } else if (BMI >= 25 && BMI <= 29.9) {
            System.out.println("Sovrappeso");
        } else {
            System.out.println("Obesita");
        }
        return BMI;
    }

    // Metodo toString
    @Override
    public String toString() {
        String s = "I dati dello studente sono: ";
        s += this.nome + ", " + this.cognome + ", " + this.eta + " anni, " + (this.altezza / 100) + " m, " + this.peso + " kg";
        return s;
    }
}