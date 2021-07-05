import java.util.LinkedList;

public class Library {
    
    public boolean SomeMethode(){
  return true;
    }

public static void main(String[] args) {
    
    LinkedList list = new LinkedList();

list.insert(65);
list.insert(43);
list.insert(88);
list.insert(57);
list.insert(90);
list.insert(100);

System.out.println(list.toString());
System.out.println(list.includes(22));
}


}
