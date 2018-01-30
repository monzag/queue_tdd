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
        enqueueDataToQueue();
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
        enqueueDataToQueue();
        String expect = "1 2 3 4 ";
        assertEquals(expect, queue.toString());
    }

    @Test
    void testDequeue() throws EmptyQueueException {
        enqueueDataToQueue();
        Integer expect = 1;
        assertEquals(expect, queue.dequeue());
    }

    @Test
    void testDequeue2() throws EmptyQueueException {
        enqueueDataToQueue();
        queue.dequeue();
        Integer expect = 2;
        assertEquals(expect, queue.getFirst());
    }

    @Test
    void testDequeueIfEmptyQueue() {
        assertThrows(EmptyQueueException.class, () -> queue.dequeue());
    }

    private void enqueueDataToQueue() {
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
    }
}