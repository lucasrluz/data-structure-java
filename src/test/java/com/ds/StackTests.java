package com.ds;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class StackTests {
    @Test
    public void esperoQueCrieUmaStackCincoElementos() {
        Stack<String> stack = new Stack<String>();

        stack.push("a");
        stack.push("b");
        stack.push("c");
        stack.push("d");
        stack.push("e");

        assertThat(
            stack.peek().getData()
        ).isEqualTo("e");
        
        assertThat(
            stack.peek().getPrev().getData()
        ).isEqualTo("d");
        
        assertThat(
            stack.peek().getPrev().getPrev().getData()
        ).isEqualTo("c");

        assertThat(
            stack.peek().getPrev().getPrev().getPrev().getData()
        ).isEqualTo("b");

        assertThat(
            stack.peek().getPrev().getPrev().getPrev().getPrev().getData()
        ).isEqualTo("a");

        assertThat(stack.isEmpty()).isEqualTo(false);
    }

    @Test
    public void esperoQueCrieUmaStackCincoElementosERemovaTodosOsElementos() {
        Stack<String> stack = new Stack<String>();

        stack.push("a");
        stack.push("b");
        stack.push("c");
        stack.push("d");
        stack.push("e");

        assertThat(stack.isEmpty()).isEqualTo(false);

        stack.pop();
        assertThat(stack.peek().getData()).isEqualTo("d");
        assertThat(stack.peek().getNext()).isEqualTo(null);
        assertThat(stack.peek().getPrev().getData()).isEqualTo("c");

        stack.pop();
        assertThat(stack.peek().getData()).isEqualTo("c");
        assertThat(stack.peek().getNext()).isEqualTo(null);
        assertThat(stack.peek().getPrev().getData()).isEqualTo("b");

        stack.pop();
        assertThat(stack.peek().getData()).isEqualTo("b");
        assertThat(stack.peek().getNext()).isEqualTo(null);
        assertThat(stack.peek().getPrev().getData()).isEqualTo("a");

        stack.pop();
        assertThat(stack.peek().getData()).isEqualTo("a");
        assertThat(stack.peek().getNext()).isEqualTo(null);
        assertThat(stack.peek().getPrev()).isEqualTo(null);

        stack.pop();
        assertThat(stack.peek()).isEqualTo(null);

        assertThat(stack.isEmpty()).isEqualTo(true);
    }
}
