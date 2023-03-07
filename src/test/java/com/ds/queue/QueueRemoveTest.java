package com.ds.queue;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.ds.Queue;

public class QueueRemoveTest {
    @Test
    public void esperoQueRetorneUmErroDadoUmFilaVazia() {
        Queue queue = new Queue();

        String response = queue.remove();

        assertEquals(response, "Error: Fila vazia.");
    }

    @Test
    public void esperoQueRemoveOPrimeiroEUnicoElementoDaFila() {
        Queue queue = new Queue();

        queue.add('a');
        
        String response = queue.remove();

        assertEquals(response, "Success: Elemento removido com sucesso.");
        assertEquals(queue.findAllNodes(), "");
    }
    
    @Test
    public void esperoQueRemoveOPrimeiroElementoDaFilaComTresElementosAdicionados() {
        Queue queue = new Queue();

        queue.add('a');
        queue.add('b');
        queue.add('c');
        
        String response = queue.remove();

        assertEquals(response, "Success: Elemento removido com sucesso.");
        assertEquals(queue.findAllNodes(),
        """
        {value: b, nextValue: c, prevValue: null}
        {value: c, nextValue: null, prevValue: b}     
        """);
    }
}
