/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package yuu.akron.ulang.another;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import yuu.akron.ulang.S;

/**
 *
 * @author yuuakron
 */
public class String extends S {

    public String() {
        super();
    }

    public String(java.lang.String string) {
        super(string);
    }

    public String(char[] chars) {
        super(chars);
    }

    public String(char[] chars, int i, int i1) {
        super(chars, i, i1);
    }

    public String(int[] ints, int i, int i1) {
        super(ints, i, i1);
    }

    /*
     * @Deprecated public String(byte[] bytes, int i, int i1, int i2)
     * { super(bytes,i,i1,i2); }
     *
     * @Deprecated public String(byte[] bytes, int i) {
     * super(bytes,i); }
     */
    
    public String(byte[] bytes, int i, int i1, java.lang.String string) throws UnsupportedEncodingException {
        super(bytes, i, i1, string);
    }

    public String(byte[] bytes, int i, int i1, Charset chrst) {
        super(bytes, i, i1, chrst);
    }

    public String(byte[] bytes, java.lang.String string) throws UnsupportedEncodingException {
        super(bytes, string);
    }

    public String(byte[] bytes, Charset chrst) {
        super(bytes, chrst);
    }

    public String(byte[] bytes, int i, int i1) {
        super(bytes, i, i1);
    }

    public String(byte[] bytes) {
        super(bytes);
    }

    public String(StringBuffer sb) {
        super(sb);
    }

    public String(StringBuilder sb) {
        super(sb);
    }
}
