import java.lang.String;

public class Windinst extends Instruments implements Play  {
    public Windinst(String name, double price) {
        super(name, price);
    }


    public void play() {
        System.out.println("The instrument that is playing is from type wind");
    }
}
