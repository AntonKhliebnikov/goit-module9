package module9;

public class MyCollectionsTest {
    public static void main(String[] args) {

        MyLinkedList<String> linkedList = new MyLinkedList<>();
        linkedList.add("next0");
        linkedList.add("next1");
        linkedList.add("next2");
        linkedList.add("next3");
        System.out.println("linkedList.size() = " + linkedList.size());
        linkedList.remove(2);
        System.out.println("linkedList.size() = " + linkedList.size());
        linkedList.print();
        System.out.println("linkedList.get(0) = " + linkedList.get(0));
    }
}