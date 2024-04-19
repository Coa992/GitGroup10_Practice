package Lisa.week9.task2;

import java.util.ArrayList;
import java.util.Collections;

public class RemoveAhmed {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Ahmed");
        list.add("John");
        list.add("Eric");
        list.add("Ahmed");
        removeAhmed(list);
    }

    public static void removeAhmed(ArrayList nameList) {
        nameList.removeIf(p -> p.equals("Ahmed"));


        System.out.println(nameList);


    }
}
/*
2) ArrayList - Remove "Ahmed"
Given a list of people' names: "Ahmed", "John", Eric", "Ahmed"..... Write a java operation to
remove all the names named Ahmed

 */
