/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vokabeltrainerapp;

/**
 *
 * @author Paintdog
 */
public class VokabelTrainer {
        
    private String vokabelpaket;
    
    public void load() {
        int i = 0;
    }
    
    public void save() {
        int i = 0;
    }
    
    public void close() {
        int i = 0;
    }
    
    public String getVokabelPaket() {
        return vokabelpaket;
    }
    
    VokabelTrainer(String vokabelpaketname) {
        vokabelpaket = vokabelpaketname;
    }
    
    public static void main (String[] args) {
        
        VokabelTrainer voktrainer;
        voktrainer = new VokabelTrainer("Latein-Deutsch");
        System.out.println(voktrainer.getVokabelPaket());
        
        
    }
}
