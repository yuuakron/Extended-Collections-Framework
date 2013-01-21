/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package yuu.akron.ulang;

import java.io.*;
import java.net.*;
import java.nio.charset.Charset;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.Locale;
import java.util.regex.Pattern;

/**
 *
 * @author yuuakron
 */
public class StringWithUtility implements Serializable, Comparable<String>, CharSequence {

    //    private static final long serialVersionUID = 1L;
    private String str;

    public StringWithUtility() {
        str = new String();
    }

    public StringWithUtility(String string) {
        str = string.trim();
    }

    public StringWithUtility(char[] chars) {
        str = new String(chars);
    }

    public StringWithUtility(char[] chars, int i, int i1) {
        str = new String(chars, i, i1);
    }

    public StringWithUtility(int[] ints, int i, int i1) {
        str = new String(ints, i, i1);
    }

    /*
     * @Deprecated public StringWithUtility(byte[] bytes, int i, int i1, int i2)
     * { str = new String(bytes,i,i1,i2); }
     *
     * @Deprecated public StringWithUtility(byte[] bytes, int i) { str = new
     * String(bytes,i); }
     */
    public StringWithUtility(byte[] bytes, int i, int i1, String string) throws UnsupportedEncodingException {
        str = new String(bytes, i, i1, string);
    }

    public StringWithUtility(byte[] bytes, int i, int i1, Charset chrst) {
        str = new String(bytes, i, i1, chrst);
    }

    public StringWithUtility(byte[] bytes, String string) throws UnsupportedEncodingException {
        str = new String(bytes, string);
    }

    public StringWithUtility(byte[] bytes, Charset chrst) {
        str = new String(bytes, chrst);
    }

    public StringWithUtility(byte[] bytes, int i, int i1) {
        str = new String(bytes, i, i1);
    }

    public StringWithUtility(byte[] bytes) {
        str = new String(bytes);
    }

    public StringWithUtility(StringBuffer sb) {
        str = new String(sb);
    }

    public StringWithUtility(StringBuilder sb) {
        str = new String(sb);
    }

    private static yuu.akron.ulang.another.String Downcast(String str) {
        return new yuu.akron.ulang.another.String(str);
    }

    private static yuu.akron.ulang.another.String[] Downcast(String[] str) {
        yuu.akron.ulang.another.String[] array = new yuu.akron.ulang.another.String[str.length];

        for (int i = 0; i < str.length; i++) {
            array[i] = Downcast(str[i]);
        }
        return array;
    }

    public static yuu.akron.ulang.another.String valueOf(double d) {
        return Downcast(String.valueOf(d));
    }

    public static yuu.akron.ulang.another.String valueOf(float f) {
        return Downcast(String.valueOf(f));
    }

    public static yuu.akron.ulang.another.String valueOf(long l) {
        return Downcast(String.valueOf(l));
    }

    public static yuu.akron.ulang.another.String valueOf(int i) {
        return Downcast(String.valueOf(i));
    }

    public static yuu.akron.ulang.another.String valueOf(char c) {
        return Downcast(String.valueOf(c));
    }

    public static yuu.akron.ulang.another.String valueOf(boolean bln) {
        return Downcast(String.valueOf(bln));
    }

    public static yuu.akron.ulang.another.String valueOf(char[] chars, int i, int i1) {
        return Downcast(String.valueOf(chars, i, i1));
    }

    public static yuu.akron.ulang.another.String valueOf(char[] chars) {
        return Downcast(String.valueOf(chars));
    }

    public static yuu.akron.ulang.another.String valueOf(Object o) {
        return Downcast(String.valueOf(o));
    }

    public yuu.akron.ulang.another.String trim() {
        return Downcast(str.trim());
    }

    public yuu.akron.ulang.another.String toUpperCase() {
        return Downcast(str.toUpperCase());
    }

    public yuu.akron.ulang.another.String toUpperCase(Locale locale) {
        return Downcast(str.toUpperCase(locale));
    }

    @Override
    public String toString() {
        return str.toString();
    }

    public yuu.akron.ulang.another.String toAnotherString() {
        return Downcast(str.toString());
    }

    public yuu.akron.ulang.another.String toLowerCase() {
        return Downcast(str.toLowerCase());
    }

    public yuu.akron.ulang.another.String toLowerCase(Locale locale) {
        return Downcast(str.toLowerCase(locale));
    }

    public char[] toCharArray() {
        return str.toCharArray();
    }

    public yuu.akron.ulang.another.String substring(int i, int i1) {
        return Downcast(str.substring(i, i1));
    }

    public yuu.akron.ulang.another.String substring(int i) {
        return Downcast(str.substring(i));
    }

    @Override
    public CharSequence subSequence(int i, int i1) {
        return str.subSequence(i, i1);
    }

    public boolean startsWith(String string) {
        return str.startsWith(string);
    }

