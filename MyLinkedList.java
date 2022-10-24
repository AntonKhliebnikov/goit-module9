package module9;

import java.util.Objects;

public class MyLinkedList<T> {
    private int size;
    private Node<T> first;
    private Node<T> last;

    public MyLinkedList() {
        first = null;
        last = null;
    }

    public static class Node<T> {
        T element;
        Node<T> next;
        Node<T> prev;

        public Node(T element) {
            this.element = element;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "element=" + element +
                    '}';
        }
    }

    public int size() {
        return size;
    }

    public void add(T element) {
        Node<T> newNode = new Node<>(element);
        if (first == null) {
            first = last = newNode;
        } else {
            last.next = newNode;
        }

        newNode.prev = last;
        last = newNode;
        size++;
    }

    public void clear() {
        first = last = null;
        size = 0;
    }

    public Node<T> get(int index) {
        Objects.checkIndex(index, size);
        Node<T> currentNode = first;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }
        return currentNode;
    }

    public void remove(int index) {
        Objects.checkIndex(index, size);
        Node<T> currentNode = first;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }

        if (first == currentNode) {
            first = first.next;
        }

        if (last == currentNode) {
            last = last.prev;
        }
        currentNode.prev.next = currentNode.next;
        size--;
    }

    public void print() {
        Node<T> newNode = first;
        while (newNode != null) {
            System.out.println(newNode.element);
            newNode = newNode.next;
        }
    }
}
