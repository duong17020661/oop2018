package week11;

public class Task1<T> {
    public static <T extends Comparable> void Sort(T[] a){
        for(int i = 0 ; i < a.length - 1 ; i++){
            for (int j = 0 ; j < a.length - 1 ; j++){
                if(a[j].compareTo(a[j+1])>0){
                    T temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }

            }
        }
    }
    public static void main(String[] args) {
        String[] word = {"dasdd", "ba", "asd", "bc"};
        Integer[] num = {1,1,2,3,5,7,7};
        Sort(word);
        for(int i = 0 ; i < word.length ; i++){
            System.out.println(word[i]);
        }
        Sort(num);
        for(int i = 0 ; i < num.length ; i++){
            System.out.println(num[i]);
        }
    }
}
