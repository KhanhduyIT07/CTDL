
import java.util.EmptyStackException;

public class MyStack {
    private int[] stack;
    private int top = 0;

    public MyStack(int capacity) {
        stack = new int[capacity];

    }

    public void push(int value) {
        if (top == stack.length) {
            int[] newArray = new int[2 * stack.length];
            System.arraycopy(stack, 0, newArray, 0, stack.length);
            stack = newArray;
        }
        stack[top] = value;
        top++;
    }

    public boolean isEmpty() {
        return top == 0;
    }

    public int size() {
        return top;

    }

    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack[top - 1];
    }

    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        int value = stack[top - 1];
        top--;
        return value;
    }
}
