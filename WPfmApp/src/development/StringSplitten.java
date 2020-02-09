/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package development;

/**
 *
 * @author Paintdog
 */
public class StringSplitten {
    
    public static void main(String[] args) {
        
        String date = "01.01.2020";
        
        // https://stackoverflow.com/questions/23818325/why-is-my-string-length-0-if-i-split-this-string
        String[] datearray = date.split("\\.");
        
        System.out.println("Länge des Arrays datearray: " + datearray.length);        
        
    }
}
