/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import java.io.File;
import java.net.URL;

/**
 *
 * @author sawyera
 */
public class Game {
    
    public String MainDirectory(){
        URL main = Game.class.getResource("Main.class");
        if (!"file".equalsIgnoreCase(main.getProtocol()))
         throw new IllegalStateException("Main class is not stored in a file.");
        File path = new File(main.getPath());
        return path.getPath();
    }
    public static void main(String[] args){
        
    }
}
