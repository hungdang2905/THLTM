package B1;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class C2 {
    public static boolean findFirst(String path, String pattern) {
        File dir = new File(path);
        List<String> result = new ArrayList<>();
        if (!dir.exists()) {
            return false;
        }
        if (!dir.isDirectory()) {
            return false;
        }
        File[] list = dir.listFiles();
        for (File f : list) {
            if (f.isFile() && f.getName().contains(pattern)) {
                result.add(f.getName());

                return true;
            }

        }
        System.out.println(result);
        return true;
    }


    public static void main(String[] args) {
        String path = "D:\\temp";
        String pattern = "abc";
        boolean find = findFirst(path, pattern);


    }
}
