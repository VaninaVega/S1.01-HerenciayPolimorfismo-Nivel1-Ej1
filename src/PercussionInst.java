import java.lang.String;

public class PercussionInst extends Instruments implements Play {
    public PercussionInst(String name, double price) {
        super(name, price);
    }

    public void play() {
        System.out.println("The instrument that is playing is from type percussion");
    }
}

