package find.max.value;

import javax.swing.plaf.SplitPaneUI;

public class Queue<T> {
    Node front;
    Node rear ;

    public Queue(){}

    public Queue(T value ) {
        this.front = new Node(value);
        this.rear = this.front;
    }


    public void enqueue(T value){
        try {
            if (rear == null){
                front = new Node(value);
                rear = front;
            }else{
                this.rear.next = new Node(value);
                this.rear = this.rear.next;
            }
        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    public Object dequeue(){
        Node deleteVode = front;
        try {
            if (isEmpty()){
                new NullPointerException();
            }else {
                this.front = front.next;
                deleteVode.next = null;
            }
        }catch (Exception ex) {
            System.out.println(ex);
        }
        return deleteVode;
    }


    public Object peek(){
        try {
            if (isEmpty()){
                return new NullPointerException();
            }else {
                return front.value;
            }
        }catch (Exception ex){
            return ex;
        }
    }


    public boolean isEmpty(){
        return front == null;
    }

    @Override
    public String toString(){
        return "Queue { "+ " front =" + front + " , rear = "+ rear + " } ";
    }

public class Node<T>{
        T value;
        public Node next ;

        public Node(T value){
            this.value = value;
        }
}

}
