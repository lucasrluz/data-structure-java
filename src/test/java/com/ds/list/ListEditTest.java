package com.ds.list;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.ds.List;

public class ListEditTest {
    @Test
    public void esperoQueRetorneUmErroDadoUmListaVazia() {
        List list = new List();

        String response = list.edit('a', 'b');

        assertEquals(response, "Error: Lista vazia.");
    }

    @Test
    public void esperoQueEditeOElementoA() {
        List list = new List();
        
        list.add('a');

        String response = list.edit('a', 'b');
 
        assertEquals(response, "Success: Elemento alterado com sucesso.");
        assertEquals(list.findNodeByValue('b'), "{value: b, nextValue: null, prevValue: null}");
    }

    @Test
    public void esperoQueEditeOElementoB() {
        List list = new List();
        
        list.add('a');
        list.add('b');
        list.add('c');

        String response = list.edit('b', 'x');

        assertEquals(response, "Success: Elemento alterado com sucesso.");
        assertEquals(list.findAllNodes(),
        """
        {value: a, nextValue: x, prevValue: null}
        {value: x, nextValue: c, prevValue: a}
        {value: c, nextValue: null, prevValue: x}
        """);
    }

    @Test
    public void esperoQueEditeOElementoC() {
        List list = new List();
        
        list.add('a');
        list.add('b');
        list.add('c');

        String response = list.edit('c', 'x');

        assertEquals(response, "Success: Elemento alterado com sucesso.");
        assertEquals(list.findAllNodes(),
        """
        {value: a, nextValue: b, prevValue: null}
        {value: b, nextValue: x, prevValue: a}
        {value: x, nextValue: null, prevValue: b}
        """);
    }

    @Test
    public void esperoQueNãoEditeDadoUmValorInexistente() {
        List list = new List();
        
        list.add('a');
        list.add('b');
        list.add('c');

        String response = list.edit('d', 'x');

        assertEquals(response, "Error: Elemento não encontrado.");
        assertEquals(list.findAllNodes(),
        """
        {value: a, nextValue: b, prevValue: null}
        {value: b, nextValue: c, prevValue: a}
        {value: c, nextValue: null, prevValue: b}
        """);
    }
}
