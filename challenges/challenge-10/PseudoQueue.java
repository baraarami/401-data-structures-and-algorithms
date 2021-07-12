
//
//import java.util.Stack;

import java.util.Stack;

public class PseudoQueue {

    public Stack<Integer> getFirstStack(){
        return firstStack;
    }

    public void setFirstStack(Stack<Integer> firstStack){
        this.firstStack =  firstStack;
    }


    public Stack<Integer> getSecondStack(){
        return secondStack;
        }

    public void setSecondStack(Stack<Integer> secondStack){
        this.secondStack=secondStack;
  }
    Stack<Integer> firstStack;
    Stack<Integer> secondStack;

    public PseudoQueue(){
        this.firstStack= new Stack<Integer>();
        this.secondStack=new Stack<Integer>();
    }

    public  void enqueue(int value){
        try {
            while (!firstStack.isEmpty()){
                secondStack.push(firstStack.pop());
            }
            firstStack.push(value);
            while (!secondStack.isEmpty()){
                firstStack.push((secondStack.pop()));
            }
        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    public Object dequeue(){
        Object extractStack = new Object();
        try {
            extractStack = firstStack.pop();
        }catch (NullPointerException ex){
            System.out.println(ex);
       }
        return extractStack;
    }

 @Override
  public String toString(){
        return " PseudoQueue {" + "First Stack" + firstStack + " , Second Stack" + secondStack+ " } ";
    }

}
