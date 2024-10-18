class Test1 extends Thread {
    public void run() {
        System.out.println("This line is from Test1 via Thread Class");
    }
}

class Test2 extends Thread {
    public void run() {
        System.out.println("This line is from Test2 via Thread Class");
    }
}

public class MainThreadDemo {
    public static void main(String[] args) {
        Test1 test1Object1 = new Test1();
        test1Object1.start();

        Test1 test1Object2 = new Test1();
        Test1 test1Object3 = new Test1();

        test1Object2.start();
        test1Object3.start();

        Test1 test1Object4 = new Test1();
        Test2 test2Object1 = new Test2();

        test1Object4.start();
        test2Object1.start();

    }
}