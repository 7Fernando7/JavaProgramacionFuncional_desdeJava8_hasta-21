package fundamentals.lambdas;

import fundamentals.generico.Employee;
import fundamentals.generico.EmployeeDB;
import fundamentals.generico.Product;

public class AppGenericLambda {

    public static void main(String[] args) {

        Printer<String> printString =  string -> System.out.println(string);

        Printer<Product> printProduct =  product -> System.out.println(product);

        Printer<Employee> printEmployee = employee -> System.out.println(employee);

        Product myProduct = new Product();

        myProduct.setId(21321L);
        myProduct.setPrice(1000.2);
        myProduct.setName("Smartphone");

        Employee newEmployee =  new Employee();

        newEmployee.setName("Fernando");
        newEmployee.setSalary(300000.00);
        newEmployee.setDni("Y3254522152");

        printString.print("Hola mundo");
        printProduct.print(myProduct);
        printEmployee.print(newEmployee);
    }

}
