package week7.task2;

import java.io.*;


public class Task2 {
    void NullPointer(){
        try {
            String a = null;
            System.out.println(a.length());
        }catch(NullPointerException e){
            System.out.println(e);
        }
    }
    void Bound(){
        try {
            int[] a = new int[5];
            a[5] = 10;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
    void ClassCast(){
        try {
            Object n = new Integer(1);
            String s = (String) n;
        }catch (ClassCastException e){
            System.out.println(e);
        }
    }
    void Arithmetic(){
        try {
            System.out.println(10 / 0);
        }catch (ArithmeticException e){
            System.out.println(e);
        }
    }
    void IOE() throws IOException{
        try {
            throw new IOException("");
        }catch (IOException e) {
            System.out.println(e);
        }
    }
    void FileNotFound() throws IOException{
        try {
            File file = new File("lines.txt");
            FileReader fr = new FileReader(file);
        }catch (FileNotFoundException e){
            System.out.println(e);
        }
    }
    public static void main(String[] args) throws IOException {
        Task2 task2 = new Task2();
        task2.NullPointer();
        task2.Bound();
        task2.Arithmetic();
        task2.ClassCast();
        task2.IOE();
        task2.FileNotFound();

    }
}
