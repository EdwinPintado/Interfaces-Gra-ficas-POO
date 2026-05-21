
package ec.edu.ups.ejemploframe.ejemplos;

import ec.edu.ups.ejemploframe.clases.InterrupcionesDeRaton;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;


public class EjemploMouseAdapter {
    public static void mostrarEjemploMouseAdapter() {
        final int NUM_OPCIONES = 12;
        Label mensaje = new Label("Mensaje asociado al botón pulsado");
        Button[] botones = new Button[NUM_OPCIONES];
        
        for (int i = 0; i < NUM_OPCIONES; i++) {
            botones[i] = new Button("Opcion " + i);
            if (i < 10) {
                botones[i].setName("0" + i);
            } else {
                botones[i].setName(String.valueOf(i));
            }
        }
        
        Frame miVentana = new Frame("Prueba eventos de raton");
        Panel panelPrincipal = new Panel(new GridLayout(NUM_OPCIONES + 1, 1));
        panelPrincipal.add(mensaje);
        for (int i = 0; i < NUM_OPCIONES; i++) {
            panelPrincipal.add(botones[i]);
        }
        
        miVentana.add(panelPrincipal);
        miVentana.setSize(400, 600);
        miVentana.setVisible(true);
        for (int i = 0; i < NUM_OPCIONES; i++) {
            botones[i].addMouseListener(new InterrupcionesDeRaton(mensaje));
        }
    }
}
