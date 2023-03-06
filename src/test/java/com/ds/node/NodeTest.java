package com.ds.node;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.ds.Node;

public class NodeTest {
    @Test
    public void esperoQueSejaANullNull() {
        Node node = new Node('a');

        assertEquals(node.getValue(), 'a');
        assertEquals(node.getNext(), null);
        assertEquals(node.getPrev(), null);
    }

    @Test
    public void esperoQueSejaABNull() {
        Node node = new Node('a');
        Node nextNode = new Node('b');

        node.setNext(nextNode);

        assertEquals(node.getValue(), 'a');
        assertEquals(node.getNext(), nextNode);
        assertEquals(node.getPrev(), null);
    }

    @Test
    public void esperoQueSejaABC() {
        Node node = new Node('a');
        Node nextNode = new Node('b');
        Node prevNode = new Node('c');

        node.setNext(nextNode);
        node.setPrev(prevNode);

        assertEquals(node.getValue(), 'a');
        assertEquals(node.getNext(), nextNode);
        assertEquals(node.getPrev(), prevNode);
    }
}