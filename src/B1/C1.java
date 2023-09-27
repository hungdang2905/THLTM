package B1;

import java.io.File;

public class C1 {
    public static boolean deleteFile(String path) {
        File dir = new File(path);
        if (!dir.exists()) {
            return false;
        }
        if (!dir.isDirectory()) {
            return false;
        }
        File[] list = dir.listFiles();
        for (File f : list) {
            if (f.isFile()) {
                 f.delete();
                 return true;
            }
            return false;
        }
        return true;
    }

    public static boolean deleteAll(String path) {
        File dir = new File(path);
        if (!dir.exists()) {
            return false;
        }
        if (!dir.isDirectory()) {
            return false;
        }
        File[] list = dir.listFiles();
        for (File f : list) {
            f.delete();

            if(f.isDirectory()){
                deleteAll(f.getAbsolutePath());
                f.delete();
            }

        }
        return true;
    }

    public static void main(String[] args) {
        String path = "D:\\temp";
        boolean del = deleteAll(path);
        if (del) {
            System.out.println("success");
        } else {
            System.out.println("fail ");
        }
    }
}
