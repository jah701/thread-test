import lombok.extern.log4j.Log4j;

@Log4j
public class ImplRunnable implements Runnable {
    private Counter counter;

    public ImplRunnable(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        while (counter.getCount() < 100) {
            counter.increment();
            log.info(counter.getCount());
        }
    }
}
