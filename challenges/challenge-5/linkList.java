

public class linkList {
    
  public class Node {
      public int value;
      public Node next;

      public Node (int value){
          this.value=value;
      }
  }

  Node head = null;

  public void insert(int value){
      if(this.head ==null){
          head = new Node(value);
      }else{
          Node newNode = new Node(value);
          newNode.next=this.head;
          this.head=newNode;
      }
  }

  public boolean includes (int value){
      Node curreNode = head;
      while (curreNode != null){
          if (curreNode.value == value){
              return true;
          }
          curreNode = curreNode.next;
      }
      return false;
  }

  @Override
  public String toString() {
      String output = " ";
      Node curreNode = head;
      while (curreNode != null){
          output += " { " + curreNode.value +" } -->";
          curreNode=curreNode.next;
      }
      output += "Null";
      return output;
  }

}
