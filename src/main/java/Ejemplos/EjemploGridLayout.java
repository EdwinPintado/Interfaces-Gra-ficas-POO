
package Ejemplos;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class EjemploGridLayout implements MouseListener{
    
    @Override
    public void mouseClicked(MouseEvent evento) {
        Frame miVentana = new Frame();
        Panel miPanel = new Panel();
        GridLayout matriz = new GridLayout(2, 3);
        Button[] botones = new Button[6];
        for (int i = 0; i < 6; i++)
            botones[i] = new Button("Botón " + i);
        miPanel.setLayout(matriz);
        for (int i = 0; i < 6; i++)
            miPanel.add(botones[i]);
        miVentana.add(miPanel);
        miVentana.setSize(300, 100);
        miVentana.setTitle("Ventana con GridLayout");
        miVentana.setVisible(true);
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
