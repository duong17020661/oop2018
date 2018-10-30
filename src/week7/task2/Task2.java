package week7.task2;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Task2 {
}
class Null{

    public static void main(String[] args) throws NullPointerException{
        String a = null;
        System.out.println(a.length());
    }

    public Null() { }
}
class Bound {
    public static void main(String[] args) {
        int[] a = new int[5];
        a[5] = 10;
    }

    public Bound() {
    }
}
class Arithmetic {
    public static void main(String[] args) {
        System.out.println(10/0);
    }
}
class classCast {
    public static void main(String[] args) {
        Object n = new Null();
        Bound b = (Bound) n;
    }
}
class IOE {
    
}
class FileNotFound{
    public static void main(String[] args) throws IOException {
        File file=new File("lines.txt");
        System.out.println(file.exists());
        Scanner scan = new Scanner(file);
    }
}
