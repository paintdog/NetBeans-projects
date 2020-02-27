/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filereaderwriterapp;

import java.io.File;
import java.io.IOException;

import java.nio.file.Files;
import java.nio.file.Path;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Paintdog
 */
public class LoadingTextfile {
    
    protected String[] content;
    
    public String[] laden() throws IOException {
        Path filePath = new File("src\\filereaderwriterapp\\text.txt").toPath();     
        List<String> stringList = Files.readAllLines(filePath);
        String[] stringArray = stringList.toArray(new String[]{});
        return stringArray;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LoadingTextfile app = new LoadingTextfile();
        try {
            String[] content = app.laden();
            for (int i = 0; i < content.length; i++) {
                System.out.println(content[i]);
            }
        } catch (IOException ex) {
            Logger.getLogger(LoadingTextfile.class.getName()).log(Level.SEVERE, null, ex);
        }       
    }
    
}
