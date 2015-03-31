/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;


import com.jme3.export.InputCapsule;
import com.jme3.export.JmeExporter;
import com.jme3.export.JmeImporter;
import com.jme3.export.OutputCapsule;
import com.jme3.export.Savable;
import com.jme3.material.Material;
import java.io.IOException;

public class Edit_Player_Data implements Savable {
    private int      someIntValue;   // some custom user data
    private float    someFloatValue; // some custom user data
    private Material someJmeObject;  // some custom user data

    public void write(JmeExporter ex) throws IOException {
        OutputCapsule capsule = ex.getCapsule(this);
        capsule.write(someIntValue,   "someIntValue",   1);
        capsule.write(someFloatValue, "someFloatValue", 0f);
        capsule.write(someJmeObject,  "someJmeObject",  new Material());
    }

    public void read(JmeImporter im) throws IOException {
        InputCapsule capsule = im.getCapsule(this);
        someIntValue   = capsule.readInt(    "someIntValue",   1);
        someFloatValue = capsule.readFloat(  "someFloatValue", 0f);
        someJmeObject  = (Material) capsule.readSavable("someJmeObject",  new Material());
    }
}
