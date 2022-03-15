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
    private int maxValue;
    private boolean redoMax;
    
    Stack() {}
    
    Stack(int value) {
        setValueAndMax(value);
        redoMax = false;
    }
    
    Stack(Stack previous, int value) {
        this.previous = previous;
        setValueAndMax(value);
    }
    
    public void push(int value) {
        this.previous = new Stack(this.previous, this.value);
        setValueAndMax(value);
    }
    
    public int pop() {
        if (this.previous == null) {
            throw new IllegalArgumentException("Stack is empty");
        }
        int top = this.value;
        if (maxValue == top) redoMax = true;
        this.value = this.previous.value;
        this.previous = this.previous.previous;
        return top;
    }
    
    public int max() {
        if (this.previous == null) {
            throw new IllegalArgumentException("Stack is empty");
        }
        if (redoMax) setMaxLongWay();
        return maxValue;
    }
    
    private void setValueAndMax(int value) {
        if (maxValue < value) maxValue = value;
        this.value = value;
    }
    
    private void setMaxLongWay() {
        Stack clone = this;
        int top = clone.pop();
        int max = top;
        while (clone.previous != null) {
            top = clone.pop();
            if (top > max) {
                max = top;
            }
        }
        redoMax = false;
        maxValue = max;
    }
    
}