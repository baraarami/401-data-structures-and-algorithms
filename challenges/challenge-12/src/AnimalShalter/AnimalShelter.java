package AnimalShalter;

public class AnimalShelter <T> {  //
    Node<T> front;
    Node rear ;


    public AnimalShelter(){
    }

    public AnimalShelter(T value){
        this.front= new Node (value);
        this.rear=this.front;
    }

// will check if the pass Node is a cat or a dog if it yes add it to the queue
    public void enqueue(T animal){          // take arg animal
        try {
            if (rear == null){
                front =new Node(animal);
                rear=front;
            }else {
                this.rear.next=new Node(animal);
                this.rear=this.rear.next;
            }
        }catch (Exception ex){
            System.out.println(ex);
        }
    }


    // dequeue take a value of string and pick it if it a cat or a dog only
    public T dequeue(T pref){
        try {
            if (isEmpty()){
                new NullPointerException();
            }else {
                if (pref != "cat" && pref !="dog"){
                    pref=null;

                }else {
                    this.front=this.front.next;
                }
            }
        }catch (Exception ex){
            System.out.println(ex);
        }
        return pref;
    }


    public boolean isEmpty(){
        return front==null;
    }

    @Override
    public String toString(){
        return "Shelter {" + "front =" + front + " , "+ " rear = "+ rear + " }";
    }
}
