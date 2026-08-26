import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackUsingQueues {

    private Queue<Integer> queue;

    public ImplementStackUsingQueues() {
        queue = new LinkedList<>();
    }

    public void push(int x) {

        queue.offer(x);

        int size = queue.size();

        for (int i = 0; i < size - 1; i++) {
            queue.offer(queue.poll());
        }
    }

    public int pop() {
        return queue.poll();
    }

    public int top() {
        return queue.peek();
    }

    public boolean empty() {
        return queue.isEmpty();
    }

    public static void main(String[] args) {

        ImplementStackUsingQueues stack =
                new ImplementStackUsingQueues();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Top: " + stack.top());
        System.out.println("Removed: " + stack.pop());
        System.out.println("Top after pop: " + stack.top());
        System.out.println("Is Stack Empty: " + stack.empty());
    }
}
