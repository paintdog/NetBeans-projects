/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vokabeltrainerapp;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author Paintdog
 */
public class VokabelTrainerApp {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        double width  = screenSize.getWidth();
        double height = screenSize.getHeight();
        
        System.out.println("Breite: " + width);
        System.out.println("Höhe:   " + height);
        
        // Main-Window erzeugen
        VokabelTrainerGUI main_window = new VokabelTrainerGUI();
        main_window.setVisible(true);
        main_window.setPreferredSize(new Dimension(400, 300));
        main_window.setLocationRelativeTo(null);
        
        main_window.setVisible(true);
        // main_window.setAlwaysOnTop (true);
        
        
    }
    
}
