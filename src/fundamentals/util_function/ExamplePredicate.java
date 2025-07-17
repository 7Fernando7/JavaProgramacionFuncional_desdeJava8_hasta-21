package fundamentals.util_function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class ExamplePredicate {

    public static void main(String[] args) {

        Predicate<Integer> isGreaterThan100 = n -> n > 100;

        Predicate<Integer> isLessThan10 = n -> n < 10;

        Predicate<Integer> isBetween10And100 = isGreaterThan100.or(isLessThan10);



        List<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,10,50,100,150,200));

        //numbers.removeIf(n -> n > 100);
        //numbers.removeIf(isBetween10And100);
        numbers.removeIf(isBetween10And100.negate());


        System.out.println(numbers);

    }
}
