public class StringInst extends Instruments implements Play {
    public StringInst(String name, double price) {
        super(name, price);
    }


    public void play() {
        System.out.println("The instrument that is playing is from type string");
    }
}

