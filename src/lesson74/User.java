package lesson74;

import java.io.*;

public class User implements Serializable {
    String name;
    String password;

    public void sayHello() {
        System.out.println("hello " + name);
    }
}
