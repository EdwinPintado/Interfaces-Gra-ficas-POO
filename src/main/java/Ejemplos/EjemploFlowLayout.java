
package Ejemplos;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class EjemploFlowLayout implements MouseListener {
    
    @Override
    public void mouseClicked(MouseEvent evento) {
        Frame miVentana = new Frame();
        Panel miPanel = new Panel();
        FlowLayout posicionamientoSecuencial = new FlowLayout();
        Button botonA = new Button("Primer botón");
        Button botonB = new Button("Segundo botón");
        Button botonC = new Button("Tercer botón");
        Button botonD = new Button("Cuarto botón");
        miPanel.setLayout(posicionamientoSecuencial);
        miVentana.add(miPanel);
        miPanel.add(botonA);
        miPanel.add(botonB);
        miPanel.add(botonC);
        miPanel.add(botonD);
        miVentana.setSize(300, 100);
        miVentana.setTitle("Ventana con flow layout");
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
