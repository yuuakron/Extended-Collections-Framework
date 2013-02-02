package yuu.akron.ulang;

import java.io.*;
import java.net.*;
import java.nio.charset.Charset;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.*;
import java.util.regex.Pattern;

/**
 *
 * @author yuuakron
 */
public class String implements DeepClonable{

    //    private static final long serialVersionUID = 1L;
    private final java.lang.String str;

    public String() {
        str = new java.lang.String();
    }

    public String(String string) {
        str = string.toString();
    }

    public String(java.lang.String string) {
        str = string;
    }

    public String(char[] chars) {
        str = new java.lang.String(chars);
    }

    public String(char[] chars, int i, int i1) {
        str = new java.lang.String(chars, i, i1);
    }

    public String(int[] ints, int i, int i1) {
        str = new java.lang.String(ints, i, i1);
    }

    /*
     * @Deprecated public StringWithUtility(byte[] bytes, int i, int i1, int i2)
     * { str = new String(bytes,i,i1,i2); }
     *
     * @Deprecated public StringWithUtility(byte[] bytes, int i) { str = new
     * String(bytes,i); }
     */
    public String(byte[] bytes, int i, int i1, java.lang.String string) throws UnsupportedEncodingException {
        str = new java.lang.String(bytes, i, i1, string);
    }

    public String(byte[] bytes, int i, int i1, Charset chrst) {
        str = new java.lang.String(bytes, i, i1, chrst);
    }

    public String(byte[] bytes, java.lang.String string) throws UnsupportedEncodingException {
        str = new java.lang.String(bytes, string);
    }

    public String(byte[] bytes, Charset chrst) {
        str = new java.lang.String(bytes, chrst);
    }

    public String(byte[] bytes, int i, int i1) {
        str = new java.lang.String(bytes, i, i1);
    }

    public String(byte[] bytes) {
        str = new java.lang.String(bytes);
    }

    public String(StringBuffer sb) {
        str = new java.lang.String(sb);
    }

    public String(StringBuilder sb) {
        str = new java.lang.String(sb);
    }

    public static String valueOf(double d) {
        return downcast(java.lang.String.valueOf(d));
    }

    public static String valueOf(float f) {
        return downcast(java.lang.String.valueOf(f));
    }

    public static String valueOf(long l) {
        return downcast(java.lang.String.valueOf(l));
    }

    public static String valueOf(int i) {
        return downcast(java.lang.String.valueOf(i));
    }

    public static String valueOf(char c) {
        return downcast(java.lang.String.valueOf(c));
    }

    public static String valueOf(boolean bln) {
        return downcast(java.lang.String.valueOf(bln));
    }

    public static String valueOf(char[] chars, int i, int i1) {
        return downcast(java.lang.String.valueOf(chars, i, i1));
    }

    public static String valueOf(char[] chars) {
        return downcast(java.lang.String.valueOf(chars));
    }

    public static String valueOf(Object o) {
        return downcast(java.lang.String.valueOf(o));
    }

    public String trim() {
        return downcast(str.trim());
    }

    public String toUpperCase() {
        return downcast(str.toUpperCase());
    }

    public String toUpperCase(Locale locale) {
        return downcast(str.toUpperCase(locale));
    }

    @Override
    public java.lang.String toString() {
        return str;
    }

    public String toAnotherString() {
        return this;
    }

    public String toLowerCase() {
        return downcast(str.toLowerCase());
    }

    public String toLowerCase(Locale locale) {
        return downcast(str.toLowerCase(locale));
    }

    public char[] toCharArray() {
        return str.toCharArray();
    }

    public String substring(int i, int i1) {
        return downcast(str.substring(i, i1));
    }

    public String substring(int i) {
        return downcast(str.substring(i));
    }

    public CharSequence subSequence(int i, int i1) {
        return str.subSequence(i, i1);
    }

    public boolean startsWith(String string) {
        return str.startsWith(string.toString());
    }

    public boolean startsWith(String string, int i) {
        return str.startsWith(string.toString(), i);
    }

    public String[] split(String string) {
        return downcast(str.split(string.toString()));
    }

    public String[] split(String string, int i) {
        return downcast(str.split(string.toString(), i));
    }

    public String replaceFirst(String string, String string1) {
        return downcast(str.replaceFirst(string.toString(), string1.toString()));
    }

    public String replaceAll(String string, String string1) {
        return downcast(str.replaceAll(string.toString(), string1.toString()));
    }

    public String replace(CharSequence cs, CharSequence cs1) {
        return downcast(str.replace(cs, cs1));
    }

    public String replace(char c, char c1) {
        return downcast(str.replace(c, c1));
    }

