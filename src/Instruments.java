import java.lang.String;

public class Instruments {
    String name;
    double price;

    public Instruments(String name, double price) {
        this.name = name;
        this.price = price;
    }

    static {
        System.out.println("Se ha creado un instrumento");
    }

}