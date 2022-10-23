package module9;

public class MyCollectionsTest {
    public static void main(String[] args) {
        MyHashMap<String, Integer> hashMap = new MyHashMap<>();

        hashMap.put("Anton", 36);
        hashMap.put("Polina", 38);
        hashMap.put("Kris", 26);
        hashMap.put("Tanya", 45);

        hashMap.print();
        System.out.println("hashMap.size() = " + hashMap.size());

        hashMap.remove("Anton");

        hashMap.print();
        System.out.println("hashMap.size() = " + hashMap.size());

        hashMap.put("Toha", 33);

        hashMap.print();
        System.out.println("hashMap.size() = " + hashMap.size());

        hashMap.remove("Tanya");
        hashMap.remove("Toha");
        hashMap.remove("Polina");
        hashMap.remove("Kris");


        hashMap.print();
        System.out.println("hashMap.size() = " + hashMap.size());



    }
}