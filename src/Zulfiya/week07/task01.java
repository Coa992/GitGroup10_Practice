package Zulfiya.week07;

import java.util.Arrays;

public class task01 {
    public static void main(String[] args) {


        String[] namesF = {"Jahan", "Liza", "Olesya", "Kyimet"};
        String[] namesM = {"Mohammed", "Mohallad", "Aleksandr"};
       String[]group10=new String[namesM.length+namesF.length];
       int group10Index = 0;

        for (int i = 0; i < namesF.length; i++,group10Index++) {
            group10[group10Index]=namesF[i];
        }
        for (int i = 0; i < namesM.length; i++,group10Index++) {
            group10[group10Index]=namesM[i];
        }
        System.out.println("group10 = " + Arrays.toString(group10));


    }
}
