/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.RandomConector;
import Pojos.Cartilla;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ariellugo
 */
public class cartillaControlador implements controlador<Cartilla> {

    private List<Cartilla> cartilla_list;
    
    public cartillaControlador(){
        cartilla_list = new ArrayList<>();
    }

    @Override
    public int guardar(Cartilla t) {
        if(t == null){
            return 0;
        }
        
        this.cartilla_list.add(t);
        return 1;
    }

    @Override
    public List<Cartilla> getRecursos() {
        return this.cartilla_list;
    }

    @Override
    public Cartilla buscarPorID(int id) {
        for (Cartilla recurso : getRecursos()) {
            int ids = recurso.getId();
            if (ids == id) {
                return recurso;
            }
        }
        
        return null;
    }

    @Override
    public boolean modificar(Cartilla t) {
        if (t == null) {
            return false;
        }
        
        int i = 0;
        for (Cartilla recurso : getRecursos()) {
            if (recurso.getId() == t.getId()) {
                getRecursos().set(i, t);
                return true;
            }
            
            i++;
        }
        
        return false;
    }

}
