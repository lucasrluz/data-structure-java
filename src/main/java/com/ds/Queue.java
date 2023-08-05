package com.ds;

public class Queue {
    private Node front;
    private Node rear;

    public Queue() {
        this.front = null;
        this.rear = null;
    }

    public void enqueue(String data) {
        Node node = new Node(data);

        if (this.front == null && this.rear == null) {
            this.front = node;
            this.rear = node;

            return;
        }

        this.rear.setPrev(node); 

        this.rear = node;

        return;
    }

    public void dequeue() {
        if (this.front.getData().equals(this.rear.getData())) {
            this.front = null;
            this.rear = null;

            return;
        }

        this.front = this.front.getPrev();

        return;
    }

    public Node peek() {
        return this.front;
    }

    public boolean isEmpty() {
        if (this.front == null && this.rear == null) {
            return true;
        }

        return false;
    }

    public Node getRear() {
        return this.rear;
    }
}
