package lesson73;

import java.io.*;

public class lesson73 {
    public static void main(String[] args) throws IOException, FileNotFoundException {

        User user = new User();
        user.name = "Tung Code";
        user.password = "password321";
        // user.sayHello();

        FileOutputStream fos = new FileOutputStream(
                "C:\\myweb\\js_bro_code\\code_java\\lapTrinh_JAVA\\userInfo.txt");
        ObjectOutputStream out = new ObjectOutputStream(fos);
        out.writeObject(user);

        out.close();
        fos.close();
        System.out.println("object info saved! :)");

    }
}
