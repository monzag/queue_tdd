package com.monzag;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomQueueTest {

    private CustomQueue queue;

    @BeforeEach
    void setup() {
        this.queue = new CustomQueue();
    }

    @Test
    void testConstructor() {
        CustomQueue queue = new CustomQueue();
    }

    @Test
    void testEqueue() {
        queue.add(1);
        queue.add(2);
        int expect = 1;
        assertEquals(expect, queue.getFirst());
    }
}