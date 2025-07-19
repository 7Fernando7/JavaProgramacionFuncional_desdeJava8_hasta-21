package fundamentals.temp;

import fundamentals.lambdas.Math;

public class LambdaApp {

    public static void main(String[] args) {

        /** Clase Anónima **/
        Math substract = new Math() {
            @Override
            public Double execute(Double a, Double b) {
                return a - b;
            }
        };

        /** Expresión Lambda **/
        Math multiply = (a, b) -> a * b;

        Math divide = (a, b) -> {
            System.out.println("Start");
            return a / b;

        };

        System.out.println(substract.execute(5.0, 2.0));
        System.out.println(multiply.execute(40.0, 02.0));
        System.out.println(divide.execute(775.0, 02.0));
        System.out.println(divide.sum(15.0, 02.0));
    }
}



/** INTERFACE FUNCIONAL

 Una interface funcional es una interface que solo dispone de un solo método abstracto puede tener metodos por default
 y privados.

 Podemos avisarle al compilador de manera opcionl que será una interface funcional anotandola con
 @FunctionalInterface

  * **/

/** QUÉ ES UNA EXPRESIÓN LAMBDA?
 Es una subrutina definida que no está enlazada a un identificador

 Son la implementación de una interface funcional mediante una clase anónima con las seguintes sintaxis:
 (x,y) -> return x + y;
 * **/