public class Acquisto {
    private String nome; //"private" nasconde la variabile
    private int nPezzi;
    private float costo;

    public float getCostoTotale(){
        return this.nPezzi * this.costo; // "this." permette di ritornare un valore privato/nascosto
    }
}
