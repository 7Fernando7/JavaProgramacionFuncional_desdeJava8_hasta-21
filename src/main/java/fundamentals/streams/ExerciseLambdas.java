package fundamentals.streams;

import fundamentals.util.*;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class ExerciseLambdas {

        public static void main(String[] args) {
            Stream<Videogame> videogames = Database.videogames.stream();

            //exercise1(videogames);
            //exercise2(videogames);
            //exercise3(videogames);
            //exercise4(videogames);
            exercise5(videogames);
        }

        /*
         *Regresar true si el stream contiene al menos un videojuego con número de ventas mayor a 10
         * y no este en descuento o su precio sea mayor a 9.99 de lo contrario regresar false.
         */
        static Boolean exercise1(Stream<Videogame> stream) {
            List<Videogame> r = stream
                    .filter( v-> v.getTotalSold() > 10)
                    .filter(v -> !v.getIsDiscount())
                    .filter(v -> v.getPrice() > 9.99)
                    .collect(Collectors.toList());

            r.forEach(System.out::println);

            return null;
        }

        /*
         *Regresar un Stream unicamente con los titulos de todas las consolas que sean de XBOX
         * durante el proceso imprimir los resultados ignorando los repetidos.
         */
        static Stream<String> exercise2(Stream<Videogame> stream)  {
            List<BasicVideoGame> basicVideoGameList = stream
                    .filter(v -> v.getConsole() == GameConsole.XBOX)
                    .map(v -> BasicVideoGame.builder()
                            .name(v.getName())
                            .console(v.getConsole())  // No uses compareTo
                            .build())
                    .collect(Collectors.toList());


            List<String> titles = basicVideoGameList.stream().map(BasicVideoGame::getName).collect(Collectors.toList());
            basicVideoGameList.forEach(System.out::println);

            return null;
        }


        /*
         *Regresar el videojuego con el mayor número de ventas
         * unicamente contemplando los primers 10 elementos del stream.
         */
        static Videogame exercise3(Stream<Videogame> stream) {


            List<Videogame> r = stream
                    .filter( v-> v.getTotalSold() > 3)
                    .sorted(Comparator.comparing(Videogame::getName))
                    .takeWhile(v -> !v.getName().startsWith("G"))
                    .collect(Collectors.toList());

            r.forEach(System.out::println);

            return null;

        }

        /*
         *Regresar un stream con todos los comentarios del cada review de
         * todos los videojuegos del stream.
         */
        static Stream<String> exercise4(Stream<Videogame> stream) {

            List<Review> r = stream
                    .flatMap(v -> v.getReviews().stream())
                    .collect(Collectors.toList());

            System.out.println(r);
            return null;
        }

        /*
         *Regresar un stream con los todos los videojuegos con precio menores a 20.0
         * sin utilizar el operador filter().
         */
        static void exercise5(Stream<Videogame> stream) {
            List<String> r = stream
                    .flatMap(v -> v.getPrice() < 20.0 ? Stream.of(v) : Stream.empty())
                    .map(Videogame::getName)
                    .collect(Collectors.toList());

            System.out.println(r);
        }
}
