package Controlador;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author ariellugo
 */
public class metodosControlador {
    
    public static String limitString(String text, int length) {
        StringBuffer buffer;
        if (text == null) {
            buffer = new StringBuffer(length);
        } else {
            buffer = new StringBuffer(text);
            buffer.setLength(length);
        }
        return buffer.toString();
    }
    
    public static int getNumeroAleatorioNoRepetido(int valor_min, int valor_max, List<Integer> list){
        int num = 0;
        boolean flag = false;
        
        if (list.isEmpty()) {
            num = ThreadLocalRandom.current().nextInt(1, 20);
            return num;
        }
        
        int num_temp = ThreadLocalRandom.current().nextInt(1, 20);
        for (int i = 0; i < list.size(); i++) {
            if (num_temp == list.get(i)) {
                flag = true;
                break;
            }
        }
        
        if (flag) {
            getNumeroAleatorioNoRepetido(valor_min, valor_max, list);
        }else{
            num = num_temp;
        }
        return num;
    }
    
}
