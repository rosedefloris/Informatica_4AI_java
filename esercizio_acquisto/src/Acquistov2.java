public class Acquistov2 {
    private String nome2;
    private int nPezzi2;
    private float costo2;

    public float Costotot(){
        float totale =0;
        for (int i =0 ; i<this.nPezzi2 ; i++){
            totale += this.costo2;
        }
        return totale;
    }
}
