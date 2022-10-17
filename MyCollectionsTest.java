package module9;

import java.util.LinkedList;
import java.util.List;

public class MyCollectionsTest {
    public static void main(String[] args) {
//        MyArrayList<String> strArr = new MyArrayList<>();
//        strArr.add("66");
//        strArr.add("24");
//        strArr.add("1");
//        strArr.add("6");
//        strArr.add("94");
//        strArr.add("33");
//        strArr.add("17");
//        System.out.println("strArr.size() = " + strArr.size());
//        System.out.println("strArr = " + strArr);
//        System.out.println("strArr.get(3) = " + strArr.get(3));
//
//        System.out.println("strArr.remove(3) = " + strArr.remove(3));
//        System.out.println("strArr = " + strArr);
//        System.out.println("strArr.size() = " + strArr.size());
//
//        System.out.println("strArr.get(3) = " + strArr.get(3));
//
//        strArr.clear();
//        System.out.println("strArr = " + strArr);

        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.add(22);
        list.add(15);
        list.add(54);
        list.print();
        System.out.println("list.size = " + list.size());

        list.remove(0);
        list.print();
        System.out.println("list.size = " + list.size());

        list.add(65);
        list.print();
        System.out.println("list.size = " + list.size());

        list.remove(2);
        list.print();
        System.out.println("list.size = " + list.size());

        list.remove(0);
        list.print();
        System.out.println("list.size = " + list.size());

        list.clear();
        System.out.println("list.size = " + list.size());

        list.add(698);
        list.add(69);
        list.add(121);
        list.add(1777);
        list.add(193);
        list.print();
        System.out.println("list.size = " + list.size());
        System.out.println("list.get(3) = " + list.get(1));


    }
}
