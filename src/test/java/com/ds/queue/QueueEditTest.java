package com.ds.queue;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.ds.Queue;

public class QueueEditTest {
    @Test
    public void esperoQueRetorneUmErroDadoUmaFilaVazia() {
        Queue queue = new Queue();

        String response = queue.edit('a', 'x');

        assertEquals(response, "Error: Fila vazia.");
    }

    @Test
    public void esperoQueEditeOPrimeiroEUnicoElementoDaFila() {
        Queue queue = new Queue();

        queue.add('a');

        String response = queue.edit('a', 'x');

        assertEquals(response, "Success: Elemento alterado com sucesso.");
        assertEquals(queue.findAllNodes(),
        """
        {value: x, nextValue: null, prevValue: null} 
        """);
    }
    
    @Test
    public void esperoQueEditeOElementoDoMeioDaFila() {
        Queue queue = new Queue();

        queue.add('a');
        queue.add('b');
        queue.add('c');

        String response = queue.edit('b', 'x');

        assertEquals(response, "Success: Elemento alterado com sucesso.");
        assertEquals(queue.findAllNodes(),
        """
        {value: a, nextValue: x, prevValue: null} 
        {value: x, nextValue: c, prevValue: a} 
        {value: c, nextValue: null, prevValue: x} 
        """);
    }

    @Test
    public void esperoQueEditeOUltimoElementoDaFila() {
        Queue queue = new Queue();

        queue.add('a');
        queue.add('b');
        queue.add('c');

        String response = queue.edit('c', 'x');

        assertEquals(response, "Success: Elemento alterado com sucesso.");
        assertEquals(queue.findAllNodes(),
        """
        {value: a, nextValue: b, prevValue: null} 
        {value: b, nextValue: x, prevValue: a} 
        {value: x, nextValue: null, prevValue: b} 
        """);
    }
}
