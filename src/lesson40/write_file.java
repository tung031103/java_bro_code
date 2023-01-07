package lesson40;

import java.io.FileWriter;

public class write_file {
    public static void main(String[] args) {

        try {
            FileWriter writer = new FileWriter("poem.txt");
            writer.write("Hello world!\nToi la Hoang Dinh Tung\nBac Son-Lang Son");
            writer.append("\n(A poem by Bro)");
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
