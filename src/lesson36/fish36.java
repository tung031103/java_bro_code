package lesson36;

public class fish36 implements Prey36, predator36 {

    @Override
    public void hunt() {
        System.out.println("*This fish is hunting samller fish*");
    }

    @Override
    public void flea() {
        System.out.println("*This fish is fleeing from large fish*");
    }
}
