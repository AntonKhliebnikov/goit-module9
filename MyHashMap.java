package module9;

import java.util.Arrays;
import java.util.Objects;

public class MyHashMap<K, V> {
    private static final int DEFAULT_CAPACITY = 16;
    private Node<K, V>[] table;
    private int size;

    @SuppressWarnings("unchecked")
    public MyHashMap(int initCapacity) {
        if (initCapacity <= 0) {
            throw new IllegalArgumentException();
        }
        table = (Node<K, V>[]) new Node<?, ?>[initCapacity];
    }

    public MyHashMap() {
        this(DEFAULT_CAPACITY);
    }

    public static class Node<K, V> {
        K key;
        V value;
        Node<K, V> next;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString() {
            return key + "=" + value;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Node<?, ?> node)) return false;
            return key.equals(node.key) && value.equals(node.value);
        }

        @Override
        public int hashCode() {
            return Objects.hash(key, value);
        }
    }

    public int hash(K key) {
        int hash;
        hash = key.hashCode() % table.length;
        if (hash < 0) {
            hash *= -1;
        }
        return hash;
    }

    public int size() {
        return size;
    }
    
    public void put(K key, V value) {
        Node<K, V> newNode = new Node<>(key, value);
        Node<K, V> currentNode;
        int index = 0;
        for (Node<K, V> ignored : table) {
            if (hash(key) == index) {
                if (table[index] == null) {
                    table[index] = newNode;
                    break;
                } else {
                    currentNode = table[index];
                    while (currentNode.next != null) {
                        if (currentNode.key.equals(key)) {
                            currentNode.value = value;
                            return;
                        }
                        currentNode = currentNode.next;
                    }

                    if (currentNode.key.equals(key)) {
                        currentNode.value = value;
                        return;
                    }
                    currentNode.next = newNode;
                }
            }
            index++;
        }
        size++;
    }

    @SuppressWarnings("ReassignedVariable")
    public void remove(K key) {
        Node<K, V> currentNode = null;
        Node<K, V> prevNode = null;
        int indexOfTableElements = 0;
        for (Node<K, V> ignored : table) {
            if (hash(key) == indexOfTableElements) {
                currentNode = table[indexOfTableElements];
                prevNode = table[indexOfTableElements];
                break;
            }
            indexOfTableElements++;
            System.out.println("indexOfTableElements = " + indexOfTableElements);
        }

        int index = 0;
        while (currentNode != null) {
            if (currentNode.key.equals(key)) {
                break;
            }
            index++;
            currentNode = currentNode.next;
        }

        for (int i = 0; i < index - 1; i++) {
            prevNode = prevNode.next;
        }

        if (index == 0) {
            assert prevNode != null;
            table[indexOfTableElements] = prevNode.next;
            System.out.println("prevNode = " + prevNode);
        } else if (prevNode.next != null) {
            prevNode.next = prevNode.next.next;
        }
        size--;
    }

    public void clear() {
        table = null;
        size = 0;
    }

    public V get(K key) {
        V value = null;
        for (Node<K, V> element : table) {
            Node<K, V> newNode = element;
            while (newNode != null) {
                if (newNode.key.equals(key)) {
                    value = newNode.value;
                }
                newNode = newNode.next;
            }
        }
        return value;
    }

    public void print() {
        int index = 0;
        for (Node<K, V> ignored : table) {
            if (table[index] != null) {
                if (index == hash(table[index].key)) {
                    Node<K, V> newNode = table[index];
                    while (newNode != null) {
                        System.out.print("[" + newNode.key + "=" + newNode.value + "], ");
                        newNode = newNode.next;
                    }
                }
            }
            index++;
        }
    }
}
