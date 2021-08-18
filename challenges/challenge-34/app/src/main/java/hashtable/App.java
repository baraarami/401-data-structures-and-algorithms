package hashtable;

import linkedList.LinkedList;
import linkedList.Node;

public class App {
    public static void main(String[] args) {
        Hashtable hashtable= new Hashtable();
//        System.out.println(hashtable.get("goooooood"));
//
//        hashtable.add("goooooood" , "bebo");
//
//        System.out.println(new Hashtable().hash("goooooood"));
//        System.out.println(hashtable.get("g"));
//        System.out.println(hashtable.get("o"));
//        System.out.println(hashtable.get("o"));
//        System.out.println(hashtable.get("o"));
//        System.out.println(hashtable.get("o"));
//        System.out.println(hashtable.get("o"));
//        System.out.println(hashtable.get("o"));
//        System.out.println(hashtable.get("o"));
//        System.out.println(hashtable.get("d"));

        System.out.println(RepeatedWord.repetedWord("word is not this word is "));

        LinkedList linkedList= new LinkedList();
        int[] arr = {1,4,3,8,1,13,12,1,5};
        for (int i=0 ; i <arr.length ; i++){
            linkedList.append(arr[i]);
        }
        deleteNode(linkedList,1);
        System.out.println(linkedList.head.val);
        System.out.println(linkedList);
    }
    public static void deleteNode(LinkedList linkedList , int n){
        if ((int)linkedList.head.val == n){
            linkedList.head=linkedList.head.next;
        }
        Node current = linkedList.head;
        while (current.next != null){
            if ((int) current.next.val == n){
                current.next = (Node) current.next.val;
            }
            current = current.next;
        }
    }
}
