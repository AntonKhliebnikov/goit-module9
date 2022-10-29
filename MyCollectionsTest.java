package module9;

public class MyCollectionsTest {
    public static void main(String[] args) {
        MyHashMap<String, Integer> hashMap = new MyHashMap<>();

        hashMap.put("Anton", 36);
        hashMap.put("Kris", 26);
        hashMap.put("Polina", 38);
        hashMap.put("Anfisa", 38);
        hashMap.put("Tanya", 33);
        hashMap.put("Olya", 23);
        hashMap.put("Ira", 27);
        hashMap.put("Katya", 27);
        hashMap.put("Alyona", 30);
        hashMap.put("Yana", 23);
        hashMap.put("Masha", 33);
        hashMap.put("Anya", 39);
        hashMap.put("Tolik", 36);
        hashMap.put("Oksana", 40);
        hashMap.put("Vera", 30);
        hashMap.put("Sasha", 23);
        hashMap.put("Kolya", 28);
        hashMap.put("Anton", 28);
        hashMap.remove("Anton");
        hashMap.remove("Sasha");
        hashMap.remove("Anfisa");
        hashMap.remove("Katya");

//        System.out.println("hashMap.hash(\"Oksana\") = " + hashMap.hash("Anton"));
//        System.out.println("hashMap.hash(\"Sasha\") = " + hashMap.hash("Sasha"));
//        System.out.println("hashMap.hash(\"Vera\") = " + hashMap.hash("Vera"));
//        System.out.println("hashMap.size() = " + hashMap.size());
//        hashMap.remove("Yana");
        System.out.println("hashMap.size() = " + hashMap.size());
        System.out.println("hashMap = " + hashMap);
        hashMap.print();
//        System.out.println("hashMap.get(\"Anya\") = " + hashMap.get("Anya"));
//        System.out.println("hashMap.get(\"Katya\") = " + hashMap.get("Katya"));
//        System.out.println("hashMap.get(\"Oksana\") = " + hashMap.get("Oksana"));
//        System.out.println("hashMap.get(\"Anton\") = " + hashMap.get("Anton"));
//        System.out.println("hashMap.get(\"Anya\") = " + hashMap.get("Anya"));
//        System.out.println("hashMap.get(\"Oksana\") = " + hashMap.get("Oksana"));
//        System.out.println("hashMap.hash(\"Katya\") = " + hashMap.hash("Katya"));
//        System.out.println("hashMap.hash(\"Anya\") = " + hashMap.hash("Anya"));
//        System.out.println("hashMap.hash(\"Oksana\") = " + hashMap.hash("Oksana"));
//        System.out.println("hashMap.hash(\"Kolya\") = " + hashMap.hash("Kolya"));
//        System.out.println("hashMap.hash(\"Polina\") = " + hashMap.hash("Polina"));
//        System.out.println("hashMap.hash(\"Olya\") = " + hashMap.hash("Olya"));
//        System.out.println("hashMap.hash(\"Masha\") = " + hashMap.hash("Masha"));
//        hashMap.clear();
//        System.out.println("hashMap = " + hashMap);
//        System.out.println("hashMap.size() = " + hashMap.size());
    }
}