    public boolean startsWith(String string, int i) {
        return str.startsWith(string, i);
    }

    public yuu.akron.ulang.another.String[] split(String string) {
        return Downcast(str.split(string));
    }

    public yuu.akron.ulang.another.String[] split(String string, int i) {
        return Downcast(str.split(string, i));
    }

    public yuu.akron.ulang.another.String replaceFirst(String string, String string1) {
        return Downcast(str.replaceFirst(string, string1));
    }

    public yuu.akron.ulang.another.String replaceAll(String string, String string1) {
        return Downcast(str.replaceAll(string, string1));
    }

    public yuu.akron.ulang.another.String replace(CharSequence cs, CharSequence cs1) {
        return Downcast(str.replace(cs, cs1));
    }

    public yuu.akron.ulang.another.String replace(char c, char c1) {
        return Downcast(str.replace(c, c1));
    }

    public boolean regionMatches(boolean bln, int i, String string, int i1, int i2) {
        return str.regionMatches(bln, i, string, i1, i2);
    }

    public boolean regionMatches(int i, String string, int i1, int i2) {
        return str.regionMatches(i, string, i1, i2);
    }

    public int offsetByCodePoints(int i, int i1) {
        return str.offsetByCodePoints(i, i1);
    }

    public boolean matches(String string) {
        return str.matches(string);
    }

    @Override
    public int length() {
        return str.length();
    }

    public int lastIndexOf(String string, int i) {
        return str.lastIndexOf(string, i);
    }

    public int lastIndexOf(String string) {
        return str.lastIndexOf(string);
    }

    public int lastIndexOf(int i, int i1) {
        return str.lastIndexOf(i, i1);
    }

    public int lastIndexOf(int i) {
        return str.lastIndexOf(i);
    }

    public boolean isEmpty() {
        return str.isEmpty();
    }

    public yuu.akron.ulang.another.String intern() {
        return Downcast(str.intern());
    }

    public int indexOf(String string, int i) {
        return str.indexOf(string, i);
    }

    public int indexOf(String string) {
        return str.indexOf(string);
    }

    public int indexOf(int i, int i1) {
        return str.indexOf(i, i1);
    }

    public int indexOf(int i) {
        return str.indexOf(i);
    }

    @Override
    public int hashCode() {
        return str.hashCode();
    }

    public void getChars(int i, int i1, char[] chars, int i2) {
        str.getChars(i, i1, chars, i2);
    }

    public byte[] getBytes() {
        return str.getBytes();
    }

    public byte[] getBytes(Charset chrst) {
        return str.getBytes(chrst);
    }

    public byte[] getBytes(String string) throws UnsupportedEncodingException {
        return str.getBytes(string);
    }
    /*
     * @Deprecated public void getBytes(int i, int i1, byte[] bytes, int i2) {
     * str.getBytes(i, i1, bytes, i2); }
     */

    public static yuu.akron.ulang.another.String format(Locale locale, String string, Object... os) {
        return Downcast(String.format(locale, string, os));
    }

    public static yuu.akron.ulang.another.String format(String string, Object... os) {
        return Downcast(String.format(string, os));
    }

    public boolean equalsIgnoreCase(String string) {
        return str.equalsIgnoreCase(string);
    }

    @Override
    public boolean equals(Object o) {
        return str.equals(o);
    }

    public boolean endsWith(String string) {
        return str.endsWith(string);
    }

    public static yuu.akron.ulang.another.String copyValueOf(char[] chars) {
        return Downcast(String.copyValueOf(chars));
    }

    public static yuu.akron.ulang.another.String copyValueOf(char[] chars, int i, int i1) {
        return Downcast(String.copyValueOf(chars, i, i1));
    }

    public boolean contentEquals(CharSequence cs) {
        return str.contentEquals(cs);
    }

    public boolean contentEquals(StringBuffer sb) {
        return str.contentEquals(sb);
    }

    public boolean contains(CharSequence cs) {
        return str.contains(cs);
    }

    public yuu.akron.ulang.another.String concat(String string) {
        return Downcast(str.concat(string));
    }

    public int compareToIgnoreCase(String string) {
        return str.compareToIgnoreCase(string);
    }

    @Override
    public int compareTo(String string) {
        return str.compareTo(string);
    }

    public int codePointCount(int i, int i1) {
        return str.codePointCount(i, i1);
    }

    public int codePointBefore(int i) {
        return str.codePointBefore(i);
    }

    public int codePointAt(int i) {
        return str.codePointAt(i);
    }

    @Override
    public char charAt(int i) {
        return str.charAt(i);
    }

    /*
     * added methods
     */
    //system
    public void sout() {
        System.out.println(str);
    }

    public void sout(Object... args) {
        System.out.printf(str, args);
    }

    public void p() {
        System.out.println(str);
    }

    public void p(Object... args) {
        System.out.printf(str, args);
    }

