package week9;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Utils {

//
    public static String readContentFromFile(String path) throws IOException {
        File file = new File(path);
        FileReader reader = new FileReader(file);
        InputStreamReader reader1 = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(reader);
        String s;
        s = new String(Files.readAllBytes(Paths.get(path)));
        in.close();
        return s;
    }

//
    public static void writeContentToFile(String path) throws IOException {
        File file = new File(path);
        FileWriter writer = new FileWriter(file);
        PrintWriter out = new PrintWriter(writer);
        String s = "Hello";
        out.println(s);
        out.close();
    }

//
    public static void appendContentToFile(String path) throws IOException {
        File file = new File(path);
        FileWriter writer = new FileWriter(file.getAbsoluteFile(),true);
        PrintWriter out = new PrintWriter(writer);
        String s = "UET";
        out.println(s);
        out.close();
    }

//
    public static File findFileByName(String folderPath, String fileName){
        File file = new File(folderPath);
        if (file.exists()) {
            if (file.isFile()) {
                if (file.getName().equals(fileName)) {
                    System.out.println(file.getAbsolutePath());
                }
                else {
                    System.out.println("khong ton tai");
                }
            }
            File[] listFile = file.listFiles();
            if (listFile != null) {
                for (File f : listFile) {
                    findFileByName(f.getAbsolutePath(), fileName);
                }
            }
        }
        else {
            try {
                file.createNewFile();
            }catch (IOException e){
                e.printStackTrace();
            }
            System.out.println("source không tồn tại");
        }
        return file;
    }

//
    public static void main(String[] args) throws IOException {

        String filename1 = "Hawaii.txt";
        String filename2 = "data2.txt";
        writeContentToFile(filename2);
        appendContentToFile(filename2);
        System.out.println(readContentFromFile(filename2));
        findFileByName("folder","data.txt");
        System.out.println(findFileByName("New folder","datatxt"));
    }
}
