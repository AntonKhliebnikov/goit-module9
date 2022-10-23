package module9;

public class MyHashMap<K, V> {
    private Node<K, V> element;
    private int size;

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
            return "Node{" +
                    "key=" + key +
                    ", value=" + value +
                    '}';
        }
    }

    public int size() {
        return size;
    }

    public void put(K key, V value) {
        Node<K, V> newNode = new Node<>(key, value);
        Node<K, V> currentNode = element;
        if (element == null) {
            element = newNode;
        } else {
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
        size++;
    }

    public void remove(K key) {
        Node<K, V> currentNode = element;
        Node<K, V> prevNode = element;
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
            assert element != null;
            element = element.next;
        } else if (prevNode.next != null) {
            prevNode.next = prevNode.next.next;
        }
        size--;
    }

    public void clear() {
        element = null;
        size = 0;
    }

    public V get(K key) {
        Node<K, V> newNode = element;
        V value = newNode.value;
        while (newNode != null) {
            if (newNode.key.equals(key)) {
                value = newNode.value;
            }
            newNode = newNode.next;
        }
        return value;
    }

    public void print() {
        Node<K, V> newNode = element;
        while (newNode != null) {
            System.out.println(newNode.key + ": " + newNode.value);
            newNode = newNode.next;
        }
    }
}
