import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Apple"); // Duplicates ignored
        System.out.println(fruits); // Output: [Apple, Banana] or [Banana, Apple]
    }
}