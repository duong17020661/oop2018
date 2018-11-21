package week11;

import java.util.Collections;

public class Task1<T> {
    private T value;
    public Task1(){
        value = null;
    }
    public Task1(T value){
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

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
        Sort(word);
        for(int i = 0 ; i < word.length ; i++){
            System.out.println(word[i]);
        }
    }
}
