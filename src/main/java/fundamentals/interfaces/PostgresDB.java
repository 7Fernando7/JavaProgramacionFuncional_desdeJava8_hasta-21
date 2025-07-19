package fundamentals.interfaces;

import java.util.List;

public class PostgresDB implements DatabaseServices{
    @Override
    public String getById(Long id) {
        return "Getting data from Postgres with id:" + id;
    }

    @Override
    public List<String> getAllRecords() {
        return List.of("Hello World");
    }
}
