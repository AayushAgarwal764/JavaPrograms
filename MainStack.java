class Stack {
    private int[] array;
    private int topPosition;
    private int capacity;

    Stack(int size) {
        array = new int[size];
        capacity = size;
        topPosition = -1;
    }

    public void push(int element) {
        if (isFull()) {
            System.out.println("The Stack is full, element could not be inserted");
        } else {
            topPosition = topPosition + 1;
            array[topPosition] = element;
        }
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("The Stack is empty, no element was removed");
        } else {
            topPosition = topPosition - 1;
        }
    }

    public boolean isEmpty() {
        return (this.topPosition == -1);
    }

    public boolean isFull() {
        return (this.topPosition == this.capacity - 1);
    }

    public int peek() {
        return this.array[topPosition];
    }

    public void printStack() {

        if (isEmpty()) {
            System.out.println("Stack is Empty");
        } else {
            for (int i = 0; i <= topPosition; i++) {
                System.out.print(this.array[i]);
                if (i != topPosition) {
                    System.out.print("-->");
                }
            }
            System.out.println();
        }
    }
}

public class MainStack {
    public static void main(String[] args) {
        Stack s1 = new Stack(10);
        s1.printStack();

        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.printStack();
        System.out.println(s1.peek());

        s1.pop();
        s1.printStack();

        s1.pop();
        s1.printStack();

        s1.pop();
        s1.printStack();

        s1.pop();
        s1.printStack();

        s1.pop();
        s1.printStack();

    }

}