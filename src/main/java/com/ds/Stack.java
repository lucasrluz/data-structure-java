package com.ds;

public class Stack {
    private Node top;
   
    public Stack() {
        this.top = null;
    }

    public void push(String data) {
        Node node = new Node(data);

        if (this.top == null) {
            this.top = node;
            
            return;
        }

        this.top.setNext(node);
        node.setPrev(this.top);

        this.top = node;

        return;
    }

    public void pop() {
        if (this.top == null) {
            return;
        }

        if (this.top.getNext() == null && this.top.getPrev() == null) {
            this.top = null;

            return;
        }

        this.top = this.top.getPrev();

        this.top.setNext(null);
    }

    public boolean isEmpty() {
        if (this.top == null) {
            return true;
        }

        return false;
    }

    public Node peek() {
        return top;
    }
}
