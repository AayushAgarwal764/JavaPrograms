class A {
    A() {
        System.out.println("Constructor for A called");
    }
}

class B extends A {
    B() {
        super();

        System.out.println("Constructor for B called");
    }

    public void sayHello() {
        System.out.println("Hello");
    }
}

public class MainSuperKeyword {
    public static void main(String[] args) {
        B b = new B();
        b.sayHello();
    }
}
