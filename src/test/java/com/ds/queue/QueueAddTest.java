package com.ds.queue;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.ds.Queue;

public class QueueAddTest {
    @Test
    public void esperoQueCrieUmFilaVazia() {
        Queue queue = new Queue();

        assertEquals(queue.findAllNodes(), "");
    }

    @Test
    public void esperoQueCrieUmaFilaComUmElemento() {
        Queue queue = new Queue();

        queue.add('a');

        assertEquals(queue.findAllNodes(), "{value: a, nextValue: null, prevValue: null}\n");
    }

    @Test
    public void esperoQueCrieUmaFilaComTresElementos() {
        Queue queue = new Queue();

        queue.add('a');
        queue.add('b');
        queue.add('c');

        assertEquals(queue.findAllNodes(),
        """
        {value: a, nextValue: b, prevValue: null}
        {value: b, nextValue: c, prevValue: a}
        {value: c, nextValue: null, prevValue: b}  
        """);
    }
}
