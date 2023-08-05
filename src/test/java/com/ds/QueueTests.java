package com.ds;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class QueueTests {
    @Test
    public void esperoQueCrieUmQueueComCincoElementos() {
        Queue queue = new Queue();

        queue.enqueue("a");
        queue.enqueue("b");
        queue.enqueue("c");
        queue.enqueue("d");
        queue.enqueue("e");

        assertThat(queue.peek().getData()).isEqualTo("a");
        assertThat(queue.peek().getPrev().getData()).isEqualTo("b");
        assertThat(queue.peek().getPrev().getPrev().getData()).isEqualTo("c");
        assertThat(queue.peek().getPrev().getPrev().getPrev().getData()).isEqualTo("d");
        assertThat(queue.peek().getPrev().getPrev().getPrev().getPrev().getData()).isEqualTo("e");
        
        assertThat(queue.getRear().getData()).isEqualTo("e");
        assertThat(queue.isEmpty()).isEqualTo(false);
    }

    @Test
    public void esperoQueCrieUmQueueComCincoElementosERemovaTodosOElementos() {
        Queue queue = new Queue();

        queue.enqueue("a");
        queue.enqueue("b");
        queue.enqueue("c");
        queue.enqueue("d");
        queue.enqueue("e");

        queue.dequeue();
        assertThat(queue.peek().getData()).isEqualTo("b");

        queue.dequeue();
        assertThat(queue.peek().getData()).isEqualTo("c");

        queue.dequeue();
        assertThat(queue.peek().getData()).isEqualTo("d");

        queue.dequeue();
        assertThat(queue.peek().getData()).isEqualTo("e");
        assertThat(queue.getRear().getData()).isEqualTo("e");

        queue.dequeue();
        assertThat(queue.peek()).isEqualTo(null);
        assertThat(queue.getRear()).isEqualTo(null);
        assertThat(queue.isEmpty()).isEqualTo(true);
    }
}
