package ec.edu.ups.ejemploframe.ejemplos;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class EjemploPanel implements MouseListener {
    
    @Override
    public void mouseClicked(MouseEvent evento) {
        Frame miVentana = new Frame();
        Panel miPanel = new Panel();
        Button botonArea = new Button("Calcular área");
        Button botonPerimetro = new Button("Calcular Perimetro");
        miVentana.setSize(400, 200);
        miVentana.setTitle("Ventana con botones");
        miVentana.setVisible(true);
        miVentana.add(miPanel);
        miPanel.add(botonArea);
        miPanel.add(botonPerimetro);
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
