package JahanaM.week10;

import java.util.ArrayList;

public class ArrayListAsc {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(1);
        list.add(15);
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(7);
        list.add(5);
        list.add(6);
        sortAsc(list);
        System.out.println(list);
    }


    public static  void sortAsc( ArrayList<Integer> list){
        int arrL= list.size();
        for (int i=0; i<list.size();i++){
            for (int j=0;j< list.size()-1;j++){
                if(list.get(j)>list.get(j+1)){
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }

    }
}
