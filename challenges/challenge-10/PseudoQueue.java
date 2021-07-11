


public class PseudoQueue {
   static Stack<Integer> firstStack;
   static Stack<Integer> secondStack;

   public Stack<Integer> getFirstStack(){
       return firstStack;
   }

   public void setFirstStack(Stack<Integer> firstStack){
       PseudoQueue.firstStack =  firstStack;
   }


   public Stack<Integer> getSecondStack(){
       return secondStack;
   }

   public void setSecondStack(Stack<Integer> secondStack){
       PseudoQueue.secondStack=secondStack;
   }

//    Stack firstStack;
//    Stack secondStack;

   public PseudoQueue(){
       PseudoQueue.firstStack= new Stack<Integer>();
       PseudoQueue.secondStack=new Stack<Integer>();
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





//
//import java.util.Stack;

// import java.util.NoSuchElementException;
// import java.util.Stack;

// public class PseudoQueue {

// private Stack inputStack;
// private Stack outputStck;

// public PseudoQueue(){
//     inputStack= new Stack();
//     outputStck=new Stack();
// }

// public void enqueue(int value){
//     inputStack.push(value);
// }

// public int dequeue() throws Exception {
//     if (outputStck.isEmpty()) {
//         while (!inputStack.isEmpty()) {
//             outputStck.push(inputStack.pop());
//         }
//     }
//     int temp = 0;
//     if (!outputStck.isEmpty()) {
//         temp = (int) outputStck.pop();
//     } else {
//         throw new NoSuchElementException();
//     }
//     return temp;
// }


//     @Override
//     public String toString(){
//         return " PseudoQueue {" + "First Stack" + inputStack + " , Second Stack" + outputStck+ " } ";
//     }

// }

