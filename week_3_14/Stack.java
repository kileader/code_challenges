package week_3_14;

/*
 * 2) Implement a stack that has the following methods:
 * push ( v a 1 ) : push v a 1 onto the stack
 * pop: pop off and return the topmost element of the stack. If there are no elements in the stack, throw an error.
 * max: return the maximum value in the stack currently. If there are no elements in the stack, throw an error.
 * Each method should run in constant time.
 */
public class Stack {
    private Stack previous;
    private int value;
    
    Stack() {}
    
    Stack(int value) {
        this.value = value;
    }
    
    Stack(Stack previous, int value) {
        this.previous = previous;
        this.value = value;
    }
    
    public void push(int value) {
        this.previous = new Stack(this.previous, this.value);
        this.value = value;
    }
    
    public int pop() {
        if (this.previous == null) {
            throw new IllegalArgumentException("Stack is empty");
        }
        int top = this.value;
        this.value = this.previous.value;
        this.previous = this.previous.previous;
        return top;
    }
    
    public int max() {
        if (this.previous == null) {
            throw new IllegalArgumentException("Stack is empty");
        }
        Stack clone = this;
        int top = clone.pop();
        int max = top;
        while (clone.previous != null) {
            top = clone.pop();
            if (top > max) {
                max = top;
            }
        }
        return max;
    }
}
