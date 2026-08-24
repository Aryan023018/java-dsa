import java.util.Stack;

public class ImplementQueueUsingStacks {

    private Stack<Integer> input;
    private Stack<Integer> output;

    public ImplementQueueUsingStacks() {
        input = new Stack<>();
        output = new Stack<>();
    }

    public void push(int x) {
        input.push(x);
    }

    public int pop() {

        moveElements();

        return output.pop();
    }

    public int peek() {

        moveElements();

        return output.peek();
    }

    public boolean empty() {
        return input.isEmpty() && output.isEmpty();
    }

    private void moveElements() {

        if (output.isEmpty()) {

            while (!input.isEmpty()) {
                output.push(input.pop());
            }
        }
    }

    public static void main(String[] args) {

        ImplementQueueUsingStacks queue =
                new ImplementQueueUsingStacks();

        queue.push(1);
        queue.push(2);
        queue.push(3);

        System.out.println("Front: " + queue.peek());
        System.out.println("Removed: " + queue.pop());
        System.out.println("Front after pop: " + queue.peek());
        System.out.println("Is Queue Empty: " + queue.empty());
    }
}
