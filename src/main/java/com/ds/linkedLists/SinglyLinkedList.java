package com.ds.linkedLists;

public class SinglyLinkedList {
    public Node head;

    public class Node {
        public char value;
        public Node next;

        public Node(char value) {
            this.value = value;
        }
    }

    public void add(char value) {
        if (this.head == null) {
            Node newNode = new Node(value);
            
            this.head = newNode;

            return;
        }

        Node current = this.head;

        while (true) {
            if (current.next == null) {
                Node newNode = new Node(value);

                current.next = newNode;

                break;
            }

            current = current.next;
        }
    }

    public void delete(char value) {
        if (this.head == null) {
            return;
        }

        if (this.head.value == value) {
            this.head = this.head.next;

            return;
        }

        Node current = this.head;

        while (true) {
            if (current.next.value == value) {
                current.next = current.next.next;

               break;
            }

            current = current.next;
        }
    }

    public boolean find(char value) {
        if (this.head == null) {
            return false;
        }

        Node current = this.head;

        while (true) {
            if (current.value == value) {
                return true;
            }

            current = current.next;
        }
    }
}