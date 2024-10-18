class Test extends Thread {
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + " : " + i);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

public class MainThread {
    public static void main(String[] args) throws InterruptedException {
        Test t = new Test();
        Test u = new Test();
        t.start();
        u.start();

    }
}