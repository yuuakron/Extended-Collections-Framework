/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package yuu.akron.ulang;

import java.io.IOException;

/**
 *
 * @author yuuakron
 */
public interface DeepClonable{
    public Object deepClone() throws IOException, ClassNotFoundException ;
}
