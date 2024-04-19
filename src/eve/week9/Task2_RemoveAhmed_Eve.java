package eve.week9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task2_RemoveAhmed_Eve {
    public static void main(String[] args) {
        ArrayList<String> names1 = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));
        names1.removeAll(Arrays.asList("Ahmed"));

        System.out.println(names1);

        System.out.println();
        System.out.println("------------------");

        List<String> names = new ArrayList<>();

        // Add some names to the list
        names.add("Ahmed");
        names.add("John");
        names.add("Ahmed");
        names.add("Jane");
        names.add("Ahmed");
        names.add("David");

        // Print the original list
        System.out.println("Original list: " + names);

        // Remove all names named Ahmed
        names.removeIf(name -> name.equals("Ahmed"));

        // Print the updated list
        System.out.println("Updated list: " + names);
    }
}
