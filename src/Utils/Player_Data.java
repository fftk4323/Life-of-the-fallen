/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import com.jme3.export.JmeExporter;
import com.jme3.export.JmeImporter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sawyera
 */
public class Player_Data {
    Edit_Player_Data data;
    public void Save(Invitory inv){
        data = new Edit_Player_Data();
        try {
            data.write((JmeExporter) inv);
        } catch (IOException ex) {
            Logger.getLogger(Player_Data.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void Read(Invitory inv){
        data = new Edit_Player_Data();
        try
        {
            data.read((JmeImporter) inv);
            
        } catch (IOException ex) {
            Logger.getLogger(Player_Data.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
