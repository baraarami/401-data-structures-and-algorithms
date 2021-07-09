

import StackAndQeueus.Queue;
import StackAndQeueus.Stack;

public class App {

    public static void main(String[] args) {
	// Stack
        Stack stack = new Stack();

        System.out.println(stack.isEmpty());
        System.out.println(stack.peek());

        stack.push(5);
        stack.push(6);
        stack.push(7);

        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack);


        // Queue
        Queue queue = new Queue();
        queue.enQueue(8);
        queue.enQueue(9);
        queue.enQueue(10);
        queue.enQueue(11);

        System.out.println("Queue");
        System.out.println(queue);
        System.out.println(queue.deQueue());
        System.out.println(queue.peek());
        System.out.println(queue);
        System.out.println(queue.deQueue());
        System.out.println(queue.peek());
        System.out.println(queue);

    }
}
