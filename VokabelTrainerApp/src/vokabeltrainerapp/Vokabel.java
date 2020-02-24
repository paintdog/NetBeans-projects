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
public class Vokabel {
    
    protected String vokabel;
    protected String bedeutung;
    protected int stufe;
    protected Long date;
    protected int[] richtig_falsch;
    
    public String getBedeutung() {
        return bedeutung;
    }

    public int getStufe() {
        return stufe;
    }
    
    public String getVobabel() {
        return vokabel;
    }

    public void setBedeutung(String bedeutung) {
        bedeutung = bedeutung;
    }
        
    public void setStufe(int stufe) {
        stufe = stufe;
    }
       
    public void setVokabel(String vokabel) {
        vokabel = vokabel;
    }
    
    public void changeStufe(int wert) {
        if (stufe + wert > 5 || stufe + wert < 1) {
            System.out.println("Änderung kann nicht vorgenommen werden.");
        } else {
            stufe += wert;
        }
    }
    
    Vokabel(String vokabel, String bedeutung) {
        vokabel = vokabel;
        bedeutung = bedeutung;
        stufe = 1;
        date = System.currentTimeMillis();
        
    }
    
    public static void main (String[] args) {
        Vokabel vokabel = new Vokabel("salutare", "grüßen");
        System.out.println(vokabel.getStufe());                      // 1
        
        vokabel.changeStufe(1);
        System.out.println(vokabel.getStufe());                      // 2
        vokabel.changeStufe(1);
        System.out.println(vokabel.getStufe());                      // 3
        vokabel.changeStufe(1);
        System.out.println(vokabel.getStufe());                      // 4
        vokabel.changeStufe(1);
        System.out.println(vokabel.getStufe());                      // 5
        vokabel.changeStufe(1);
        System.out.println(vokabel.getStufe());                      // 6
        vokabel.changeStufe(-4);
        System.out.println(vokabel.getStufe());                      // 1  
        vokabel.changeStufe(-1);
        System.out.println(vokabel.getStufe());                      // 0  
    }
    
}
