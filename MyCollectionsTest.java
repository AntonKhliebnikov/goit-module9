package module9;

public class MyCollectionsTest {
    public static void main(String[] args) {
        MyArrayList<String> strArr = new MyArrayList<>();
        strArr.add("66");
        strArr.add("24");
        strArr.add("1");
        strArr.add("6");
        strArr.add("94");
        strArr.add("33");
        strArr.add("17");
        System.out.println("strArr.size() = " + strArr.size());
        System.out.println("strArr = " + strArr);
        System.out.println("strArr.get(3) = " + strArr.get(3));

        System.out.println("strArr.remove(3) = " + strArr.remove(3));
        System.out.println("strArr = " + strArr);
        System.out.println("strArr.size() = " + strArr.size());

        System.out.println("strArr.get(3) = " + strArr.get(3));
        
        strArr.clear();
        System.out.println("strArr = " + strArr);
    }
}
