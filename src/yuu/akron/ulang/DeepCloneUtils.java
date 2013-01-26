/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package yuu.akron.ulang;

import java.io.*;

/**
 *
 * @author yuuakron
 */
public class DeepCloneUtils {

    private DeepCloneUtils() {
    }

    public static <T> T deepCopy(T src) throws IOException, ClassNotFoundException {
        if(!(src instanceof Serializable)){
            throw new IOException("not supported");
        }
        
        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        ObjectOutputStream oout = new ObjectOutputStream(bout);
        oout.writeObject(src);
        oout.flush();

        byte[] serialized = bout.toByteArray();

        ByteArrayInputStream bin = new ByteArrayInputStream(serialized);
        ObjectInputStream oin = new ObjectInputStream(bin);
        return (T) oin.readObject();
    }
}