    //lang
    public StringBuilder toStrBuilder() {
        return new StringBuilder(str);
    }

    public StringBuffer toStrBuffer() {
        return new StringBuffer(str);
    }

    public boolean toBoolean() {
        return Boolean.getBoolean(str);
    }

    public byte toByte() {
        return Byte.parseByte(str);
    }

    public byte toByte(int i) {
        return Byte.parseByte(str, i);
    }

    public short toShort() {
        return Short.parseShort(str);
    }

    public short toShort(int i) {
        return Short.parseShort(str, i);
    }

    public int toInt() {
        return Integer.parseInt(str);
    }

    public int toInt(int i) {
        return Integer.parseInt(str, i);
    }

    public long toLong() {
        return Long.parseLong(str);
    }

    public long toLong(int i) {
        return Long.parseLong(str, i);
    }

    public float toFloat() {
        return Float.parseFloat(str);
    }

    public double toDouble() {
        return Double.parseDouble(str);
    }

    //io
    public File openFile() {
        return new File(str);
    }

    public BufferedReader openBufferedFileReader(String charset) throws UnsupportedEncodingException, FileNotFoundException {
        return new BufferedReader(new InputStreamReader(new FileInputStream(str), charset));
    }

    public BufferedReader openBufferedFileReader() throws FileNotFoundException {
        return new BufferedReader(new FileReader(str));
    }

    public BufferedWriter openBufferedFileWriter(boolean append, String charset) throws UnsupportedEncodingException, FileNotFoundException {
        return new BufferedWriter(new OutputStreamWriter(new FileOutputStream(str, append), charset));
    }

    public BufferedWriter openBufferedFileWriter(boolean append) throws IOException {
        return new BufferedWriter(new FileWriter(str, append));
    }

    public BufferedWriter openBufferedFileWriter(String charset) throws UnsupportedEncodingException, FileNotFoundException {
        return new BufferedWriter(new OutputStreamWriter(new FileOutputStream(str), charset));
    }

    public BufferedWriter openBufferedFileWriter() throws IOException {
        return new BufferedWriter(new FileWriter(str));
    }

    public PrintWriter openPrintWriter() throws IOException {
        return new PrintWriter(new BufferedWriter(new FileWriter(str)));
    }

    public PrintWriter openPrintWriter(boolean append) throws IOException {
        return new PrintWriter(new BufferedWriter(new FileWriter(str, append)));
    }

    public PrintWriter openPrintWriter(String charset) throws UnsupportedEncodingException, FileNotFoundException {
        return new PrintWriter(new BufferedWriter(new OutputStreamWriter(new FileOutputStream(str), charset)));
    }

    public PrintWriter openPrintWriter(boolean append, String charset) throws UnsupportedEncodingException, FileNotFoundException {
        return new PrintWriter(new BufferedWriter(new OutputStreamWriter(new FileOutputStream(str, append), charset)));
    }

    public BufferedInputStream openBufferedInputStream() throws FileNotFoundException {
        return new BufferedInputStream(new FileInputStream(str));
    }

    public BufferedOutputStream openBufferedOutputStream() throws FileNotFoundException {
        return new BufferedOutputStream(new FileOutputStream(str));
    }

    public BufferedOutputStream openBufferedOutputStream(boolean append) throws FileNotFoundException {
        return new BufferedOutputStream(new FileOutputStream(str, append));
    }

    //regex
    public Pattern toPattern() {
        return Pattern.compile(str);
    }

    public Pattern toPattern(int i) {
        return Pattern.compile(str, i);
    }

    //text
    public Date toDate() throws ParseException {
        DateFormat df = DateFormat.getDateInstance();
        return df.parse(str);
    }

    public Date toDate(ParsePosition pos) {
        DateFormat df = DateFormat.getDateInstance();
        return df.parse(str, pos);
    }

    //net
    public URL toURL() throws MalformedURLException {
        return new URL(str);
    }

    public URI toURI() throws URISyntaxException {
        return new URI(str);
    }

    public URLConnection openURLConnection() throws MalformedURLException, IOException {
        URL url = new URL(str);
        return url.openConnection();
    }

    public HttpURLConnection openHttpURLConnection() throws MalformedURLException, IOException {
        URL url = new URL(str);
        return (HttpURLConnection) url.openConnection();
    }

    public JarURLConnection openJarURLConnection() throws MalformedURLException, IOException {
        URL url = new URL(str);
        return (JarURLConnection) url.openConnection();
    }

    public Socket openSocket(int port) throws UnknownHostException, IOException {
        return new Socket(str, port);
    }

    public String toURLDecodeString(String enc) throws UnsupportedEncodingException {
        return URLDecoder.decode(str, enc);
    }

    public String toURLEncodeString(String enc) throws UnsupportedEncodingException {
        return URLEncoder.encode(str, enc);
    }
}
