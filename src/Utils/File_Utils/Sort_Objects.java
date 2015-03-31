/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils.File_Utils;

import java.lang.reflect.Array;

/**
 *
 * @author sawyera
 */
public class Sort_Objects {
    Load_All_Files file = new Load_All_Files();
    String[] objects;
    String[] tempObjects;
    String[][] ObjectTypes = new String[file.Give_Objects().length][4];

    public String[][] data(){
        objects = file.Give_Objects();
        int B_count =0;
        int O_count = 0;
        int R_count = 0;
        int N_count = 0;
        for(int x= 0;x  != objects.length; x++){
           tempObjects =objects[x].split(":");
           switch(tempObjects[0]){
               case("Building"): ObjectTypes[B_count][0] = tempObjects[1]; B_count++;
               case("Objects"): ObjectTypes[O_count][1] = tempObjects[1]; O_count++;
               case("Reasources"): ObjectTypes[R_count][2] = tempObjects[1]; R_count++;
               case("NPC"): ObjectTypes[N_count][3] = tempObjects[1]; N_count++;
               default : System.err.print("File Error, check Line:" + x); System.console().printf("Error, cannot load Objects", file.get_error());
           }
        }
        
        return ObjectTypes;
    }
}
