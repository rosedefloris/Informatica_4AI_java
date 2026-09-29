public class LampadinaIntelligente {
    private int potenza;          // in Watt
    private int illuminazione;    // 0..100
    private String colore;        // es. "bianco", "giallo", "blu"
    private String nome;          // assegnato quando aggiunta al sistema
    private boolean accesa;       // stato on/off

    public LampadinaIntelligente(int potenza) {
        this.potenza = potenza;
        this.illuminazione = 50;
        this.colore = "bianco";
        this.nome = null;       // non ha ancora un nome
        this.accesa = false;    // di default spenta
    }

    public LampadinaIntelligente(LampadinaIntelligente altra) {
        this.potenza = altra.potenza;
        this.illuminazione = altra.illuminazione;
        this.colore = altra.colore;
        this.nome = altra.nome;
        this.accesa = altra.accesa;
    }

    // Get e set per il nome
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    public String getColore() {
        return colore;
    }
    public void setColore(String colore) {
        this.colore = colore;
    }
    public int getPotenza() {
        return potenza;
    }

    public int getIlluminazione() {
        return illuminazione;
    }

    public boolean isAccesa() {
        return accesa;
    }


    public void accendi() {
        this.accesa = true;
    }


    public void spegni() {
        this.accesa = false;
    }

    // Aumenta l'illuminazione del 10%
    public void aumentaIlluminazione() {
        if (illuminazione < 100) {
            illuminazione += 10;
            if (illuminazione > 100) {
                illuminazione = 100;
            }
        }
    }

    public void diminuisciIlluminazione() {
        if (illuminazione > 0) {
            illuminazione -= 10;
            if (illuminazione < 0) {
                illuminazione = 0;
            }
        }
    }

    @Override
    public String toString() {
        String stato = accesa ? "accesa" : "spenta";
        String nomeMostrato = (nome == null || nome.isEmpty()) ? "non assegnato" : nome;
        return "Nome: " + nomeMostrato +
                ", Potenza: " + potenza + " watt" +
                ", Stato: " + stato +
                ", Qta: " + illuminazione + "%" +
                ", Colore: " + colore;
    }
}
