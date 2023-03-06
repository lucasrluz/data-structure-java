package com.ds.list;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.ds.List;

public class ListAddTest {
    @Test
    public void esperoQueCrieUmaListaVazia() {
        List list = new List();

        assertEquals(list.findAllNodes(), "");
    }

    @Test
    public void esperoQueCrieUmaListaComUmElemento() {
        List list = new List();
        
        list.add('a');

        assertEquals(list.findNodeByValue('a'), "{value: a, nextValue: null, prevValue: null}");
    }

    @Test
    public void esperoQueCrieUmaListaComTrêsElementos() {
        List list = new List();
        
        list.add('a');
        list.add('b');
        list.add('c');

        assertEquals(list.findAllNodes(),
        """
        {value: a, nextValue: b, prevValue: null}
        {value: b, nextValue: c, prevValue: a}
        {value: c, nextValue: null, prevValue: b}         
        """);
    }
}
