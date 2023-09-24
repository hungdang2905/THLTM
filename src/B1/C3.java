package B1;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class C3 {
    static String prefix = "    ";



    public static void dirTree(String path, String temp) {
        File directory = new File(path);

        if (!directory.exists()) {
            System.out.println("Thư mục không tồn tại.");
            return;
        }

        System.out.print(temp);

        if (temp.isEmpty()) {
            System.out.println(directory.getName());
        } else {
            if (directory.isDirectory()) {
                System.out.println("- " + directory.getName());
            } else {
                System.out.println("+ " + directory.getName());
            }
        }

        if (directory.isDirectory()) {
            File[] files = directory.listFiles();

            if (files != null) {
                for (int i = 0; i < files.length; i++) {
                    File file = files[i];

                    dirTree(file.getAbsolutePath(), temp+"  ");
                }
            }
        }
    }
    public static void main(String[] args) {
        String path = "E:\\temp";
        dirTree(path, "|");
    }
}



