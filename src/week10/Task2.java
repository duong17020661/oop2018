package week10;

import java.util.Collections;
import java.util.Random;

public class Task2 {
    int[] a = new int[1000];
    public void Swap(int x, int y){
        int temp = x;
        x = y;
        y = temp;
    }
    public void CreateArray(){
        Random rd = new Random();
        for(int i = 0 ; i < a.length ; i++){
            a[i] = rd.nextInt(1000);
        }
    }
    public void BubbleSort(int[] a){
        for(int i = 0 ; i < a.length - 1 ; i++){
            for (int j = 0 ; j < a.length - 1 ; j++){
                if(a[j]>a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }

            }
        }
    }
    public void Print(){
        for (int i = 0 ; i < a.length ; i++){
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String[] args) {
        Task2 task2 = new Task2();
        task2.CreateArray();
        task2.BubbleSort(task2.a);
        task2.Print();

    }
}

