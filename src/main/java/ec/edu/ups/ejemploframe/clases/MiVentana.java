
package ec.edu.ups.ejemploframe.clases;
import java.awt.Frame;
import java.awt.Point;


/**
 *
 * @author ASUS_USER
 */
public class MiVentana extends Frame {

    public MiVentana() {
    }
    
    public MiVentana(String titulo){
        this.setTitle(titulo);
        this.setVisible(true);
    }
    public MiVentana(String titulo,int ancho, int alto){
        this(titulo);
        this.setSize(ancho,alto);
    }
    public MiVentana(String titulo, int ancho, int alto, int posX, int posY) {
        this(titulo,ancho,alto);
        this.setLocation(new Point(posX, posY));
    }

}
