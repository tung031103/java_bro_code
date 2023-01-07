package lesson33;

public class person33 {
    String name;
    int age;

    person33(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return this.name + "\n" + this.age + "\n";
    }
}
