package fundamentals.util_function;

import java.util.function.Function;

public class ExampleFunction1 {

    static Function<Integer, Integer> multyply = n -> n * 10;

    static Function<Integer, Integer> sum = n -> n + 10;

    static Function<Integer, Integer> addThenMultply = multyply.andThen(sum);
    static Function<Integer, Integer> composeMultply = multyply.compose(sum);

    public static void main(String[] args) {
        System.out.println(multyply.apply(5));
        System.out.println(sum.apply(5));
        System.out.println(addThenMultply.apply(5));
        System.out.println(composeMultply.apply(5));

    }
}


/** Paquete java.util.function
 *  El paquete java.util.function esta presente a partir de la versión de 1.8 de JDK y nos provee un conjunto de interfaces
 *  funcionales, cada una con un proposito distinto.
 *
 *  Interface Function<T,V> => Representa una función que acepta un argumento y produce un resultado.
 *
 *  R apply(T,t) => Aplica la función dando un argumento
 *  Métodos
 *
 *  Compose(Function <? super V,? extends T> before), combina dos funcciones, pasamos dos Lambdas y va a combinar, primero
 *  aplica la función pasada por argumento y despues el método Apply
 *
 *  andThen(Function <? super R,? extends V> after), concatena primero ejecuta una función y luego la otra,
 *  Despúes de aplicar la función apply, aplica la función dada por parámetro.
 *
 * **/