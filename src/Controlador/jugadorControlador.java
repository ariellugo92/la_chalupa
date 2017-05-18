package Controlador;

import Pojos.Jugador;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ariellugo
 */
public class jugadorControlador implements controlador<Jugador>{
    
    private List<Jugador> jugador_list;
    
    public jugadorControlador(){
        jugador_list = new ArrayList<>();
    }

    @Override
    public int guardar(Jugador t) {
        if (t == null) {
            return 0;
        }
        
        this.jugador_list.add(t);
        return 1;
    }

    @Override
    public List<Jugador> getRecursos() {
        return this.jugador_list;
    }

    @Override
    public Jugador buscarPorID(int id) {
        for (Jugador recurso : getRecursos()) {
            if (recurso.getId() == id) {
                return recurso;
            }
        }
        
        return null;
    }

    @Override
    public boolean modificar(Jugador t) {
        if (t == null) {
            return false;
        }
        
        int i = 0;
        for (Jugador recurso : getRecursos()) {
            if (recurso.getId() == t.getId()) {
                this.jugador_list.set(i, t);
                return true;
            }
            
            i++;
        }
        
        return false;
    }
    
}
