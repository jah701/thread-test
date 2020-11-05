public class Main {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Thread extendsThread = new ExtendsThread(counter);
        Runnable implRunnable = new ImplRunnable(counter);
        Thread thread = new Thread(implRunnable);
        extendsThread.start();
        thread.start();
    }
}
