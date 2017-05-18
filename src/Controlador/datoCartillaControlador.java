package Controlador;

import Modelo.RandomConector;
import Pojos.dato_cartilla;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ariellugo
 */
public class datoCartillaControlador implements controlador<dato_cartilla>{

    private final RandomAccessFile raf;
    private static final int LENGTH = 60;
    
    public datoCartillaControlador() throws IOException{
        raf = RandomConector.buildRandom("datos_cartilla.dat").getRandomAccessFile();
    }

    @Override
    public int guardar(dato_cartilla t) {
        try {
            if (t == null) {
                return 0;
            }

            raf.seek(0);
            int n = raf.readInt();
            long pos = 4 + (LENGTH * n);

            raf.seek(pos);
            raf.writeInt(n + 1);
            raf.writeUTF(metodosControlador.limitString(t.getId_cartilla(), 6));
            raf.writeUTF(metodosControlador.limitString(t.getPos_i(), 6));
            raf.writeUTF(metodosControlador.limitString(t.getPos_j(), 6));
            raf.writeUTF(metodosControlador.limitString(t.getValor(), 6));

            raf.seek(0);
            raf.writeInt(n + 1);

            return 1;
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
            return -1;
        }
    }

    @Override
    public List<dato_cartilla> getRecursos() {
        try {
            raf.seek(0);
            int n = raf.readInt();
            List<dato_cartilla> dc_ls = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                long pos = 4 + (LENGTH * i);
                dato_cartilla dc = new dato_cartilla();
                raf.seek(pos);
                dc.setId(raf.readInt());
                dc.setId_cartilla(raf.readUTF().trim());
                dc.setPos_i(raf.readUTF().trim());
                dc.setPos_j(raf.readUTF().trim());
                dc.setValor(raf.readUTF().trim());

                dc_ls.add(dc);
            }

            return dc_ls;
        } catch (IOException ex) {
            System.err.println("Error: " + ex.getMessage());
            return null;
        }
    }

    @Override
    public dato_cartilla buscarPorID(int id) {
        for (dato_cartilla recurso : getRecursos()) {
            if (recurso.getId() == id) {
                return recurso;
            }
        }
        
        return null;
    }

    @Override
    public boolean modificar(dato_cartilla t) {
        try {
            if (t == null) {
                return false;
            }

            int id = t.getId();

            long pos = 4 + (id - 1) * LENGTH;

            raf.seek(pos);
            raf.writeInt(t.getId());
            raf.writeUTF(metodosControlador.limitString(t.getId_cartilla(), 6));
            raf.writeUTF(metodosControlador.limitString(t.getPos_i(), 6));
            raf.writeUTF(metodosControlador.limitString(t.getPos_j(), 6));
            raf.writeUTF(metodosControlador.limitString(t.getValor(), 6));

            return true;
        } catch (IOException ex) {
            System.err.println("Error: " + ex.getMessage());
            return false;
        }
    }
    
    public int obtenerDatosSegunCoordenadas(int i, int j, int id_cartilla){
        for (dato_cartilla recurso : getRecursos()) {
            int id_cartilla_buscar = Integer.parseInt(recurso.getId_cartilla());
            if (id_cartilla_buscar == id_cartilla) {
                int pos_i = Integer.parseInt(recurso.getPos_i());
                int pos_j = Integer.parseInt(recurso.getPos_j());
                if (pos_i == i && pos_j == j) {
                    int valor = Integer.parseInt(recurso.getValor());
                    return valor;
                }
            }
        }
        
        return -20;
    }

    public void cerrar() throws IOException {
        if (raf != null) {
            raf.close();
        }
    }
    
}
