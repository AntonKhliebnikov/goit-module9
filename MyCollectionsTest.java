package module9;

import java.util.Stack;

public class MyCollectionsTest {
    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<>();
        stack.push(54);
        stack.push(9);
        stack.push(674);
        stack.push(111);
        stack.push(19);
        stack.print();

        System.out.println("stack.size() = " + stack.size());

        System.out.println("stack.peek() = " + stack.peek());
        System.out.println("stack.pop() = " + stack.pop());
        stack.print();
        System.out.println("stack.size() = " + stack.size());

        stack.print();
        System.out.println("stack.size() = " + stack.size());

        stack.pop();
        stack.print();
    }
}
