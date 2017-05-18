package Controlador;

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
    
}
