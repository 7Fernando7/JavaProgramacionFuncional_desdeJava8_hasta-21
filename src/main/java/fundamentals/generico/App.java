package fundamentals.generico;

import java.util.List;

public class App {
    public static void main(String[] args) {
        ProductDB pDb = new ProductDB();
        EmployeeDB eDb = new EmployeeDB();

        System.out.println(pDb.getById(2L));
        System.out.println(eDb.getById(1L));

        /** Clases Anónimas **/
        System.out.println(Product.class.getName());
        System.out.println(Employee.class.getName());
        System.out.println(String.class.getName());

        DatabaseService<String> dbAnonimo =  new DatabaseService<String>() {
            @Override
            public String getById(Long id) {
                return null;
            }

            @Override
            public List<String> getAllRecords() {
                return null;
            }
        };

        System.out.println(dbAnonimo.getClass().getName());

    }
}

/**   PROGRAMACIÓN GENÉRICA
 La programación genérica tiene como objetivo facilitar el desarrollo de algoritmos (o métodos en la POO)
 de manera tal que el tipo de dato específico manipulado por el algoritmo sea especificado al momento de ejecutarlo
 y no al momento de desarrollo.

 Y para evitar usar la clase Object como parametro de los métodos abstractos cuando desconocemos el tipo de dato en concreto
 de nuestra implementación.

 Para hacer mas dinamico nuestro código.

 **/

/** Se declaran en clases abstractas o interfaces
 * Podemos especificar que los tipos extiendan de una interface especifica con <T extends myInterface>
 *     La conversion para nombrar los parametros de tipo es:
 *     E- Elemento
 *     K- Llave
 *     N- Número
 *     T- tipo
 *     V- valor
 *     **/



/** CLASES ANÓNIMAS
 Una clase anónima es JAVA es una solución rápida para implementar una clase abstracta o una interface que solo
 se va a usar ua vez sin necesidad de crear un archivo separado.
 * **/

/**
 * Creamos una clase anónima al instancear una interface
 * Creamos una clase anónima al instancear una clase abstracta
 * La Clase anónima tanbíen es una clase interna
 * **/
