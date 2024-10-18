class Test extends Thread {
    public void run() {
        System.out.println("1");
    }
}

public class MainThreadName {
    public static void main(String[] args) {
        Test thread1 = new Test();
        System.out.println(Thread.currentThread().getName());
        thread1.start();
        System.out.println(Thread.currentThread().getName());
    }
}