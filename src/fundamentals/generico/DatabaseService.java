package fundamentals.generico;

import java.util.List;

public interface DatabaseService<T> {

    T getById(Long id);
    List<T> getAllRecords();
}


/** Se declaran en clases abstractas o interfaces
 * Podemos especificar que los tipos extiendan de una interface especifica con <T extends myInterface>
 *     La conversion para nombrar los parametros de tipo es:
 *     E- Elemento
 *     K- Llave
 *     N- Número
 *     T- tipo
 *     V- valor
 *     **/