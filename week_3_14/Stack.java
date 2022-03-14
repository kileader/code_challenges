package week_3_14;

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
