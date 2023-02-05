package tren_lop;

public class Person {
    public int id;
    public String name;
    public String address;

    public Person() {

    }

    public void print() {
        System.out.println("id: " + id + "; Name: " + name + "; Address: " + address);
    }

    public static void main(String[] args) {

        Person person1 = new Person();

        person1.name = "Bro";
        person1.id = 2123123;
        person1.address = "Ha Noi";

        person1.print();
    }
}
