package fundamentals.reference_methods;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class ObjectMethodReference {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(10);

        IntStream repeat = IntStream.range(1,14);

        repeat.forEach(numbers::add);

        System.out.println(numbers);
    }
}

/** Referencias a Métodos
 * Un referencia es una funcionalidad de Java 8+ que puede sustituir a una expresión Lambda cuya única instrucción
 * consiste en la llamada a un método.
 *
 * El  compilador infiere las variables dadas por el parametro en el argumento del método.
 *
 * **/