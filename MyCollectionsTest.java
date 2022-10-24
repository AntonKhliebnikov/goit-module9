package module9;

public class MyCollectionsTest {
    public static void main(String[] args) {

        MyArrayList<Integer> list = new MyArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        System.out.println("list = " + list);
        System.out.println("list.remove(4) = " + list.remove(4));
        System.out.println("list = " + list);
        list.clear();



        System.out.println("list = " + list);





    }
}