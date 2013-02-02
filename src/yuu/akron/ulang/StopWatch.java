package yuu.akron.ulang;

/**
 *
 * @author yuuakron
 */
public class StopWatch implements Measurable {

    private final Measurable mesua;
    private long order = TimeOrder.Nano.order();

    public enum TimeOrder {

        Nano(1),
        Micro(1000),
        Mili(1000000),
        Sec(1000000000);
        private final long order;

        TimeOrder(long order) {
            this.order = order;
        }

        private long order() {
            return order;
        }
    }

    public StopWatch() {
        mesua = this;
    }

    public StopWatch(long timeorder) {
        mesua = this;
        this.order = timeorder;
    }

    public StopWatch(TimeOrder order) {
        mesua = this;
        this.order = order.order();
    }

    public StopWatch(Measurable m) {
        mesua = m;
    }

    public StopWatch(Measurable m, long timeorder) {
        mesua = m;
        this.order = timeorder;
    }

    public StopWatch(Measurable m, TimeOrder order) {
        mesua = m;
        this.order = order.order();
    }

    public void setTimeOrder(long timeorder) {
        this.order = timeorder;
    }

    public void setTimeOrder(TimeOrder order) {
        this.order = order.order();
    }

    public long mesureTime() {
        long start = System.nanoTime();
        mesua.process();
        long end = System.nanoTime();
        return (end - start) / order;
    }

    public long mesureTime(long timeorder) {
        long start = System.nanoTime();
        mesua.process();
        long end = System.nanoTime();
        return (end - start) / timeorder;
    }

    public long mesureTime(TimeOrder order) {
        long start = System.nanoTime();
        mesua.process();
        long end = System.nanoTime();
        return (end - start) / order.order();
    }

    @Override
    public void process() {
    }
}