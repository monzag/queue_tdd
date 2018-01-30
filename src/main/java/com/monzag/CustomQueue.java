package com.monzag;

public class CustomQueue {

    private Node first;
    private Node last;

    public void add(int i) {
        Node newItem = new Node(i);
        if (first == null) {
            first = newItem;
            last = first;

        } else {
            last.setNext(newItem);
            last = newItem;
        }
    }

    public int getFirst() {
        return first.getData();
    }
}
