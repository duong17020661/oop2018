package week12;

public class SelectionSort implements Sort{

    @Override
    public void algorithm(int[] a) {
        for (int i = 0 ; i < a.length - 1 ; i++){
            for (int j = i+1 ; j < a.length ; j++){
                if(a[j]<a[i]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
}
