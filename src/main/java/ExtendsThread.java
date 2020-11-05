import lombok.extern.log4j.Log4j;

@Log4j
public class ExtendsThread extends Thread {
    private Counter counter;

    public ExtendsThread(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        while (counter.getCount() < 100) {
            counter.increment();
            log.info(counter.getCount());
        }
    }
}
