package B1;

import java.io.File;

public class C4 {
    public static void dirTree(String path, String temp) {
        File file = new File(path);

        if (!file.exists()) {
            System.out.println("Thư mục không tồn tại.");
            return;
        }
        long folderSize =0;

        System.out.print(temp);

        if (temp.isEmpty()) {
            System.out.println(file.getName()+": "+folderSize+" bytes");
        } else {
            if (file.isDirectory()) {
                System.out.println("- " + file.getName()+": "+folderSize+" bytes");
            } else {
                System.out.println("+ " + file.getName()+": "+ file.length()+" bytes");
            }
        }

        if (file.isDirectory()) {
            File[] files = file.listFiles();

            if (files != null) {
                for (int i = 0; i < files.length; i++) {
                    File f = files[i];
                    if(f.isFile()){
                        folderSize += f.length();
                    }

                    dirTree(f.getAbsolutePath(), temp+"  ");
                }
            }
        }

    }
    public static void main(String[] args) {
        String path = "D:\\temp";
        dirTree(path, "|");

    }
}
