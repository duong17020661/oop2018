package week9;

import java.io.*;

public class Utils {
    public static String readContentFromFile(String path) throws IOException {
        File file = new File(path);
        FileReader reader = new FileReader(file);
        BufferedReader in = new BufferedReader(reader);
        String s = in.readLine();
        in.close();
        return s;
    }
    public static void writeContentToFile(String path) throws IOException {
        File file = new File(path);
        FileWriter writer = new FileWriter(file);
        PrintWriter out = new PrintWriter(writer);
        String s = "Hello";
        out.println(s);
        out.close();

    }
    public static void appendContentToFile(String path) throws IOException {
        File file = new File(path);
        FileWriter writer = new FileWriter(file.getAbsoluteFile(),true);
        PrintWriter out = new PrintWriter(writer);
        String s = "UET";
        out.println(s);
        out.close();
    }
    public static File findFileByName(String folderPath, String fileName){
        File file = new File(folderPath);
        if (file.exists()) {
            if (file.isFile()) {
                if (file.getName().equals(fileName)) {
                    System.out.println(file.getAbsolutePath());
                }
            }
            File[] listFile = file.listFiles();
            if (listFile != null) {
                for (File f : listFile) {
                    findFileByName(f.getAbsolutePath(), fileName);
                }
            }
        } else {
            System.out.println("source không tồn tại");
        }
        return file;
    }

    public static void main(String[] args) throws IOException {
        String filename1 = "Hawaii.txt";
        String filename2 = "data.txt";
        System.out.println(readContentFromFile(filename1));
        writeContentToFile(filename2);
        appendContentToFile(filename2);
    }
}
