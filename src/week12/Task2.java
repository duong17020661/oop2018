package week12;

public class Task2 {
    private Sort sort;

    public Task2(Sort sort) {
        this.sort = sort;
    }

    public void algorithm(int[] a){
        sort.algorithm(a);
    }

    public static void main(String[] args) {
        int[] a = { 4 , 1 , 2 , 3 , 4 , 1 , 10 , 7 , 9};
        Task2 sort = new Task2(new BubbleSort());
        sort.algorithm(a);
        for(int i = 0 ; i < a.length ; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
        Task2 sort1 = new Task2(new SelectionSort());
        sort1.algorithm(a);
        for(int i = 0 ; i < a.length ; i++){
            System.out.print(a[i] + " ");
        }
    }
}
