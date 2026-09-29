public class Main {
    public static void main(String[] args) {
        LampadinaIntelligente l = new LampadinaIntelligente(40);
        l.setNome("camera");
        l.accendi();System.out.println(l);
        l.aumentaIlluminazione();
        l.setColore("giallo");
        System.out.println(l);
        LampadinaIntelligente copia = new LampadinaIntelligente(l);
        copia.spegni();
        System.out.println(copia);

    }

