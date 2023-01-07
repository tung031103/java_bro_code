package lesson40;

import java.io.File;

public class file {
    public static void main(String[] args) {
        File file = new File("C:\\myweb\\js_bro_code\\code_java\\lapTrinh_JAVA\\src\\lesson40\\secret.txt");
        if (file.exists()) {
            System.out.println("that file is exist!");
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.isFile());
            file.delete();
        } else {
            System.out.println("that file doesn't exist!");
        }
    }
}
