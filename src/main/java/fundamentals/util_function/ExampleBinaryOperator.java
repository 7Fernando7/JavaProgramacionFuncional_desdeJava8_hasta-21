package fundamentals.util_function;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class ExampleBinaryOperator {

    public static void main(String[] args) {
        BiFunction<String, String, String> normalizeFunc = (a, b) -> a.toUpperCase() + "-" + b.toLowerCase();

        System.out.println(normalizeFunc.apply("hola", "MUNDO"));

        BinaryOperator<String> normalize = (a, b) -> a.toUpperCase() + "-" + b.toLowerCase();

        System.out.println(normalize.apply("hola", "MUNDOOOOOO"));
    }
}
