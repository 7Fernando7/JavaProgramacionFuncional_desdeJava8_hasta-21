package fundamentals.streams;

import fundamentals.util.Database;
import fundamentals.util.Videogame;

import java.util.stream.Stream;

public class StreamFinalOperators {

    public static void main(String[] args) {

        Stream<Videogame> videogames = Database.videogames.stream();

        //countOperator(videogames);
       //forEachOperator(videogames);
        //anyMatchOperator(videogames);
        //allMatchOperator(videogames);
        noneMatchOperator(videogames);
    }

    static void countOperator(Stream<Videogame> stream){
        System.out.println(stream.count());
    }

    static void forEachOperator(Stream<Videogame> stream){
        stream.forEach(System.out::println);
    }

    static void anyMatchOperator(Stream<Videogame> stream){
       boolean r = stream.anyMatch(v  -> v.getTotalSold() > 1);

        System.out.println(r);
    }

    static void allMatchOperator(Stream<Videogame> stream){
        boolean r = stream.allMatch(v  -> v.getTotalSold() > 150);

        System.out.println(r);
    }

    static void noneMatchOperator(Stream<Videogame> stream){
        boolean r = stream.noneMatch(v  -> v.getReviews().isEmpty());

        System.out.println(r);
    }



}
