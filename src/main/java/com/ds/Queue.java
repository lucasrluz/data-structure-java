package com.ds;

public class Queue {
    private Node head = null;

    public void add(char value) {
        Node current = this.head;

        // Caso não tenha tenhum elemento adicionado.
        if (current == null) {
            Node node = new Node(value);

            this.head = node;

            return;
        }

        // Caso tenha mais de um elemento adicionado.
        while (true) {
            if (current.getNext() == null) {
                Node node = new Node(value);

                current.setNext(node);
                current.getNext().setPrev(current);

                return;
            }

            current = current.getNext();
        }
    }

    public String edit(char searchValue, char newValue) {
        Node current = this.head;

        // Caso não tenha nenhum elemento adicionado.
        if (current == null) {
            return "Error: Fila vazia.";
        }

        // Caso tenha mais de um elemento adicionado.
        while (true) {
            if (current.getValue() == searchValue) {
                current.setValue(newValue);

                return "Success: Elemento alterado com sucesso.";
            }

            if (current.getNext() == null) {
                return "Error: Elemento não encontrado.";
            }

            current = current.getNext();
        }
    }

    public String remove() {
        // Caso não tenha nenhum elemento adicionado.
        if (this.head == null) {
            return "Error: Fila vazia.";
        }

        // Caso tenha apenas um elemento adicionado.
        if (this.head.getNext() == null) {
            this.head = null;

            return "Success: Elemento removido com sucesso.";
        }

        // Caso tenha mais de um elemento adicionado.
        this.head = this.head.getNext();
        this.head.setPrev(null);

        return "Success: Elemento removido com sucesso.";
        
    }

    public String findAllNodes() {
        Node current = this.head;

        // Caso não tenha nenhum elemento adicionado.
        if (current == null) {
            return "";
        }

        // Caso tenha um ou mais elementos adicionados.
        String list = "";

        while (true) {
            String nodeValue = String.valueOf(current.getValue());
            String nextValue = current.getNext() == null ? "null" : String.valueOf(current.getNext().getValue());
            String prevValue = current.getPrev() == null ? "null" : String.valueOf(current.getPrev().getValue());

            String node = String.format("{value: %s, nextValue: %s, prevValue: %s}\n", nodeValue, nextValue, prevValue);
            list = list.concat(node);

            if (current.getNext() == null) {
                break;
            }

            current = current.getNext();
        }

        return list;
    }
}
