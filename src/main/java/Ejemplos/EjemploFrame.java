
package Ejemplos;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class EjemploFrame implements MouseListener{
   
    @Override
    public void mouseClicked(MouseEvent evento) {
        Frame miMarco = new Frame();
        miMarco.setSize(600, 400);
        miMarco.setTitle("Mi ventana de ejemplo");
        miMarco.setLocation(new Point(100, 220));
        miMarco.setVisible(true);
    }
    @Override
    public void mousePressed(MouseEvent evento) {
        evento.getComponent().setBackground(Color.red);
    }
    @Override
    public void mouseReleased(MouseEvent evento) {
        evento.getComponent().setBackground(Color.white);  
    }
    @Override
    public void mouseEntered(MouseEvent evento) {
        evento.getComponent().setBackground(Color.green);
    }
    @Override
    public void mouseExited(MouseEvent evento) {
        evento.getComponent().setBackground(Color.white);
    }
    
}

