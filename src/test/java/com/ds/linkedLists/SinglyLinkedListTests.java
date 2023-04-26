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

public class SinglyLinkedListTests {
    // ADD
    @Test
    public void esperoQueAdicioneUmElementoNaLista() {
        SinglyLinkedList list = new SinglyLinkedList();
        
        list.add('a');

        assertEquals('a', list.head.value);
        assertEquals(null, list.head.next);
    }

    @Test
    public void esperoQueAdicioneDoisElementosNaLista() {
        SinglyLinkedList list = new SinglyLinkedList();
        
        list.add('a');
        list.add('b');

        assertEquals('a', list.head.value);
        assertEquals('b', list.head.next.value);
        assertEquals(null, list.head.next.next);
    }

    @Test
    public void esperoQueAdicioneTresElementosNaLista() {
        SinglyLinkedList list = new SinglyLinkedList();
        
        list.add('a');
        list.add('b');
        list.add('c');

        assertEquals('a', list.head.value);
        assertEquals('b', list.head.next.value);
        assertEquals('c', list.head.next.next.value);
        assertEquals(null, list.head.next.next.next); 
    }

    // DELETE

    @Test
    public void esperoQueNaoRemovaNenhumElementoDaListaVazia() {
        SinglyLinkedList list = new SinglyLinkedList();

        assertEquals(null, list.head);
    }

    @Test
    public void esperoQueRemovaOUnicoElementoDaLista() {
        SinglyLinkedList list = new SinglyLinkedList();

        list.add('a');
        list.delete('a');

        assertEquals(null, list.head);
    }

    @Test
    public void esperoQueRemovaOPrimeiroElementoDaListaDeDoisElementos() {
        SinglyLinkedList list = new SinglyLinkedList();

        list.add('a');
        list.add('b');

        list.delete('a');

        assertEquals('b', list.head.value);
        assertEquals(null, list.head.next);
    }

    @Test
    public void esperoQueRemovaOPrimeiroElementoDaListaDeTresElementos() {
        SinglyLinkedList list = new SinglyLinkedList();

        list.add('a');
        list.add('b');
        list.add('c');

        list.delete('a');

        assertEquals('b', list.head.value);
        assertEquals('c', list.head.next.value);
        assertEquals(null, list.head.next.next);
    }

    @Test
    public void esperoQueRemovaOSegundoElementoDaListaDeDoisElementos() {
        SinglyLinkedList list = new SinglyLinkedList();

        list.add('a');
        list.add('b');

        list.delete('b');

        assertEquals('a', list.head.value);
        assertEquals(null, list.head.next);
    }

    @Test
    public void esperoQueRemovaOSegundoElementoDaListaDeTresElementos() {
        SinglyLinkedList list = new SinglyLinkedList();

        list.add('a');
        list.add('b');
        list.add('c');

        list.delete('b');

        assertEquals('a', list.head.value);
        assertEquals('c', list.head.next.value);
        assertEquals(null, list.head.next.next);
    }

    @Test
    public void esperoQueRemovaOTerceiroElementoDaListaDeTresElementos() {
        SinglyLinkedList list = new SinglyLinkedList();

        list.add('a');
        list.add('b');
        list.add('c');

        list.delete('c');

        assertEquals('a', list.head.value);
        assertEquals('b', list.head.next.value);
        assertEquals(null, list.head.next.next);
    }

    // FIND

    @Test
    public void esperoQueRetorneFalseDadoUmaBuscaEmUmaListVazia() {
        SinglyLinkedList list = new SinglyLinkedList();

        assertEquals(false, list.find('a'));
    }

    @Test
    public void esperoQueEncontreOPrimeiroEUnicoElementoDaLista() {
        SinglyLinkedList list = new SinglyLinkedList();

        list.add('a');

        assertEquals(true, list.find('a'));
    }

    @Test
    public void esperoQueEncontreOPrimeiroElementoDaListaDeDoisElementos() {
        SinglyLinkedList list = new SinglyLinkedList();

        list.add('a');
        list.add('b');

        assertEquals(true, list.find('a'));
    }

    @Test
    public void esperoQueEncontreOPrimeiroElementoDaListaDeTresElementos() {
        SinglyLinkedList list = new SinglyLinkedList();

        list.add('a');
        list.add('b');
        list.add('c');

        assertEquals(true, list.find('a'));
    }

    @Test
    public void esperoQueEncontreOSegundoElementoDaListaDeDoisElementos() {
        SinglyLinkedList list = new SinglyLinkedList();

        list.add('a');
        list.add('b');

        assertEquals(true, list.find('b'));
    }

    @Test
    public void esperoQueEncontreOSegundoElementoDaListaDeTresElementos() {
        SinglyLinkedList list = new SinglyLinkedList();

        list.add('a');
        list.add('b');
        list.add('c');

        assertEquals(true, list.find('b'));
    }

    @Test
    public void esperoQueEncontreOTerceiroElementoDaListaDeTresElementos() {
        SinglyLinkedList list = new SinglyLinkedList();

        list.add('a');
        list.add('b');
        list.add('c');

        assertEquals(true, list.find('c'));
    }
}
