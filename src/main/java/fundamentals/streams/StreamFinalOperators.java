package fundamentals.streams;

import fundamentals.util.Database;
import fundamentals.util.Videogame;

import java.util.stream.Stream;

public class StreamFinalOperators {

    public static void main(String[] args) {

        Stream<Videogame> videogames = Database.videogames.stream();

        //countOperator(videogames);
        forEachOperator(videogames);
    }

    static void countOperator(Stream<Videogame> stream){
        System.out.println(stream.count());
    }

    static void forEachOperator(Stream<Videogame> stream){
        stream.forEach(System.out::println);
    }
}
