
package ec.edu.ups.ejemploframe.clases;

import java.awt.Color;
import java.awt.Component;
import java.awt.Label;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class InterrupcionesDeRaton extends MouseAdapter {
    private Label mensaje;
    
    public InterrupcionesDeRaton(Label mensaje) {
        this.mensaje = mensaje;
    }
    
    @Override
    public void mouseClicked(MouseEvent evento) {
        Component componente = (Component) evento.getSource();
        String nombre = componente.getName();
        String opcion = nombre.substring(nombre.length() - 2, nombre.length());
        mensaje.setText("Ejecutar la accion " + opcion);
    }
    
    @Override
    public void mouseEntered(MouseEvent evento) {
        Component componente = (Component) evento.getSource();
        componente.setBackground(Color.red);
    }
    @Override
    public void mouseExited(MouseEvent evento) {
        Component componente = (Component) evento.getSource();
        componente.setBackground(Color.orange);
    }
}




