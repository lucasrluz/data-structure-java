package com.ds.list;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.ds.List;

public class ListRemoveTest {
    @Test
    public void esperoQueRetorneUmErroDadoUmaListaVazia() {
        List list = new List();

        String response = list.remove('a');

        assertEquals(response, "Error: Lista vazia.");
    }

    @Test
    public void esperoQueRemovaOPrimeiroEUnicoElementoDaLista() {
        List list = new List();

        list.add('a');

        String response = list.remove('a');

        assertEquals(response, "Success: Elemento removido com sucesso.");
        assertEquals(list.findAllNodes(), "");
    }

    @Test
    public void esperoQueRemovaOPrimeiroElementoDaListaComTresElementos() {
        List list = new List();
        
        list.add('a');
        list.add('b');
        list.add('c');

        String response = list.remove('a');

        assertEquals(response, "Success: Elemento removido com sucesso.");
        assertEquals(list.findAllNodes(),
        """
        {value: b, nextValue: c, prevValue: null}
        {value: c, nextValue: null, prevValue: b}
        """);
    }

    @Test
    public void esperoQueRemovaOElementoDoMeioDaLista() {
        List list = new List();
        
        list.add('a');
        list.add('b');
        list.add('c');

        String response = list.remove('b');

        assertEquals(response, "Success: Elemento removido com sucesso.");
        assertEquals(list.findAllNodes(),
        """
        {value: a, nextValue: c, prevValue: null}
        {value: c, nextValue: null, prevValue: a}
        """);
    }

    @Test
    public void esperoQueRemovaOUltimoElementoDaLista() {
        List list = new List();
        
        list.add('a');
        list.add('b');
        list.add('c');

        String response = list.remove('c');

        assertEquals(response, "Success: Elemento removido com sucesso.");
        assertEquals(list.findAllNodes(),
        """
        {value: a, nextValue: b, prevValue: null}
        {value: b, nextValue: null, prevValue: a}
        """);
    }
}
