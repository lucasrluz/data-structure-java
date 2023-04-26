package com.ds.linkedLists;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/* ADICIONAR
 * Dado uma lista com 0 elementos adicione 1 elemento.
 * Dado uma lista com 1 elemento adicione 1 elemento.
 * Dado uma lista com 2 elementos adicione 1 elemento.
 * 
 * REMOVER
 * Dado uma lista com 0 elementos remova 1 elemento.
 * Dado uma lista com 1 elemento remova o elemento 1.
 * Dado uma lista com 2 elementos remova o elemento 1.
 * Dado uma lista com 3 elementos remova o elemento 1.
 * 
 * Dado uma lista com 2 elementos remova o elemento 2.
 * Dado uma lista com 3 elementos remova o elemento 2.
 * 
 * Dado uma lista com 3 elementos remova o elemento 3.
 * 
 * BUSCAR
 * Dado uma lista com 0 elementos busque 1 elemento.
 * Dado uma lista com 1 elemento busque o elemento 1.
 * Dado uma lista com 2 elementos busque o elemento 1.
 * Dado uma lista com 3 elemento busque o elemento 1.
 * 
 * Dado uma lista com 2 elementos busque o elemento 2.
 * Dado uma lista com 3 elementos busque o elemento 2.
 * 
 * Dado uma lista com 3 elementos busque o elemento 3.
 */

public class CircularSinglyLinkedListTests {
    // ADD
    @Test
    public void esperoQueAdicioneUmElementoNaLista() {
        CircularSinglyLinkedList list = new CircularSinglyLinkedList();
        
        list.add('a');

        assertEquals('a', list.head.value);
        assertEquals(null, list.head.next);
    }

    @Test
    public void esperoQueAdicioneDoisElementosNaLista() {
        CircularSinglyLinkedList list = new CircularSinglyLinkedList();
        
        list.add('a');
        list.add('b');

        assertEquals('a', list.head.value);
        assertEquals('b', list.head.next.value);
        assertEquals('a', list.head.next.next.value);
    }

    @Test
    public void esperoQueAdicioneTresElementosNaLista() {
        CircularSinglyLinkedList list = new CircularSinglyLinkedList();
        
        list.add('a');
        list.add('b');
        list.add('c');

        assertEquals('a', list.head.value);
        assertEquals('b', list.head.next.value);
        assertEquals('c', list.head.next.next.value);
        assertEquals('a', list.head.next.next.next.value); 
    }

    // DELETE

    @Test
    public void esperoQueNaoRemovaNenhumElementoDaListaVazia() {
        CircularSinglyLinkedList list = new CircularSinglyLinkedList();

        assertEquals(null, list.head);
    }

    @Test
    public void esperoQueRemovaOUnicoElementoDaLista() {
        CircularSinglyLinkedList list = new CircularSinglyLinkedList();

        list.add('a');

        list.delete('a');

        assertEquals(null, list.head);
    }

    @Test
    public void esperoQueRemovaOPrimeiroElementoDaListaDeDoisElementos() {
        CircularSinglyLinkedList list = new CircularSinglyLinkedList();

        list.add('a');
        list.add('b');

        list.delete('a');

        assertEquals('b', list.head.value);
        assertEquals(null, list.head.next);
    }

    @Test
    public void esperoQueRemovaOPrimeiroElementoDaListaDeTresElementos() {
        CircularSinglyLinkedList list = new CircularSinglyLinkedList();

        list.add('a');
        list.add('b');
        list.add('c');

        list.delete('a');

        assertEquals('b', list.head.value);
        assertEquals('c', list.head.next.value);
        assertEquals('b', list.head.next.next.value);
    }

    @Test
    public void esperoQueRemovaOSegundoElementoDaListaDeDoisElementos() {
        CircularSinglyLinkedList list = new CircularSinglyLinkedList();

        list.add('a');
        list.add('b');

        list.delete('b');

        assertEquals('a', list.head.value);
        assertEquals(null, list.head.next);
    }

    @Test
    public void esperoQueRemovaOSegundoElementoDaListaDeTresElementos() {
        CircularSinglyLinkedList list = new CircularSinglyLinkedList();

        list.add('a');
        list.add('b');
        list.add('c');

        list.delete('b');

        assertEquals('a', list.head.value);
        assertEquals('c', list.head.next.value);
        assertEquals('a', list.head.next.next.value);
    }

    @Test
    public void esperoQueRemovaOTerceiroElementoDaListaDeTresElementos() {
        CircularSinglyLinkedList list = new CircularSinglyLinkedList();

        list.add('a');
        list.add('b');
        list.add('c');

        list.delete('c');

        assertEquals('a', list.head.value);
        assertEquals('b', list.head.next.value);
        assertEquals('a', list.head.next.next.value);
    }

    @Test
    public void esperoQueRemovaOTerceiroElementoDaListaDeQuatroElementos() {
        CircularSinglyLinkedList list = new CircularSinglyLinkedList();

        list.add('a');
        list.add('b');
        list.add('c');
        list.add('d');

        list.delete('c');

        assertEquals('a', list.head.value);
        assertEquals('b', list.head.next.value);
        assertEquals('d', list.head.next.next.value);
        assertEquals('a', list.head.next.next.next.value);
    }

    // FIND

    @Test
    public void esperoQueRetorneFalseDadoUmaBuscaEmUmaListVazia() {
        CircularSinglyLinkedList list = new CircularSinglyLinkedList();

        assertEquals(false, list.find('a'));
    }

    @Test
    public void esperoQueEncontreOPrimeiroEUnicoElementoDaLista() {
        CircularSinglyLinkedList list = new CircularSinglyLinkedList();

        list.add('a');

        assertEquals(true, list.find('a'));
    }

    @Test
    public void esperoQueEncontreOPrimeiroElementoDaListaDeDoisElementos() {
        CircularSinglyLinkedList list = new CircularSinglyLinkedList();

        list.add('a');
        list.add('b');

        assertEquals(true, list.find('a'));
    }

    @Test
    public void esperoQueEncontreOPrimeiroElementoDaListaDeTresElementos() {
        CircularSinglyLinkedList list = new CircularSinglyLinkedList();

        list.add('a');
        list.add('b');
        list.add('c');

        assertEquals(true, list.find('a'));
    }

    @Test
    public void esperoQueEncontreOSegundoElementoDaListaDeDoisElementos() {
        CircularSinglyLinkedList list = new CircularSinglyLinkedList();

        list.add('a');
        list.add('b');

        assertEquals(true, list.find('b'));
    }

    @Test
    public void esperoQueEncontreOSegundoElementoDaListaDeTresElementos() {
        CircularSinglyLinkedList list = new CircularSinglyLinkedList();

        list.add('a');
        list.add('b');
        list.add('c');

        assertEquals(true, list.find('b'));
    }

    @Test
    public void esperoQueEncontreOTerceiroElementoDaListaDeTresElementos() {
        CircularSinglyLinkedList list = new CircularSinglyLinkedList();

        list.add('a');
        list.add('b');
        list.add('c');

        assertEquals(true, list.find('c'));
    }

    @Test
    public void esperoQueEncontreFalseDadoUmElementoNaoExistenteNaLista() {
        CircularSinglyLinkedList list = new CircularSinglyLinkedList();

        list.add('a');
        list.add('b');
        list.add('c');

        assertEquals(false, list.find('d'));
    }
}
