package fundamentals.streams;

import fundamentals.util.BasicVideoGame;
import fundamentals.util.Database;
import fundamentals.util.Review;
import fundamentals.util.Videogame;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamIntermediateOperators {
    public static void main(String[] args) {
        Stream<Videogame> videogames = Database.videogames.stream();

        //distinctOperator(videogames);
        //limitOperator(videogames);
        //skipOperator(videogames);
        //filterOperator(videogames);
        //mapOperator(videogames);
        //flatMapOperator(videogames);
        //mapVsFlatMapOperator(videogames);
        //peekMapOperator(videogames);
        //sortOperator(videogames);
        //takeWhileOperator(videogames);
        dropWhileOperator(videogames);


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

    static void filterOperator(Stream<Videogame> stream ){
        List<Videogame> r = stream
                .filter( v-> v.getPrice() > 30.0)
                .filter(v -> !v.getIsDiscount())
                .filter(v -> v.getOfficialWebsite().contains("forza"))
                .collect(Collectors.toList());

       r.forEach(System.out::println);
        };

    static void mapOperator(Stream<Videogame> stream ){
        List<BasicVideoGame> basicVideoGameList = stream
                .map(v -> {
                   return BasicVideoGame.builder()
                           .name(v.getName())
                           .price(v.getPrice())
                           .console(v.getConsole())
                           .build();
                }).collect(Collectors.toList());


        List<String> titles = basicVideoGameList.stream().map(BasicVideoGame::getName).collect(Collectors.toList());
        basicVideoGameList.forEach(System.out::println);

        System.out.println("------");
        titles.forEach(System.out::println);
    };

    static void flatMapOperator(Stream<Videogame> stream) {
        List<Review> r = stream
                .flatMap(v -> v.getReviews().stream())
                .collect(Collectors.toList());

        System.out.println(r);
    }

    static void mapVsFlatMapOperator(Stream<Videogame> stream) {
        //var totalReviwes = stream.map( v -> v.getReviews().size()).collect(Collectors.toList());

       Long totalReviews = stream.flatMap(v -> v.getReviews().stream()).count();
        System.out.println(totalReviews);
    }

    /** Aplanamos el resultado y tratamos la lista de lista como se fuese una sola lista, está es la diferencia. **/

    static void peekMapOperator(Stream<Videogame> stream) {


        stream.peek(v -> v.setName("")).forEach(System.out::println);

        /** Peek y forEach
         * Peek es un operador intermedio, regresa otro strem igual para seguir con el pipeline.
         * Peek con Collect.toList() que es un operador final si funciona.
         * **/
    }

    static void sortOperator(Stream<Videogame> stream) {

        List<Videogame> listSorted = stream
                .sorted(Comparator.comparingInt(v -> v.getReviews().size()))
                .collect(Collectors.toList());

        listSorted.forEach(System.out::println);
    }
    static void takeWhileOperator(Stream<Videogame> stream) {

        List<Videogame> r = stream
                .sorted(Comparator.comparing(Videogame::getName))
                .takeWhile(v -> !v.getName().startsWith("M"))
                .collect(Collectors.toList());

        r.forEach(System.out::println);
    }

    static void dropWhileOperator(Stream<Videogame> stream) {

        List<Videogame> r = stream
                .sorted(Comparator.comparing(Videogame::getName))
                .dropWhile(v -> !v.getName().startsWith("M"))
                .collect(Collectors.toList());

        r.forEach(System.out::println);
    }


}

