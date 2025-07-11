package fundamentals.generico;


import java.util.List;
import java.util.UUID;

public class EmployeeDB implements DatabaseService<Employee>{
    @Override
    public Employee getById(Long id) {
        Employee e = new Employee();
        e.setDni(UUID.randomUUID().toString());
        e.setName("Fernando");
        e.setSalary(50.000);

        return e;
    }

    @Override
    public List<Employee> getAllRecords() {
        return null;
    }
}
