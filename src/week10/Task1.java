package week10;

import week9.Utils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Task1 {

    List<String> getAllFunctions(File path){
        List<String> function = new ArrayList<String>();
        String s = null;
        try {
            s = new String(Files.readAllBytes(Paths.get(String.valueOf(path))));
        } catch (IOException e) {
            e.printStackTrace();
        }

        String[] f = s.split("//");
        function.add(f[1]);
        function.add(f[2]);
        function.add(f[3]);
        function.add(f[4]);
        return function;
    }

    public String findFunctionByName(String name){
        Task1 task = new Task1();
        File file = new File("src\\week9\\Utils.java");
        List<String> function = new ArrayList<>();
        function = task.getAllFunctions(file);
        String s = Utils.findFileByName("k","k").getName();
        System.out.println(s);
        for (int i=0;i<function.size();i++){

        }
        return s;
    }


    public static void main(String[] args) {
        Task1 task = new Task1();
        File file = new File("src\\week9\\Utils.java");
        List<String> function = new ArrayList<>();
        function = task.getAllFunctions(file);
        System.out.println(function.get(0));
        System.out.println(task.findFunctionByName("d"));
    }
}
