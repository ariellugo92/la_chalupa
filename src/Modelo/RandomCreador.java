package Modelo;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomCreador {

    private RandomAccessFile raf;
    private final String chalupa;

    public RandomCreador(String chalupa) {
        this.chalupa = chalupa;
    }

    public RandomAccessFile getRandomAccessFile()
            throws IOException {

        File file = new File(chalupa);
        if (!file.exists()) {
            file.createNewFile();
            raf = new RandomAccessFile(file, "rw");
            raf.writeInt(0);
            raf.writeInt(0);
            return raf;
        } else if (raf == null) {
            raf = new RandomAccessFile(file, "rw");
            return raf;
        } else {
            return raf;
        }
    }
}
