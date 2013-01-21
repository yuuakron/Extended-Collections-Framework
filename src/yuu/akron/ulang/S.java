/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package yuu.akron.ulang;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/**
 *
 * @author yuuakron
 */
public class S extends StringWithUtility {

    public S() {
        super();
    }

    public S(java.lang.String string) {
        super(string);
    }

    public S(char[] chars) {
        super(chars);
    }

    public S(char[] chars, int i, int i1) {
        super(chars, i, i1);
    }

    public S(int[] ints, int i, int i1) {
        super(ints, i, i1);
    }

    /*
     * @Deprecated public S(byte[] bytes, int i, int i1, int i2) {
     * super(bytes,i,i1,i2); }
     *
     * @Deprecated public S(byte[] bytes, int i) { super(bytes,i); }
     */
    public S(byte[] bytes, int i, int i1, java.lang.String string) throws UnsupportedEncodingException {
        super(bytes, i, i1, string);
    }

    public S(byte[] bytes, int i, int i1, Charset chrst) {
        super(bytes, i, i1, chrst);
    }

    public S(byte[] bytes, java.lang.String string) throws UnsupportedEncodingException {
        super(bytes, string);
    }

    public S(byte[] bytes, Charset chrst) {
        super(bytes, chrst);
    }

    public S(byte[] bytes, int i, int i1) {
        super(bytes, i, i1);
    }

    public S(byte[] bytes) {
        super(bytes);
    }

    public S(StringBuffer sb) {
        super(sb);
    }

    public S(StringBuilder sb) {
        super(sb);
    }
}
