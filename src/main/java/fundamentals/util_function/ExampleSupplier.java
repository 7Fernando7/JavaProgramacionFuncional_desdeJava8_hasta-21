package fundamentals.util_function;

import fundamentals.generico.Product;
import lombok.ToString;

import java.util.Random;
import java.util.function.Supplier;

public class ExampleSupplier {

    static Supplier<Integer> randomInt = () -> new Random().nextInt(100);

    static Supplier<MyProduct> productSupplier = () -> new MyProduct("Tv", 100);

    public static void main(String[] args) {
        System.out.println(randomInt.get());
        System.out.println(randomInt.get());
        System.out.println(productSupplier.get());
    }
}

@ToString
class MyProduct {
    String name;
    Integer price;

    public MyProduct(String name, Integer price) {
        this.name = name;
        this.price = price;
    }
}
