package module9;

public class MyCollectionsTest {
    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<>();
        queue.add(56);
        queue.add(999);
        queue.add(94);
        queue.add(36);
        queue.add(41);
        queue.print();
        System.out.println("queue.size() = " + queue.size());
        queue.remove(4);
        queue.print();
        System.out.println("queue.peek() = " + queue.peek());
        queue.print();
        System.out.println("queue.poll() = " + queue.poll());
        queue.print();
        System.out.println("queue.poll() = " + queue.poll());
        queue.print();
        queue.clear();
        queue.print();
    }
}
