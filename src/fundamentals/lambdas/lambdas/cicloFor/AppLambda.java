package fundamentals.lambdas.lambdas.cicloFor;

import java.util.List;

public class AppLambda {

    public static void main(String[] args) {

        List<String> countries = List.of("Mexico", "Brasil", "Colombia", "Peru");

        for (String c : countries) {
            System.out.println(c);

            }

        countries.forEach(c -> System.out.println(c.toUpperCase()));
        }
    }
