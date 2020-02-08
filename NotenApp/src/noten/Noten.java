package noten;

/**
 * @author Paintdog
 */
public class Noten {
    
    protected int[] notenliste = new int[0];
    
    public void add(int punkte) {
        System.out.println("Ich füge hinzu: " + punkte);
        if (notenliste.length == 0) {
           System.out.println("Array ist leer.");
           notenliste = new int[1];
           notenliste[0] = punkte;
        } else {
            int[] notenliste_neu = new int[notenliste.length + 1];
            for (int i = 0; i < notenliste.length; i++) {
                notenliste_neu[i] = notenliste[i];
            }
            notenliste_neu[notenliste_neu.length - 1] = punkte;
            notenliste = notenliste_neu;
        }
        for (int i = 0; i < notenliste.length; i++) {
            System.out.println("Inhalt: " + notenliste[i]);
        }
    }
    
    public double zwischennote_bilden() {
        int summe = 0;
        for (int i = 0; i < notenliste.length; i++) {
            summe = summe + notenliste[i];
        }
        return summe / notenliste.length;
    }
    
    public static void main(String[] args) {
        Noten noten = new Noten();
        noten.add(15);
        noten.add(10);
        noten.add(5);
        double zwischennote = noten.zwischennote_bilden();
        System.out.println("Zwischennote: " + zwischennote);
    }
}
