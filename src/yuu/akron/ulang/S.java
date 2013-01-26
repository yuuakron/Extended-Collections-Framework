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
public class S extends String {

    public S() {
        super();
    }

    public S(String string) {
        super(string);
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

    public static S S() {
        return new S();
    }

    public static S S(String string) {
        return new S(string);
    }

    public static S S(java.lang.String string) {
        return new S(string);
    }
    
    public static String[] S(java.lang.String... string) {
        return downcast(string);
    }

    public static S S(char[] chars) {
        return new S(chars);
    }

    public static S S(char[] chars, int i, int i1) {
        return new S(chars, i, i1);
    }

    public static S S(int[] ints, int i, int i1) {
        return new S(ints, i, i1);
    }

    /*
     * @Deprecated public static S S(byte[] bytes, int i, int i1, int i2) {
     * return new S(bytes,i,i1,i2); }
     *
     * @Deprecated public static S S(byte[] bytes, int i) { return new
     * S(bytes,i); }
     */
    public static S S(byte[] bytes, int i, int i1, java.lang.String string) throws UnsupportedEncodingException {
        return new S(bytes, i, i1, string);
    }

    public static S S(byte[] bytes, int i, int i1, Charset chrst) {
        return new S(bytes, i, i1, chrst);
    }

    public static S S(byte[] bytes, java.lang.String string) throws UnsupportedEncodingException {
        return new S(bytes, string);
    }

    public static S S(byte[] bytes, Charset chrst) {
        return new S(bytes, chrst);
    }

    public static S S(byte[] bytes, int i, int i1) {
        return new S(bytes, i, i1);
    }

    public static S S(byte[] bytes) {
        return new S(bytes);
    }

    public static S S(StringBuffer sb) {
        return new S(sb);
    }

    public static S S(StringBuilder sb) {
        return new S(sb);
    }
}
