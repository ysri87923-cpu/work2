package DAY12;
import java.util.ArrayList;
public class arraylist {
    static void main() {

        ArrayList<String> list = new ArrayList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Orange");

        System.out.println(STR."ArrayList: \{list}");

        System.out.println("First Element: " + list.getFirst());

        list.remove("Banana");

        System.out.println(STR."After Remove: \{list}");

        System.out.println("Size: " + list.size());
    }
}