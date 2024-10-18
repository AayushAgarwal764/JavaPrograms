class Animal {
    public void sayHello() {
        System.out.println("Animal says Hello");
    }
}

class Dog extends Animal {

}

public class MainInheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sayHello();
    }
}