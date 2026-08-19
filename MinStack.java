import java.util.Stack;

public class MinStack {

    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val) {

        stack.push(val);

        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
    }

    public void pop() {

        if (stack.isEmpty()) {
            return;
        }

        int removed = stack.pop();

        if (removed == minStack.peek()) {
            minStack.pop();
        }
    }

    public int top() {

        if (stack.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }

        return stack.peek();
    }

    public int getMin() {

        if (minStack.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }

        return minStack.peek();
    }

    public static void main(String[] args) {

        MinStack obj = new MinStack();

        obj.push(-2);
        obj.push(0);
        obj.push(-3);

        System.out.println("Minimum: " + obj.getMin());

        obj.pop();

        System.out.println("Top: " + obj.top());
        System.out.println("Minimum: " + obj.getMin());
    }
}
