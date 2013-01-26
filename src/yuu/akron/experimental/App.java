package yuu.akron.experimental;

import com.rits.cloning.Cloner;
import java.io.PrintWriter;
import yuu.akron.ucollection.another.ArrayList;
import yuu.akron.ucollection.interfaces.another.List;
import yuu.akron.ulang.DeepCloneUtils;
import static yuu.akron.ulang.S.S;
import yuu.akron.ulang.StopWatch;
import yuu.akron.ulang.String;

/**
 * 実験のためのクラス
 *
 * @author yuu@akron
 * @since 1.0
 * @version 1.0
 */
public class App {

    private static List<List<List<String>>> list;
    private static PrintWriter pw;
    private static List<List<List<String>>> list2 = null;

    /**
     * いろいろ試すメイン関数
     */
    public static void main(java.lang.String[] args) {

        try {
            pw = S("/Users/yuuakron/test.csv").openPrintWriter();//PrintWriter open
            pw.println("list num,clone,deepClonable,Sirializable,cloner");

        } catch (Exception ex) {}

        for (int i = 1; i < 100; i *= 2) {
            initList(i);
            mesureTime();
        }

        for (int i = 100; i < Integer.MAX_VALUE; i *= 1.1) {
            initList(i);
            mesureTime();
        }

        pw.close();
    }

    public static void initList(int num) {
        list = new ArrayList<List<List<String>>>();
        for (int i = 0; i < num; i++) {
            list.add(new ArrayList<List<String>>(new ArrayList<String>(S("1"))));
        }
        pw.print(num);
    }

    public static void mesureTime() {
        final Cloner cloner = new Cloner();

        ArrayList<StopWatch> swlist = ArrayList.newList(
                new StopWatch() {
                    @Override
                    public void process() {list2 = ((ArrayList) list).clone();}
                },
                new StopWatch() {
                    @Override
                    public void process() {
                        try {
                            list2 = list.deepClone();
                        } catch (Exception ex) {}
                    }
                },
                new StopWatch() {
                    @Override
                    public void process() {
                        try {
                            list2 = DeepCloneUtils.deepCopy(list);
                        } catch (Exception ex) {}
                    }
                },
                new StopWatch() {
                    @Override
                    public void process() {
                        list2 = cloner.deepClone(list);
                    }
                });

        for(StopWatch elem: swlist){
            pw.write("," + elem.mesureTime(1000));
            list2 = null;
        }
        pw.write("\n");
        pw.flush();
    }
}
