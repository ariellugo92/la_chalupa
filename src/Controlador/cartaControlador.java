/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.RandomConector;
import Pojos.Carta;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ariellugo
 */
public class cartaControlador implements controlador<Carta> {

    private final RandomAccessFile raf;
    private static final int LENGTH = 60;

    public cartaControlador() throws IOException {
        raf = RandomConector.buildRandom("cartas.dat").getRandomAccessFile();
    }

    @Override
    public int guardar(Carta t) {
        try {
            if (t == null) {
                return 0;
            }

            raf.seek(0);
            int n = raf.readInt();
            long pos = 4 + (LENGTH * n);

            raf.seek(pos);
            raf.writeInt(n + 1);
            raf.writeUTF(metodosControlador.limitString(t.getNombre(), 30));
            raf.writeInt(t.getPos());

            raf.seek(0);
            raf.writeInt(n + 1);

            return 1;
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
            return -1;
        }
    }

    @Override
    public List<Carta> getRecursos() {
        try {
            raf.seek(0);
            int n = raf.readInt();
            List<Carta> cartas = new ArrayList<>();
            
            for (int i = 0; i < n; i++) {
                long pos = 4 + (LENGTH * i);
                Carta c = new Carta();
                raf.seek(pos);
                c.setId(raf.readInt());
                c.setNombre(raf.readUTF());
                c.setPos(raf.readInt());
                
                cartas.add(c);
            }
            
            return cartas;
        } catch (IOException ex) {
            System.err.println("Error: " + ex.getMessage());
            return null;
        }
    }

    @Override
    public Carta buscarPorID(int id) {
        for (Carta c : getRecursos()) {
            int ids = c.getId();
            if (ids == id) {
                return c;
            }
        }
        
        return null;
    }

    @Override
    public boolean modificar(Carta t) {
        try {
            if(t == null){
                return false;
            }
            
            int id = t.getId();
            
            long pos = 4 + (id - 1) * LENGTH;
            
            raf.seek(pos);
            raf.writeInt(t.getId());
            raf.writeUTF(metodosControlador.limitString(t.getNombre(), 30));
            raf.writeInt(t.getPos());
            
            return true;
        } catch (IOException ex) {
            System.err.println("Error: " + ex.getMessage());
            return false;
        }
    }
    
    public void cerrar() throws IOException {
        if (raf != null) {
            raf.close();
        }
    }

}
