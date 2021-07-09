import java.util.Stack;

public class Main {

    public static void main(String[] args) {
	// Stack
        Stack stack= new Stack();

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


    }
}

