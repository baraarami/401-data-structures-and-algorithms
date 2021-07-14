import StackAndQeueus.PseudoQueue;
import StackAndQeueus.Queue;
import StackAndQeueus.Stack;

public class Main {

    public static void main(String[] args) throws Exception {
	// Stack

        Stack<Integer> stack = new Stack<Integer>();

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
        Queue<Integer> queue = new Queue<Integer>();
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


        System.out.println("start pseudo");
        //pseudoQueue
        PseudoQueue pseudoQueue = new PseudoQueue();

        pseudoQueue.enqueue(5);
        pseudoQueue.enqueue(6);
        pseudoQueue.enqueue(8);
        System.out.println(pseudoQueue);
        pseudoQueue.dequeue();
        System.out.println(pseudoQueue);
        pseudoQueue.dequeue();
        System.out.println(pseudoQueue);
    }
}
