import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Playlist playlist = null;
Boolean uscita=false;
        while (uscita!=true) {
            System.out.println("MENU PLAYLIST");
            System.out.println("1 Crea playlist");
            System.out.println("2 Play");
            System.out.println("3 Pause");
            System.out.println("4Stop");
            System.out.println("5 Brano successivo");
            System.out.println("6 Brano precedente");
            System.out.println("7 Mostra stato playlist");
            System.out.println("8 Duplica playlist (copia)");
            System.out.println("0 Esci");
            int scelta;
                scelta = sc.nextInt();
            if (scelta == 0) {
                System.out.println(" ");
                uscita = true;
                break;
            }
            else if (scelta == 1) {
                System.out.print("Nome playlist: ");
                String nome = sc.next();
                System.out.print("Numero brani: ");
                int n=sc.nextInt();
                playlist = new Playlist(nome, n);
                System.out.println("Playlist creata.");
                System.out.println(playlist);
            } else
            {

                if (scelta == 2) {
                    playlist.play();
                        System.out.println("Stato: " + playlist);
                }
                else if (scelta == 3) {
                    playlist.pause();
                    System.out.println("Stato: " + playlist);
                } else if (scelta == 4) {
                         playlist.stop();
                    System.out.println("Stato: " + playlist);


                } else if (scelta == 5) {
                    playlist.branoSuccessivo();
                    System.out.println("Stato: " + playlist);
                } else if (scelta == 6) {
                    playlist.branoPrecedente();
                    System.out.println("Stato: " + playlist);

                } else if (scelta == 7) {
                    System.out.println(playlist);
                } else if (scelta == 8) {
                    Playlist copia = new Playlist(playlist);
                    System.out.println("Copia creata: " + copia);

                }
                else {
                    System.out.println("Scelta non valida.");
                }
            }
        }

    }
}
