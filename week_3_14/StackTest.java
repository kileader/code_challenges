package week_3_14;

/*
 * 2) Implement a stack that has the following methods:
 * push ( v a 1 ) : push v a 1 onto the stack
 * pop: pop off and return the topmost element of the stack. If there are no elements in the stack, throw an error.
 * max: return the maximum value in the stack currently. If there are no elements in the stack, throw an error.
 * Each method should run in constant time.
 */
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
        myStack.pop();
        System.out.println("myStack.max() -> " + myStack.max());
        Stack emptyStack = new Stack();
        System.out.println("emptyStack.pop() -> " + emptyStack.pop());
//        System.out.println("emptyStack.max() -> " + emptyStack.max());
    }
}
