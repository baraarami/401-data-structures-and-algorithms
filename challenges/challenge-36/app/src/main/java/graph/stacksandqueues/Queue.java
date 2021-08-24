package graph.stacksandqueues;

public class Queue <T>{
Node front;
Node rear ;


public Queue(T value){
    this.front=new Node(value);
    this.rear= this.front;
}

public Queue(){}



    public void enqueue(T value){
    Node node = new Node(value);
    if (front == null){
        front = node;
        rear = front;
    }else {
        this.rear.next= node;
        this.rear = this.rear.next;
    }
    }


    public Object dequeue(){
    Node firstNode = front;
    try {
        if (isEmpty())
            return new NullPointerException();
        if (front == rear){
            rear = null ;
        }
        front = front.next;
        firstNide.next = null;
    }catch (Exception ex){
        System.out.println(ex);
    }
    return firstNide;
    }

    public Object peek(){
    try {
        if (isEmpty())
            return new NullPointerException();

    }catch (NullPointerException ex){
        System.out.println(ex);
    }
    return front.value;
    }


    public boolean isEmpty(){
    return front == null;
    }


    @Override
    public String toString() {
        return "Queue{" +
                "front=" + front +
                ", rear=" + rear +
                '}';
    }
}
