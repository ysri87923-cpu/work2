package DAY12;
import java.util.HashSet;
public class hashset {
    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();

        set.add("Apple");
        set.add("Banana");
        set.add("Apple");
        set.add("Orange");

        System.out.println("Set: " + set);

        System.out.println("Contains Banana: " + set.contains("Banana"));

        set.remove("Banana");

        System.out.println("After Remove: " + set);

        System.out.println("Size: " + set.size());
    }
}