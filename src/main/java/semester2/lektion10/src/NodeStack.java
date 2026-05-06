package main.java.semester2.lektion10.src;

import java.util.NoSuchElementException;

public class NodeStack implements StackI {

    private Node top;

    @Override
    public void push(Object element) {

        Node newNode = new Node();
        newNode.data = element;
        newNode.next = top;
        top = newNode;

    }

    @Override
    public Object pop() {

        if (top == null) {
            throw new NoSuchElementException();
        }
        Node oldTop = top;
        Node newTop = top.next;
        top = newTop;
        return oldTop.data;
    }

    @Override
    public Object peek() {
        if (top == null) {
            throw new NoSuchElementException();
        }
        return top.data;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return top == null;
    }

    private class Node {
        public Object data;
        public Node next;
    }
}
