public class Main {
    public static void main(String[] args) {

        GeneratoreAutoIncrementale generatore = new GeneratoreAutoIncrementale("ABC", 4);

        System.out.println("Test:");

        System.out.println("Primo codice: " + generatore.genera());

        System.out.println("Secondo codice: " + generatore.genera());

        System.out.println("Terzo codice: " + generatore.genera());

        System.out.println("Quarto codice: " + generatore.genera());

        System.out.println("Informazioni generatore:");
        System.out.println(generatore);
    }
}