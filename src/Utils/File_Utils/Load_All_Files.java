/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils.File_Utils;

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Load_All_Files {
    private String[] Objects;
    File file = new File(Load_All_Files.class.getResource("Mainafest\\Mainafest.ini").getFile());
    private String error;
    public void Load_All_Files(){
       if(!file.canRead())return;
        try {
            BufferedReader buff = new BufferedReader(new FileReader(file));
            String line;
            for(int i = 0; (line =buff.readLine()) != null; i++){
                Objects[i] = line;
            }
        } catch (FileNotFoundException ex) {
            error = ex.getMessage();
            
        } catch (IOException ex) {
           error = ex.getMessage();
        }
        
       
    }
    public String[] Give_Objects(){
        return Objects;
    }
    public String get_error(){
        return error;
    }
}
