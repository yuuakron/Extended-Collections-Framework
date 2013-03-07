package yuu.akron.ulang;

import com.rits.cloning.Cloner;
import java.io.*;

/**
 *
 * @author yuuakron
 */
public class DeepCloneUtils {

    private DeepCloneUtils() {
    }

    public static <T> T deepCopy(T src) throws IOException, CloneNotSupportedException, ClassNotFoundException {
        if (!(src instanceof Serializable)) {
            throw new CloneNotSupportedException("src is not Serializable class");
        }

        ByteArrayOutputStream bout = null;
        ObjectOutputStream oout = null;
        ByteArrayInputStream bin = null;
        ObjectInputStream oin = null;

        try {
            bout = new ByteArrayOutputStream();
            oout = new ObjectOutputStream(bout);
            oout.writeObject(src);
            oout.flush();

            byte[] serialized = bout.toByteArray();

            bin = new ByteArrayInputStream(serialized);
            oin = new ObjectInputStream(bin);
            T copyedObject = (T) oin.readObject();

            return copyedObject;
        } finally {
            bout.close();
            oout.close();
            bin.close();
            oin.close();
        }
    }

    public static <T> T deepCopyWithCloner(T src){
        Cloner cloner = new Cloner();
        return cloner.deepClone(src);
    }
}
