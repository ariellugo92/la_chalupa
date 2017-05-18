package Pojos;

/**
 *
 * @author ariellugo
 */
public class Cartilla {

    private int id;
    private int cartas[][];

    public Cartilla() {
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int[][] getCartas() {
        return cartas;
    }

    public void setCartas(int[][] cartas) {
        this.cartas = cartas;
    }
}
