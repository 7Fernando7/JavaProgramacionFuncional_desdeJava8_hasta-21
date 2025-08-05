package fundamentals;

import fundamentals.util.Database;
import fundamentals.util.Review;
import fundamentals.util.Videogame;

import java.util.Comparator;
import java.util.stream.Stream;


public class App {
    public static void main(String[] args) {

        Stream<Videogame> videogames = Database.videogames.stream();

        System.out.println("Hello world!");

        var myArray = videogames
                .distinct()
                .sorted(Comparator.comparing(Videogame::getTotalSold))
                .flatMap(videogame -> videogame.getReviews().stream()
                        .map(Review::getComment))
                .filter(comment -> comment.contains("best"))
                .map("Good comment: "::concat)
                .toArray();

        System.out.println(myArray);
    }
}
