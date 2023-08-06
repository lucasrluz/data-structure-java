package com.ds;

public class Queue<T> {
    private Node<T> front;
    private Node<T> rear;

    public Queue() {
        this.front = null;
        this.rear = null;
    }

    public void enqueue(T data) {
        Node<T> node = new Node<T>(data);

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

    public Node<T> peek() {
        return this.front;
    }

    public boolean isEmpty() {
        if (this.front == null && this.rear == null) {
            return true;
        }

        return false;
    }

    public Node<T> getRear() {
        return this.rear;
    }
}
