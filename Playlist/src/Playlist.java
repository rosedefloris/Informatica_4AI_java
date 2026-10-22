public class Playlist {
    private static final int MAX_CANZONI = 100;

    private String nome;
    private Canzone[] canzoni;
    private int quantiBrani;          // numero effettivo di canzoni presenti
    private int branoCorrente;        // indice 0-based internamente, 1-based verso l'esterno
    private static final int STOP = 0;
    private static final int PLAY = 1;
    private static final int PAUSE = 2;
    private int stato;
    private boolean stopChiamatoDueVolte;

    /** Costruttore: nome + array di canzoni. Stato iniziale STOP. Max 100 brani. */
    public Playlist(String nome, Canzone[] canzoni) {
        this.nome = nome;
        this.canzoni = new Canzone[MAX_CANZONI];
        this.quantiBrani = 0;
        if (canzoni != null) {
            for (int i = 0; i < canzoni.length && quantiBrani < MAX_CANZONI; i++) {
                if (canzoni[i] != null) {
                    this.canzoni[quantiBrani] = canzoni[i];
                    quantiBrani++;
                }
            }
        }
        this.branoCorrente = 1;
        this.stato = STOP;
        this.stopChiamatoDueVolte = false;
    }

    /** Costruttore di copia. */
    public Playlist(Playlist altra) {
        this.nome = altra.nome;
        this.canzoni = new Canzone[MAX_CANZONI];
        this.quantiBrani = altra.quantiBrani;
        for (int i = 0; i < quantiBrani; i++) {
            this.canzoni[i] = altra.canzoni[i];
        }
        this.branoCorrente = altra.branoCorrente;
        this.stato = altra.stato;
        this.stopChiamatoDueVolte = altra.stopChiamatoDueVolte;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantiBrani() {
        return quantiBrani;
    }

    /** Ritorna la canzone all'indice 1-based passato, oppure null se non valido. */
    public Canzone getCanzone(int indice) {
        if (indice < 1 || indice > quantiBrani) {
            return null;
        }
        return canzoni[indice - 1];
    }

    /** Aggiunge una canzone in coda. Ritorna false se la playlist è piena (100). */
    public boolean add(Canzone c) {
        if (c == null || quantiBrani >= MAX_CANZONI) {
            return false;
        }
        canzoni[quantiBrani] = c;
        quantiBrani++;
        return true;
    }

    /** Somma delle durate di tutti i brani. */
    public Duration durataTotale() {
        int totSecondi = 0;
        for (int i = 0; i < quantiBrani; i++) {
            totSecondi += canzoni[i].getDurata().toSecondi();
        }
        return new Duration(totSecondi / 60, totSecondi % 60);
    }

    public void play() {
        stato = PLAY;
        stopChiamatoDueVolte = false;
    }

    public void pause() {
        if (stato == PLAY) {
            stato = PAUSE;
        }
        stopChiamatoDueVolte = false;
    }

    public void stop() {
        if (stato == STOP) {
            if (stopChiamatoDueVolte) {
                branoCorrente = 1;
            }
            stopChiamatoDueVolte = true;
        } else {
            stato = STOP;
            stopChiamatoDueVolte = true;
        }
    }

    public void branoSuccessivo() {
        if (quantiBrani == 0) return;
        if (branoCorrente >= quantiBrani) {
            branoCorrente = 1;
        } else {
            branoCorrente++;
        }
    }

    public void branoPrecedente() {
        if (quantiBrani == 0) return;
        if (branoCorrente <= 1) {
            branoCorrente = quantiBrani;
        } else {
            branoCorrente--;
        }
    }

    @Override
    public String toString() {
        String statoStr;
        if (stato == PLAY) {
            statoStr = "PLAY";
        } else if (stato == PAUSE) {
            statoStr = "PAUSE";
        } else {
            statoStr = "STOP";
        }

        StringBuilder sb = new StringBuilder();
        sb.append("Playlist ").append(nome).append(", ")
                .append(quantiBrani).append(" brani, in ")
                .append(statoStr);

        Canzone corrente = getCanzone(branoCorrente);
        if (corrente != null) {
            sb.append(" sul brano ").append(corrente.getTitolo())
                    .append(" di ").append(corrente.getArtista());
        }
        return sb.toString();
    }
}