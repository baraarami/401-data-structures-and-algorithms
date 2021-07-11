

public class Queue <T>{ // Queue class that has a front property
    Node<T> front ;
    Node<T> rear;
    public Queue(){ // the constructor

    }

    public Queue(T value){
        this.front=new Node<T>(value);
        this.rear= this.front;
    }

    public void enQueue(T value){ //
        try {
            if (rear == null){
                front= new Node<T>(value);
                rear = front;
            }else{
                this.rear.next = new Node<T>(value);
                this.rear=this.rear.next;
            }
        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    public Object deQueue(){
        Node<T> deleteNode = front;
        try {
            if (isEmpty()){
                new NullPointerException();
            }else {
                this.front=front.next; // return the the value from the node from the front of the queue
                deleteNode.next=null; // remove the node from the front of the queue
            }
        }catch (Exception ex){
            System.out.println(ex);
        }
        return deleteNode;
    }


    public Object peek (){
        try {
            if (isEmpty()){
                return new NullPointerException();
            }else{
                return front.value; //returns value from of the node located at the front of the queue
            }
        }catch (Exception ex){
            return ex;
        }
    }
    // returns boolean indicating whether ot not the stack is empty

    public boolean isEmpty(){
        return front == null;
    }

    @Override
    public String toString(){
        return " Queue { "+ " Front =" + front + " , rear = " + rear +" } ";
    }

}
