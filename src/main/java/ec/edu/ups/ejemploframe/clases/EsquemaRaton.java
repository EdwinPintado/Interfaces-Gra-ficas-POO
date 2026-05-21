
package ec.edu.ups.ejemploframe.clases;

import java.awt.event.*;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextField;

public class EsquemaRaton implements MouseListener {
    
    @Override
    public void mouseClicked(MouseEvent evento) {
        Frame MiMarco = new  Frame();
        Panel EntradaDeDatos = new Panel(new FlowLayout());
        TextField Nombre = new TextField(15);
        TextField Apellido = new TextField(60);
        TextField Nacionalidad = new TextField("Española", 15);
        
        EntradaDeDatos.add(Nombre);
        EntradaDeDatos.add(Apellido);
        EntradaDeDatos.add(Nacionalidad);
        
        MiMarco.add(EntradaDeDatos);
        MiMarco.setSize(500, 130);
        MiMarco.setTitle("Ventana con cuadros de texto");
        MiMarco.setVisible(true);
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
