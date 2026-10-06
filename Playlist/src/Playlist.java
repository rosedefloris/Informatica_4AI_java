public class Playlist {
    private String nome;
    private int quantiBrani;
    private int branoCorrente;
    private static final int STOP = 0;
    private static final int PLAY = 1;
    private static final int PAUSE = 2;
    private int stato;
    private boolean stopChiamatoDueVolte;


    public Playlist(String nome, int quantiBrani) {
        this.nome = nome;
        this.quantiBrani = quantiBrani;
        this.branoCorrente = 1;
        this.stato = STOP;
        this.stopChiamatoDueVolte = false;
    }


    public Playlist(Playlist altra) {
        this.nome = altra.nome;
        this.quantiBrani = altra.quantiBrani;
        this.branoCorrente = altra.branoCorrente;
        this.stato = altra.stato;
        this.stopChiamatoDueVolte = altra.stopChiamatoDueVolte;
    }

    public String Nome() {
        return nome;
    }

    public int QuantiBrani() {
        return quantiBrani;
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
        if (branoCorrente == quantiBrani) {
            branoCorrente = 1;
        } else {
            branoCorrente++;
        }
    }

    public void branoPrecedente() {
        if (branoCorrente == 1) {
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
        return "Playlist " + nome + ", " + quantiBrani + " brani, in " + statoStr +
                " sul brano " + branoCorrente;
    }
}