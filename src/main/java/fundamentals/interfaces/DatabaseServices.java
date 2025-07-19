package fundamentals.interfaces;

import java.util.List;

public interface DatabaseServices {
    String getById(Long id);

    List<String> getAllRecords();

}
