public class Main {
    public static void main(String[] args) {
        Studente s = new Studente("Ale","Lel",18,163.3, 52);
        Studente b = new Studente("Ela","Lel",18,163.3, 52);

        System.out.println(s);
        double bmi = s.calcolaIndice();
        System.out.println(b);
        double bbmi = b.calcolaIndice();
    }
}
// cin = nome = sc.Next();
//cognome =sc.nextInt()