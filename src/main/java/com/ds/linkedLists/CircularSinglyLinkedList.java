package com.ds.linkedLists;

public class CircularSinglyLinkedList {
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
            if (current.next == null || current.next == this.head) {
                Node newNode = new Node(value);

                current.next = newNode;

                current.next.next = this.head;

                break;
            }

            current = current.next;
        }
    }

    public void delete(char value) {
        // caso for o primeiro elemento da lista a ser deletado
        if (this.head.value == value) {
            // caso for o único elemento da lista
            if (this.head.next == null) {
                this.head = null;
            }
    
            // caso tenha dois elementos na lista
            if (this.head.next != null && this.head.next.next == this.head) {
                this.head = this.head.next;
                this.head.next = null;
    
                return;
            }
    
            // caso tenha três ou mais elementos na lista
            Node current = this.head.next;
            
            while (true) {
                if (this.head.value == current.next.value) {
                    current.next = this.head.next;

                    this.head = this.head.next;

                    break;
                }
                
                current = current.next;
            }
        }

        // caso seja o segundo elemento da lista a ser deletado
        if (this.head.next.value == value) {
            // lista com dois elementos
            if (this.head.next.next.value == this.head.value) {
                this.head.next = null;

                return;
            }

            // lista com três ou mais elementos
            this.head.next = this.head.next.next;

            return;
        }

        // caso seja o elemento do meio da lista a ser deletado
        Node current = this.head.next;
        
        while (true) {
            if (current.next.value == value) {
                // último elementos a ser deletado
                if (current.next.next.value == this.head.value) {
                    current.next = this.head;

                    break;
                }

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
            if (current.value != value && current.next.value == this.head.value) {
                
                return false;
            }

            if (current.value == value) {
                return true;
            }

            current = current.next;
        }
    }
}