package Controlador;

import java.util.List;

/**
 *
 * @author ariellugo
 */
public interface controlador<T>{
    public int guardar(T t);
    public List<T> getRecursos();
    public T buscarPorID(int id);
    public boolean modificar(T t);
}
