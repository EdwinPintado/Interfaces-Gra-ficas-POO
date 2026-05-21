
package Ejemplos;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class EjemploLabelYTextField implements MouseListener {
    
    @Override
    public void mouseClicked(MouseEvent evento) {
        Frame miMarco = new Frame();
        Label Titulo = new Label("Notas de matematicas");
        
        Panel EntradaDeDatos = new Panel(new FlowLayout());
        TextField Nombre = new TextField("Asignatura: ", 15);
        TextField Apellido = new TextField("Datos: ", 60);
        TextField Nacionalidad = new TextField("Nota: ",15);
        
        EntradaDeDatos.add(Nombre);
        EntradaDeDatos.add(Apellido);
        EntradaDeDatos.add(Nacionalidad);
        
        miMarco.add(Titulo, BorderLayout.NORTH);
        miMarco.add(EntradaDeDatos, BorderLayout.CENTER);
        miMarco.setSize(500,300);
        miMarco.setTitle("Ventana con etiqueta y cuadros de texto");
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
