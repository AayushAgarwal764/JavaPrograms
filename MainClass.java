class Animal {
    private String animal_name;
    private int animal_age;
    private String animal_color;

    Animal(String animal_name, int animal_age, String animal_color) {
        this.animal_name = animal_name;
        this.animal_age = animal_age;
        this.animal_color = animal_color;
    }

    public void setAnimalName(String animal_name) {
        this.animal_name = animal_name;
    }

    public String getAnimalName() {
        return this.animal_name;
    }

    public void setAnimalAge(int animal_age) {
        this.animal_age = animal_age;
    }

    public int getAnimalAge() {
        return this.animal_age;
    }

    public void setAnimalColor(String animal_color) {
        this.animal_color = animal_color;
    }

    public String getAnimalColor() {
        return this.animal_color;
    }

    public void sayHello() {
        System.out.println("Hello, My name is " + this.getAnimalName());
        System.out.println("My age is " + this.getAnimalAge() + " and my color is " + this.getAnimalColor());
    }
}

public class MainClass {
    public static void main(String[] args) {
        Animal tom = new Animal("Tom", 10, "Black");

        tom.sayHello();
    }
}
