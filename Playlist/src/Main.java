import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Playlist playlist = null;
        boolean uscita = false;

        while (!uscita) {
            System.out.println("\n=== MENU PLAYLIST ===");
            System.out.println("1  Crea playlist (con brani di esempio)");
            System.out.println("2  Play");
            System.out.println("3  Pause");
            System.out.println("4  Stop");
            System.out.println("5  Brano successivo");
            System.out.println("6  Brano precedente");
            System.out.println("7  Mostra stato playlist");
            System.out.println("8  Duplica playlist (copia)");
            System.out.println("9  Aggiungi canzone");
            System.out.println("10 Mostra canzone per indice");
            System.out.println("11 Mostra durata totale");
            System.out.println("12 Test automatico di tutti i metodi");
            System.out.println("0  Esci");
            System.out.print("Scelta: ");

            int scelta;
            try {
                scelta = Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Inserisci un numero valido.");
                continue;
            }

            if (scelta == 0) {
                uscita = true;
                System.out.println("Arrivederci!");
                break;
            }

            if (scelta == 1) {
                System.out.print("Nome playlist: ");
                String nome = sc.nextLine().trim();

                Canzone[] iniziali = {
                        new Canzone("Suspicious Minds", new Duration(4, 22), "Elvis Presley"),
                        new Canzone("Imagine", new Duration(3, 5), "John Lennon"),
                        new Canzone("Hotel California", new Duration(6, 30), "Eagles")
                };
                playlist = new Playlist(nome, iniziali);
                System.out.println("Playlist creata.");
                System.out.println(playlist);
                continue;
            }

            if (scelta == 12) {
                testAutomatico();
                continue;
            }

            if (playlist == null) {
                System.out.println("Crea prima una playlist (opzione 1).");
                continue;
            }

            switch (scelta) {
                case 2:
                    playlist.play();
                    System.out.println("Stato: " + playlist);
                    break;
                case 3:
                    playlist.pause();
                    System.out.println("Stato: " + playlist);
                    break;
                case 4:
                    playlist.stop();
                    System.out.println("Stato: " + playlist);
                    break;
                case 5:
                    playlist.branoSuccessivo();
                    System.out.println("Stato: " + playlist);
                    break;
                case 6:
                    playlist.branoPrecedente();
                    System.out.println("Stato: " + playlist);
                    break;
                case 7:
                    System.out.println(playlist);
                    break;
                case 8: {
                    Playlist copia = new Playlist(playlist);
                    System.out.println("Copia creata: " + copia);
                    break;
                }
                case 9: {
                    System.out.print("Titolo: ");
                    String t = sc.nextLine().trim();
                    System.out.print("Minuti: ");
                    int m = Integer.parseInt(sc.nextLine().trim());
                    System.out.print("Secondi: ");
                    int s = Integer.parseInt(sc.nextLine().trim());
                    System.out.print("Artista: ");
                    String a = sc.nextLine().trim();
                    boolean ok = playlist.add(new Canzone(t, new Duration(m, s), a));
                    System.out.println(ok ? "Canzone aggiunta." : "Impossibile aggiungere (playlist piena).");
                    break;
                }
                case 10: {
                    System.out.print("Indice canzone (1-based): ");
                    int idx = Integer.parseInt(sc.nextLine().trim());
                    Canzone c = playlist.getCanzone(idx);
                    System.out.println(c != null ? c : "Indice non valido (null).");
                    break;
                }
                case 11:
                    System.out.println("Durata totale: " + playlist.durataTotale());
                    break;
                default:
                    System.out.println("Scelta non valida.");
            }
        }
        sc.close();
    }

    /** Test automatico che esercita tutti i metodi definiti. */
    private static void testAutomatico() {
        System.out.println("\n--- TEST AUTOMATICO ---");

        Canzone c1 = new Canzone("Suspicious Minds", new Duration(4, 22), "Elvis Presley");
        Canzone c2 = new Canzone("Imagine", new Duration(3, 5), "John Lennon");
        System.out.println("toString Canzone:\n" + c1);

        Playlist p = new Playlist("Rock anni sessanta", new Canzone[]{c1, c2});
        System.out.println("\nPlaylist iniziale: " + p);
        System.out.println("Stato iniziale (deve essere STOP): " + p);

        System.out.println("getCanzone(1): " + (p.getCanzone(1) != null ? p.getCanzone(1).getTitolo() : "null"));
        System.out.println("getCanzone(0): " + p.getCanzone(0));   // null
        System.out.println("getCanzone(99): " + p.getCanzone(99)); // null

        System.out.println("add nuova canzone: " + p.add(new Canzone("Hotel California", new Duration(6, 30), "Eagles")));
        System.out.println("Brani ora: " + p.getQuantiBrani());
        System.out.println("Durata totale: " + p.durataTotale());

        p.play();
        System.out.println("Dopo play: " + p);
        p.pause();
        System.out.println("Dopo pause: " + p);
        p.branoSuccessivo();
        System.out.println("Dopo next: " + p);
        p.branoPrecedente();
        System.out.println("Dopo prev: " + p);
        p.stop();
        System.out.println("Dopo stop: " + p);

        Playlist copia = new Playlist(p);
        System.out.println("Copia: " + copia);

        // Test limite 100
        Playlist grande = new Playlist("Test 100", new Canzone[]{});
        for (int i = 0; i < 100; i++) {
            grande.add(new Canzone("Brano" + i, new Duration(1, 0), "Artista" + i));
        }
        System.out.println("Aggiunta 101-esima (deve essere false): "
                + grande.add(new Canzone("Extra", new Duration(1, 0), "X")));
        System.out.println("--- FINE TEST ---\n");
    }
}