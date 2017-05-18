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

    private final RandomAccessFile raf;
    private static final int LENGTH = 75;

    public cartillaControlador() throws IOException {
        raf = RandomConector.buildRandom("cartillas.dat").getRandomAccessFile();
    }

    @Override
    public int guardar(Cartilla t) {
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

            raf.seek(0);
            raf.writeInt(n + 1);

            return 1;
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
            return -1;
        }
    }

    @Override
    public List<Cartilla> getRecursos() {
        try {
            raf.seek(0);
            int n = raf.readInt();
            List<Cartilla> cartillas = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                long pos = 4 + (LENGTH * i);
                Cartilla c = new Cartilla();
                raf.seek(pos);
                c.setId(raf.readInt());
                c.setNombre(raf.readUTF().trim());

                cartillas.add(c);
            }

            return cartillas;
        } catch (IOException ex) {
            System.err.println("Error: " + ex.getMessage());
            return null;
        }
    }

    @Override
    public Cartilla buscarPorID(int id) {
        for (Cartilla recurso : getRecursos()) {
            if (recurso.getId() == id) {
                return recurso;
            }
        }

        return null;
    }

    @Override
    public boolean modificar(Cartilla t) {
        try {
            if (t == null) {
                return false;
            }

            int id = t.getId();

            long pos = 4 + (id - 1) * LENGTH;

            raf.seek(pos);
            raf.writeInt(t.getId());
            raf.writeUTF(metodosControlador.limitString(t.getNombre(), 30));

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
