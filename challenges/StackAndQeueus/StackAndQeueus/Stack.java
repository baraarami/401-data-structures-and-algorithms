package StackAndQeueus;

import Node.Node;

public class Stack <T> { //stack class with top property
    Node top;

    public Stack(T value) {
        this.top = new Node(value);

    }

    public Stack() {

    }

    public void push(T value) { //arg is value
        try {
            Node node = new Node(value);  //add new node with value
            node.next = top;  // make the next node = top
            top = node; // make the new node = the top of the stack

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public Object pop() {
        Node lastNode = top; // the lastNode will be the first one in the top
        try {
            if (isEmpty()) {
                return new NullPointerException();
            }
            top = top.next;
            lastNode.next = null;
        } catch (NullPointerException ex) {  // to raise the exception
            System.out.println(ex);
        }
        return lastNode; // which returns the value from node from the top of the stack
    }

    public Object peek() {
        try {
            if (isEmpty()) {
                return new NullPointerException();
            } else {
                return top.value; // return the value of the node that located at the top of the stack
            }
        } catch (Exception ex) {  //to raise the exception
            return ex;
        }

    }

    // returns boolean indicating whether ot not the stack is empty
    public boolean isEmpty(){
        return top == null;
    }

    @Override
    public String toString(){
        return  " Stack { " + " Top = "+ top + " } ";
    }
}


