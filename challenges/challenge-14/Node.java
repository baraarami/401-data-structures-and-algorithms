

import java.util.Stack;

public class Node {
  private Stack<Integer> st = new Stack<>();
  private Stack<Integer> maxSt = new Stack<>();


  public void push(int data){
      int max =data ;

      if (!maxSt.isEmpty() && max < maxSt.peek()){
          max=maxSt.peek();
      }
      st.push(data);
      maxSt.push(max);
  }

  public void pop(){
      st.pop();
      maxSt.pop();
  }

  public int getMax(){
      return maxSt.peek();
  }

    public static void main(String[] args) {
        Node node = new Node();
        node.push(150);
        node.push(952);
        node.push(200);
        node.push(358);
        System.out.println(node.st);
        System.out.println(node.maxSt);
        System.out.println("The Biggest Element in A Stack is " + node.getMax());


        node.pop();
        node.pop();
        node.pop();

        System.out.println(node.st);
        System.out.println(node.maxSt);
        System.out.println("After 3 pop operations The Biggest Element in A Stack is :" + node.getMax());
    }
}

