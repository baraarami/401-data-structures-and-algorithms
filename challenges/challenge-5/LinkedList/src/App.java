
// package LinkedList.src.App;

import LinkedList.Linkedlist;

public class App {
    public boolean methode(){
        return true;
    }

    public static void main(String[] args) {
        Linkedlist myList = new Linkedlist();

        myList.insert(65);
        myList.insert(43);
        myList.insert(88);
        myList.insert(57);
        myList.insert(90);
        myList.insert(100);


        System.out.println(myList.toString());
        System.out.println(myList.includes(22));
    }
}