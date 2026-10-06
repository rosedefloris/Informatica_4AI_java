public class Frazione {
    int numeratore;
    int denominatore;
    public Frazione(int numeratore,int denominatore){
        this.numeratore=numeratore;
        this.denominatore=denominatore;
    }

    private static int mcd(int a, int b){
       // if (b==0){
       //     return a;
       // }
        int r = a % b;
        while(r!=0) {
            r = a % b;
            a = b;
            b = r;
        }
        return a;

    }

    public void semplificaFrazione(){
        int c = mcd(this.numeratore, this.denominatore);
        numeratore /= c;
        denominatore /=c;
    }
    @Override
    public String toString (){
        return numeratore + "/" + denominatore;
    }
}
