package fundamentals.interfaces;

public class App {
    public static void main(String[] args) {
        DatabaseServices mongo = new MongoDB();

        DatabaseServices postgres = new PostgresDB();

        System.out.println(mongo.getById(20L));

        System.out.println(postgres.getById(30L));
    }
}

/**
 DEFINICION

 Una interfaz es un contrato entre dos entidades(interfaz e implementación), esto quiere decir que una interfaz
 provee una servicio a una clase consumidora, por ende, la interfaz solo nos muestra la declaración de los métodos
 que esta posee ( todos us métodos son abstractos)
 **/
