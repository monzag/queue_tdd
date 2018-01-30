package com.monzag;

public class CustomQueue<T> {

    private Node<T> first;
    private Node<T> last;

    public void enqueue(T i) {
        Node newItem = new Node(i);
        if (first == null) {
            first = newItem;
            last = first;

        } else {
            last.setNext(newItem);
            last = newItem;
        }
    }

    public T getFirst() {
        return first.getData();
    }

    @Override
    public String toString() {
        String result = "";
        Node current = first;

        while (current != null) {
            result += current.getData() + " ";
            current = current.getNext();
        }

        return result;
    }
}
