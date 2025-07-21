package fundamentals.streams;

import fundamentals.util.Database;
import fundamentals.util.Videogame;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamIntermediateOperators {
    public static void main(String[] args) {
        Stream<Videogame> videogames = Database.videogames.stream();

        //distinctOperator(videogames);
        //limitOperator(videogames);
        skipOperator(videogames);

    }

    static void distinctOperator(Stream<Videogame> stream ){
        System.out.println(stream.distinct().count());
    }

    static void limitOperator(Stream<Videogame> stream ){
        List<Videogame> r = stream.limit(5).collect(Collectors.toList());

        r.forEach(System.out::println);
    }

    static void skipOperator(Stream<Videogame> stream ){
        List<Videogame> r = stream.skip(15).collect(Collectors.toList());

        r.forEach(System.out::println);
    }

}
