/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import com.jme3.scene.Spatial;
import java.io.File;
import java.io.FileReader;

/**
 *
 * @author sawyera
 */
public class World_Tile extends Game{
    
    String reasource;
    public void Get_Data(){
    reasource = MainDirectory();
    }
    public Spatial[]  Get_Item(String Name){
    
        World_Tile.class.getResource(reasource + "\\" +Name);
        
        return null;
        
    }
}
