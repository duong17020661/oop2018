package week11;

import java.util.ArrayList;

public class Task2 {
    public static <T extends Comparable> T Max(ArrayList<T> a){
        T max = a.get(0);
        for (int i = 0 ; i < a.size() ; i++){
            if(max.compareTo(a.get(i))<0) max = a.get(i);
        }
        return max;
    }

    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<Integer>();
        integers.add(1);
        integers.add(15);
        integers.add(14);
        integers.add(13);
        integers.add(11);
        integers.add(12);
        System.out.println(Max(integers));
    }
}
