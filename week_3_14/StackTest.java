package week_3_14;

public class StackTest {
    public static void main(String[] args) {
        Stack myStack = new Stack();
        myStack.push(99);
        myStack.push(1);
        myStack.push(8);
        myStack.push(10);
        System.out.println("myStack.pop() -> " + myStack.pop());
        myStack.push(10);
        System.out.println("myStack.max() -> " + myStack.max());
        myStack.push(100);
        System.out.println("myStack.max() -> " + myStack.max());
        Stack emptyStack = new Stack();
        System.out.println("emptyStack.pop() -> " + emptyStack.pop());
//        System.out.println("emptyStack.max() -> " + emptyStack.max());
    }
}
