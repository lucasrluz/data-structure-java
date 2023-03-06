package com.ds;

public class Node {
  private char value;
  private Node next = null;
  private Node prev = null;

  public Node(char value) {
    this.value = value;
  }

  public char getValue() {
    return this.value;
  }

  public void setValue(char value) {
    this.value = value;
  }

  public Node getNext() {
    return this.next;
  }

  public void setNext(Node node) {
    this.next = node;
  }

  public Node getPrev() {
    return this.prev;
  }

  public void setPrev(Node node) {
    this.prev = node;
  }
}
