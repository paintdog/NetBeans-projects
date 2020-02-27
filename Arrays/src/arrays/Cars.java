/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

/**
 *
 * @author Paintdog
 */
public class Cars {
    
    protected String[] cars = {"BMW", "Daimler", "VW"};
    
    /*
     * Gibt die Autos in der Garage aus.
     */ 
    public void ausgeben() {
        for (int i=0; i < cars.length; i++) {
            System.out.println("* " + cars[i]);
        }
    }
    
    /*
     * Fügt ein Auto der Garage hinzu.
     */
    public void hinzufuegen(String car) {
        String[] cars_temp = new String[cars.length + 1];
        for (int i = 0; i < cars.length; i++) {
            cars_temp[i] = cars[i];
        }
        cars_temp[cars.length] = car;
        cars = new String[cars_temp.length];
        cars = cars_temp;
    }
    
    /*
     * Löscht ein Auto aus der Garage.
     */
    public void loeschen(String car) {
        int anzahl = zaehlen(car);
        int position = 0;
        String[] cars_temp = new String[cars.length - anzahl];
        for (int i = 0; i < cars.length; i++) {
            if (!cars[i].equals(car)) {
                cars_temp[position] = cars[i];
                position += 1;
            }
        }
        cars = new String[cars_temp.length];
        cars = cars_temp;
    }
    
    /*
     * Zählt, wie oft ein Auto in der Garage steht.
     */
    public int zaehlen(String car) {
        int zaehler = 0;
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].equals(car)) {
                zaehler += 1;
            }
        }
        return zaehler;
    }
    
    public Cars () {
        System.out.println("Objekt erzeugt.");
    };
    
    public static void main(String[] args) {
        
        System.out.println("== Anwendung CARS ==");
        Cars cars = new Cars();
        cars.ausgeben(); 
        
        System.out.println("\n=== Step 1: Hinzufügen ===");
        cars.hinzufuegen("Audi");
        cars.hinzufuegen("Opel");
        cars.hinzufuegen("Opel");
        cars.ausgeben();        
        
        System.out.println("\n=== Step 2: Löschen ===");
        cars.loeschen("Opel");
        cars.ausgeben();
        
        System.out.println("\n=== Step 3: Zählen ===");
        System.out.println("Anzahl der BMWs in der Garage: " + cars.zaehlen("BMW"));
        
        System.out.println("\n=== Step 4: Hinzufügen und Zählen ===");
        cars.hinzufuegen("BMW");
        cars.hinzufuegen("BMW");
        cars.ausgeben();        
        System.out.println("Anzahl der BMWs in der Garage: " + cars.zaehlen("BMW"));
        
    }
}
