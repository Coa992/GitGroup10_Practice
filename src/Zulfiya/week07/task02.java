package Zulfiya.week07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class task02 {
    public static void main(String[] args) {
        List<String>names =new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));
        names.removeIf(p->p.equals("Ahmed"));
        System.out.println("names = " + names);

    }


    }
    /*
    2) ArrayList - Remove "Ahmed"
Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....
Write a java operation to remove all the names named Ahmed
     */

