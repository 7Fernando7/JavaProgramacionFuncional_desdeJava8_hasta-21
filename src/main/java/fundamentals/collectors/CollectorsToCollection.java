package fundamentals.collectors;

import fundamentals.util.Database;
import fundamentals.util.Videogame;

import java.util.Collection;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsToCollection {
    public static void main(String[] args) {

        Stream<Videogame> videogames = Database.videogames.stream();

       //streamToCollection(videogames, "SET").forEach(System.out::println);

        streamToMap(videogames).forEach((k,v) -> System.out.println(k + " - " + v));
    }

    static Collection<Videogame> streamToCollection(Stream<Videogame> stream, String type) {
        return(type.equals("LIST")) ? stream.collect(Collectors.toList()) : stream.collect(Collectors.toSet());
    }

    static Map<String, Double> streamToMap(Stream<Videogame> stream){
        return stream.distinct().collect(Collectors.toMap(Videogame::getName, Videogame::getPrice, (price1, price2) -> price1));
    }




}


/** Collectors Definición
 * Los collector son operaciones de recolecición útiles, como acumular elementos en colecciones(Listas o conjuntos),
 * resumir elementos según criterios como agrupaciones o particiones.
 *
 * El método collect() es una operación final.
 *
 *
 *
 *
 * **/