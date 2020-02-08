package noten;

/**
 * @author Paintdog
 */
public class Noten {

    protected int[] notenliste = new int[0];
    protected double zwischennote_1 = Double.NaN;
    protected double zwischennote_2 = Double.NaN;
    protected double gesamtnote = Double.NaN;

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
    
    public double bilde_gesamtnote() {
        // Fall 1: Nur eine Zwischennote
        if (!Double.isNaN(zwischennote_1) && Double.isNaN(zwischennote_2)) {
            gesamtnote = zwischennote_1;
        // Fall 2: Zwei Zwischennoten
        } else if (!Double.isNaN(zwischennote_1) && !Double.isNaN(zwischennote_2)) {
            gesamtnote = (zwischennote_1 + zwischennote_2) / 2;
        // Keine Zwischennote
        } else if (Double.isNaN(zwischennote_1) && Double.isNaN(zwischennote_2)) {
            return Double.NaN;
        }
        clear();
        return gesamtnote;
    }
    
    public double bilde_zwischennote() {
        int summe = 0;
        if (notenliste.length == 0) {
            return Double.NaN;
        }        
        for (int i = 0; i < notenliste.length; i++) {
            summe = summe + notenliste[i];
        }
        if (Double.isNaN(zwischennote_1)) {
            zwischennote_1 = summe / notenliste.length;
            notenliste = new int[0];
            return zwischennote_1;
        } else if (Double.isNaN(zwischennote_2)) {
            zwischennote_2 = summe / notenliste.length;
            notenliste = new int[0];
            return zwischennote_2;
        } else {
            System.out.println("Ein Fehler ist aufgetreten!"); 
        }
        System.out.println("Zwischenote (1): " + zwischennote_1);
        System.out.println("Zwischenote (2): " + zwischennote_2);
        return Double.NaN;
    }

    public void clear() {
        int[] notenliste = new int[0];
        zwischennote_1 = Double.NaN;
        zwischennote_2 = Double.NaN;
    }
    
    /*
    public static void main(String[] args) {
        Noten noten = new Noten();
        
        noten.add(15);
        noten.add(10);
        noten.add(5);
        double zwischennote_1 = noten.bilde_zwischennote();
        System.out.println("Zwischennote: " + zwischennote_1);
        
        noten.add(12);
        noten.add(14);
        double zwischennote_2 = noten.bilde_zwischennote();
        System.out.println("Zwischennote: " + zwischennote_2);
        
        double gesamtnote = noten.bilde_gesamtnote();
        System.out.println("Gesamtnote [Kontrolle]: " + ((zwischennote_1 + zwischennote_2) / 2));
        System.out.println("Gesamtnote: " + gesamtnote);
        
    }
    */
}