package fundamentals.util_function;

import java.util.function.Function;
import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;

public class ExampleUnaryOperator {
    static Function<String, String> funToUpper = String::toUpperCase;
    static UnaryOperator<String> unaryOperatorUpper = String::toUpperCase;

    static UnaryOperator<Integer> int1 = n -> n*n;
    static IntUnaryOperator int2 = n -> n*n;

    public static void main(String[] args) {
        String arg = "lambda";

        System.out.println(funToUpper.apply(arg));
        System.out.println(unaryOperatorUpper.apply(arg));

        System.out.println(int1.apply(3));
        System.out.println(int2.applyAsInt(2));
    }
}
