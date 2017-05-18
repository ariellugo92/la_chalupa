package Controlador;

import Pojos.jugador_cartillas;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ariellugo
 */
public class jugadorCartillaControlador implements controlador<jugador_cartillas>{
    
    private List<jugador_cartillas> jc_list;
    
    public jugadorCartillaControlador(){
        jc_list = new ArrayList<>();
    }

    @Override
    public int guardar(jugador_cartillas t) {
        if (t == null) {
            return 0;
        }
        
        this.jc_list.add(t);
        return 1;
    }

    @Override
    public List<jugador_cartillas> getRecursos() {
        return this.jc_list;
    }

    @Override
    public jugador_cartillas buscarPorID(int id) {
        for (jugador_cartillas recurso : getRecursos()) {
            if (recurso.getId() == id) {
                return recurso;
            }
        }
        
        return null;
    }

    @Override
    public boolean modificar(jugador_cartillas t) {
        if (t == null) {
            return false;
        }
        
        int i = 0;
        for (jugador_cartillas recurso : getRecursos()) {
            if (recurso.getId() == t.getId()) {
                this.jc_list.set(i, t);
                return true;
            }
            
            i++;
        }
        
        return false;
    }
    
}