    public boolean regionMatches(boolean bln, int i, String string, int i1, int i2) {
        return str.regionMatches(bln, i, string.toString(), i1, i2);
    }

    public boolean regionMatches(int i, String string, int i1, int i2) {
        return str.regionMatches(i, string.toString(), i1, i2);
    }

    public int offsetByCodePoints(int i, int i1) {
        return str.offsetByCodePoints(i, i1);
    }

    public boolean matches(String string) {
        return str.matches(string.toString());
    }

    public int length() {
        return str.length();
    }

    public int lastIndexOf(String string, int i) {
        return str.lastIndexOf(string.toString(), i);
    }

    public int lastIndexOf(String string) {
        return str.lastIndexOf(string.toString());
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

    public String intern() {
        return downcast(str.intern());
    }

    public int indexOf(String string, int i) {
        return str.indexOf(string.toString(), i);
    }

    public int indexOf(String string) {
        return str.indexOf(string.toString());
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

    public byte[] getBytes(java.lang.String string) throws UnsupportedEncodingException {
        return str.getBytes(string.toString());
    }
    /*
     * @Deprecated public void getBytes(int i, int i1, byte[] bytes, int i2) {
     * str.getBytes(i, i1, bytes, i2); }
     */

    public static String format(Locale locale, String string, Object... os) {
        return downcast(java.lang.String.format(locale, string.toString(), os));
    }

    public static String format(String string, Object... os) {
        return downcast(java.lang.String.format(string.toString(), os));
    }

    public boolean equalsIgnoreCase(String string) {
        return str.equalsIgnoreCase(string.toString());
    }

    @Override
    public boolean equals(Object o) {
        return str.equals(o);
    }

    public boolean endsWith(String string) {
        return str.endsWith(string.toString());
    }

    public static String copyValueOf(char[] chars) {
        return downcast(java.lang.String.copyValueOf(chars));
    }

    public static String copyValueOf(char[] chars, int i, int i1) {
        return downcast(java.lang.String.copyValueOf(chars, i, i1));
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

    public String concat(String string) {
        return downcast(str.concat(string.toString()));
    }

    public int compareToIgnoreCase(String string) {
        return str.compareToIgnoreCase(string.toString());
    }

    public int compareTo(String string) {
        return str.compareTo(string.toString());
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

    public char charAt(int i) {
        return str.charAt(i);
    }

    public int compareTo(java.lang.String string) {
        return str.compareTo(string);
    }

    public int compareToIgnoreCase(java.lang.String string) {
        return str.compareToIgnoreCase(string);
    }

    public String concat(java.lang.String string) {
        return downcast(str.concat(string));
    }

    public boolean endsWith(java.lang.String string) {
        return str.endsWith(string);
    }

    public boolean equalsIgnoreCase(java.lang.String string) {
        return str.equalsIgnoreCase(string);
    }

    public int indexOf(java.lang.String string, int i) {
        return str.indexOf(string, i);
    }

    public int indexOf(java.lang.String string) {
        return str.indexOf(string);
    }

    public int lastIndexOf(java.lang.String string, int i) {
        return str.lastIndexOf(string, i);
    }

    public int lastIndexOf(java.lang.String string) {
        return str.lastIndexOf(string);
    }

    public boolean matches(java.lang.String string) {
        return str.matches(string);
    }

    public boolean regionMatches(boolean bln, int i, java.lang.String string, int i1, int i2) {
        return str.regionMatches(bln, i, string, i1, i2);
    }

    public boolean regionMatches(int i, java.lang.String string, int i1, int i2) {
        return str.regionMatches(i, string, i1, i2);
    }

    public String replaceAll(String string, java.lang.String string1) {
        return downcast(str.replaceAll(string.toString(), string1));
    }

    public String replaceAll(java.lang.String string, String string1) {
        return downcast(str.replaceAll(string, string1.toString()));
    }

    public String replaceAll(java.lang.String string, java.lang.String string1) {
        return downcast(str.replaceAll(string, string1));
    }

    public String replaceFirst(String string, java.lang.String string1) {
        return downcast(str.replaceFirst(string.toString(), string1));
    }

    public String replaceFirst(java.lang.String string, java.lang.String string1) {
        return downcast(str.replaceFirst(string, string1));
    }

    public String replaceFirst(java.lang.String string, String string1) {
        return downcast(str.replaceFirst(string, string1.toString()));
    }

    public String[] split(java.lang.String string) {
        return downcast(str.split(string));
    }

    public String[] split(java.lang.String string, int i) {
        return downcast(str.split(string, i));
    }

    public boolean startsWith(java.lang.String string) {
        return str.startsWith(string);
    }

    public boolean startsWith(java.lang.String string, int i) {
        return str.startsWith(string, i);
    }

    /*
     * added methods
     */
    //deepclone
    @Override
    public String deepClone() throws IOException, ClassNotFoundException {
        return this;
    }

    //convert function
    public static String downcast(java.lang.String str) {
        return new S(str);
    }

    public static String[] downcast(java.lang.String... str) {
        String[] array = new S[str.length];

        for (int i = 0; i < str.length; i++) {
            array[i] = downcast(str[i]);
        }
        return array;
    }

    public static Iterable<String> downcast(Iterable<java.lang.String> iterable) {
        return downcast(iterable);
    }

    public static Collection<String> downcast(Collection<java.lang.String> collection) {
        return downcast(collection);
    }

    public static List<String> downcast(List<java.lang.String> list) {
        List<String> list2 = new ArrayList<String>();

        for (java.lang.String elem : list) {
            list2.add(downcast(elem));
        }
        return list2;
    }

    public static Set<String> downcast(Set<java.lang.String> set) {
        Set<String> set2 = new HashSet<String>();

        for (java.lang.String elem : set) {
            set2.add(downcast(elem));
        }
        return set2;
    }

    public static <T> Map<String, T> downcastForMapKey(Map<java.lang.String, T> map) {
        Map<String, T> map2 = new HashMap<String, T>();

        for (Map.Entry<java.lang.String, T> elem : map.entrySet()) {
            map2.put(downcast(elem.getKey()), elem.getValue());
        }
        return map2;
    }

    public static <T> Map<T, String> downcastForMapValue(Map<T, java.lang.String> map) {
        Map<T, String> map2 = new HashMap<T, String>();

        for (Map.Entry<T, java.lang.String> elem : map.entrySet()) {
            map2.put(elem.getKey(), downcast(elem.getValue()));
        }
        return map2;
    }

    public static Map<String, String> downcastForMapKeyandValue(Map<java.lang.String, java.lang.String> map) {
        Map<String, String> map2 = new HashMap<String, String>();

        for (Map.Entry<java.lang.String, java.lang.String> elem : map.entrySet()) {
            map2.put(downcast(elem.getKey()), downcast(elem.getValue()));
        }
        return map2;
    }

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

    public static void sout(Object s) {
        System.out.println(s);
    }

    public static void sout(java.lang.String s, Object... args) {
        System.out.printf(s, args);
    }

    public static void p(Object s) {
        System.out.println(s);
    }

    public static void p(java.lang.String s, Object... args) {
        System.out.printf(s, args);
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
    public File toFile() {
        return new File(str);
    }

    public String toAbsolutePath(){
        return downcast(new File(str).getAbsolutePath());
    }
    
    public String toFileName(){
        return downcast(new File(str).getName());
    }
    
    public String toParentPath(){
        return downcast(new File(str).getParent());
    }

    public String toPathExtension(){
        String strs[] = split("\\.");

        return strs[strs.length - 1];
    }
    
    public BufferedReader openBufferedFileReader(java.lang.String charset) throws UnsupportedEncodingException, FileNotFoundException {
        return new BufferedReader(new InputStreamReader(new FileInputStream(str), charset));
    }

    public BufferedReader openBufferedFileReader() throws FileNotFoundException {
        return new BufferedReader(new FileReader(str));
    }

    public BufferedWriter openBufferedFileWriter(boolean append, java.lang.String charset) throws UnsupportedEncodingException, FileNotFoundException {
        return new BufferedWriter(new OutputStreamWriter(new FileOutputStream(str, append), charset));
    }

    public BufferedWriter openBufferedFileWriter(boolean append) throws IOException {
        return new BufferedWriter(new FileWriter(str, append));
    }

    public BufferedWriter openBufferedFileWriter(java.lang.String charset) throws UnsupportedEncodingException, FileNotFoundException {
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

    public PrintWriter openPrintWriter(java.lang.String charset) throws UnsupportedEncodingException, FileNotFoundException {
        return new PrintWriter(new BufferedWriter(new OutputStreamWriter(new FileOutputStream(str), charset)));
    }

    public PrintWriter openPrintWriter(boolean append, java.lang.String charset) throws UnsupportedEncodingException, FileNotFoundException {
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

    public String toURLDecodeString(java.lang.String enc) throws UnsupportedEncodingException {
        return downcast(URLDecoder.decode(str, enc));
    }

    public String toURLEncodeString(java.lang.String enc) throws UnsupportedEncodingException {
        return downcast(URLEncoder.encode(str, enc));
    }
}
