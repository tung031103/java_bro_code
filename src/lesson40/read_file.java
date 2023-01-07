package lesson40;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class read_file {
    public static void main(String[] args) {

        try {

            FileReader reader = new FileReader("C:\\myweb\\js_bro_code\\code_java\\lapTrinh_JAVA\\art.txt");
            int data = reader.read();
            while (data != -1) {
                System.out.print((char) data);
                data = reader.read();
            }
            reader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
