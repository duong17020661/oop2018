package week2.task1;
import java.util.Scanner;

public class Task1 {
    public static int gcd(int a, int b) {
        // TODO: Tính ước chung lớn nhất của 2 số a, b
        if(a==0) return b;
        else if(b==0) return a;
        else if(a>=b){
            if(a%b==0) return b;
            else return gcd(a%b,b);
        }
        else if(a<b){
            if(b%a==0) return a;
            else return gcd(b%a,a);
        }
        return 0;
    }

    public static int fibonacci(int n) {
        // TODO: Tìm số fibonacci ở vị trí n
        if(n==0) return 0;
        if(n==1) return 1;
        if(n>1) return fibonacci(n-1)+fibonacci(n-2);
        return 0;
    }
    public static void main(String[] args) {
        int a, b;
        Scanner scanIn = new Scanner(System.in);
        a = scanIn.nextInt();
        b = scanIn.nextInt();
        System.out.println(gcd(a,b));
        int n;
        n = scanIn.nextInt();
            System.out.println(fibonacci(n) + " ");
    }
}
