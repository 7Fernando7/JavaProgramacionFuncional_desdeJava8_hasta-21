package fundamentals.generico;

public class App {
    public static void main(String[] args) {
        ProductDB pDb = new ProductDB();
        EmployeeDB eDb = new EmployeeDB();

        System.out.println(pDb.getById(2L));
        System.out.println(eDb.getById(1L));
    }
}
