package com.monzag;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomQueueTest {

    private CustomQueue<Integer> queue;

    @BeforeEach
    void setup() {
        this.queue = new CustomQueue<>();
    }

    @Test
    void testConstructor() {
        CustomQueue queue = new CustomQueue();
    }

    @Test
    void testEqueueInt() {
        queue.enqueue(1);
        queue.enqueue(2);
        Integer expect = 1;
        assertEquals(expect, queue.getFirst());
    }

    @Test
    void testEnqueueString() {
        CustomQueue<String> textQueue = new CustomQueue<>();
        textQueue.enqueue("000");
        textQueue.enqueue("abc");
        String expect = "000";
        assertEquals(expect, textQueue.getFirst());
    }

    @Test
    void testContextQueue() {
        queue.enqueue(1);
        queue.enqueue(2);
        String expect = "1 2 ";
        assertEquals(expect, queue.toString());
    }

    @Test
    void testDequeue() {
        queue.enqueue(3);
        queue.enqueue(4);
        Integer expect = 3;
        assertEquals(expect, queue.dequeue());
    }

    @Test
    void testDequeue2() {
        queue.enqueue(3);
        queue.enqueue(4);
        queue.dequeue();
        Integer expect = 4;
        assertEquals(expect, queue.getFirst());
    }

    @Test
    void testDequeueIfEmptyQueue() {
        assertThrows(EmptyQueueException.class, () -> queue.dequeue());
    }
}