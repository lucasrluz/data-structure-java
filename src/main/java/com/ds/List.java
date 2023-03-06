package com.ds;

public class List {
    private Node head;

    public void add(char value) {
        Node current = this.head;

        // Caso não tenha nenhum elemento adicionado ainda.
        if (current == null) {
            Node node = new Node(value);

            this.head = node;

            return;
        }

        // Caso tenha um ou mais elementos adicionados.
        while (true) {
            if (current.getNext() == null) {
                Node node = new Node(value);
    
                current.setNext(node);
                
                current.getNext().setPrev(current);
                break;
            }

            current = current.getNext();
        }
    }

    public String edit(char searchValue, char newValue) {
        Node current = this.head;

        // Caso não tenha nenhum elemento adicionado ainda.
        if (current == null) {
            return "Error: Lista vazia.";
        }

        // Caso tenha um ou mais elementos adicionados.
        while (true) {
            if (current.getValue() == searchValue) {
                current.setValue(newValue);

                break;
            }

            if (current.getNext() == null) {
                return "Error: Elemento não encontrado.";
            }

            current = current.getNext();
        }

        return "Success: Elemento alterado com sucesso.";
    }

    public String remove(char value) {
        Node current = this.head;

        // Caso não tenha nenhum elemento adicionado ainda.
        if (current == null) {
            return "Error: Lista vazia.";
        }

        // Caso o elemento para remover seja o primeiro e tenha mais elemento adicionado.
        if (current.getValue() == value && current.getPrev() == null && current.getNext() != null) {
            /*
             * Example:  
             * List = a, b, c
             * Remove a
             * a.next(b).prev = null
             * head = b
             */
            current.getNext().setPrev(null);
            this.head = current.getNext();

            return "Success: Elemento removido com sucesso.";
        }

        // Caso o elemento para remover seja o primeiro e não tenha elementos adicionado.
        if (current.getValue() == value && current.getPrev() == null & current.getNext() == null) {
            this.head = null;

            return "Success: Elemento removido com sucesso.";
        }

        // Caso tenha mais de um elemento adicionado
        while (true) {
            // Caso o elemento para remover esteja entre elementos.
            if (current.getValue() == value && current.getNext() != null) {
                /*
                 * Example:
                 * List = a, b, c
                 * Remove b
                 * b.prev(a).next = c
                 * b.next(c).prev = a
                 */
                current.getPrev().setNext(current.getNext());
                current.getNext().setPrev(current.getPrev());

                return "Success: Elemento removido com sucesso.";
            }
         
            // Caso o elemento para remover seja o último.
            if (current.getValue() == value && current.getNext() == null) {
                /*
                 * Example:
                 * List a, b, c
                 * Remove c
                 * c.prev(b).next = null
                 */
                current.getPrev().setNext(null);
    
                return "Success: Elemento removido com sucesso.";
            }

            current = current.getNext();
        }
    }

    public String findNodeByValue(char value) {
        Node current = this.head;

        // Caso não tenha nenhum elemento adicionado.
        if (current == null) {
            return "";
        }

        // Caso tenha um ou mais elementos adicionados.
        while (true) {
            if (current.getValue() == value) {
                String nodeValue = String.valueOf(current.getValue());
                String nextValue = current.getNext() == null ? "null" : String.valueOf(current.getNext().getValue());
                String prevValue = current.getPrev() == null ? "null" : String.valueOf(current.getPrev().getValue());

                return String.format("{value: %s, nextValue: %s, prevValue: %s}", nodeValue, nextValue, prevValue);
            }

            if (current.getNext() == null) {
                return "";
            }

            current = current.getNext();
        }
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
