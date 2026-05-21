package ec.edu.ups.main;

import ec.edu.ups.ejemploframe.ejemplos.EjemploBorderLayout;
import ec.edu.ups.ejemploframe.ejemplos.EjemploFlowLayout;
import ec.edu.ups.ejemploframe.clases.EsquemaRaton;
import ec.edu.ups.ejemploframe.clases.MiVentana;
import ec.edu.ups.ejemploframe.ejemplos.EjemploFrame;
import ec.edu.ups.ejemploframe.ejemplos.EjemploGridLayout;
import ec.edu.ups.ejemploframe.ejemplos.EjemploLabelYTextField;
import static ec.edu.ups.ejemploframe.ejemplos.EjemploMouseAdapter.mostrarEjemploMouseAdapter;
import ec.edu.ups.ejemploframe.ejemplos.EjemploPanel;
import ec.edu.ups.ejemploframe.clases.InterrupcionesDeAccion;
import ec.edu.ups.ejemploframe.clases.InterrupcionesDeElemento;
import ec.edu.ups.ejemploframe.clases.InterrupcionesDeEnfoque;
import ec.edu.ups.ejemploframe.clases.InterrupcionesDeTeclado;
import ec.edu.ups.ejemploframe.clases.InterrupcionesDeVentana;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.List;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Scanner;


/**
 *
 * @author ASUS_USER
 */
public class Main {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int opcion;
        
        do {

            System.out.println("\nLista de metodos\n");
            System.out.println("1. Crear ventanas ");
            System.out.println("2. Panel con metodos basicos ");
            System.out.println("3. EJEMPLO MOUSEADAPTER ");
            System.out.println("4. EJEMPLO DE KEYADAPTER ");
            System.out.println("5. EJEMPLOS DE WINDOWLISTENER (crea una ventana que al cerrarla cieera todas las anteriores) ");
            System.out.println("6. EJEMPLO DE ACTIONLISTENER ");
            System.out.println("7. EJEMPLO FOCUSLISTENER ");
            System.out.println("8. EJEMPLO ITEMLISTENER ");
            System.out.println("9. Salir ");

            System.out.print("\nElija una opcion del 1 al 9: ");
            opcion = entrada.nextInt();
            entrada.nextLine();

            switch (opcion) {
        
                case 1: {
                    // Usar la clase mi ventana
                    {
                    MiVentana v3 = new MiVentana("Ventana3",600,400,100,200);
                    //MiVentana v1 = new MiVentana();
                    //MiVentana v2 = new MiVentana("Ventana2");
                    }
                }
                break;
                
                case 2: {
                    // Panel con diferentes ejemplos
                    {
                    Frame miVentana = new Frame();
                    Panel miPanel = new Panel();
                    GridLayout matriz = new GridLayout(4, 2);
                    miPanel.setLayout(matriz);

                    Button botonEjemploFrame = new Button("Ejemplo Frame");
                    Button botonEjemploPanel = new Button("Ejemplo Ventana con panel");
                    Button botonEjemploFlowLayout = new Button("Ejemplo FlowLayout");
                    Button botonEjemploBorderLayout = new Button("Ejemplo BorderLayout");
                    Button botonEjemploGridLayout = new Button("Ejemplo GridLayout");
                    Button botonEjemploLabelYTextField = new Button("Ejemplo Label y TextField");
                    Button botonEjemploMouseListener = new Button("Ejemplos Mouse Listener");
                    Button botonSalir = new Button("Salir");


                    miPanel.add(botonEjemploFrame);
                    miPanel.add(botonEjemploPanel);
                    miPanel.add(botonEjemploFlowLayout);
                    miPanel.add(botonEjemploBorderLayout);
                    miPanel.add(botonEjemploGridLayout);
                    miPanel.add(botonEjemploLabelYTextField);
                    miPanel.add(botonEjemploMouseListener);
                    miPanel.add(botonSalir);


                    miVentana.add(miPanel);
                    miVentana.setSize(600, 400);
                    miVentana.setTitle("Ejemplos");
                    miVentana.setVisible(true);

                    botonEjemploMouseListener.addMouseListener(new EsquemaRaton());
                    botonEjemploFrame.addMouseListener(new EjemploFrame());
                    botonEjemploPanel.addMouseListener(new EjemploPanel());
                    botonEjemploFlowLayout.addMouseListener(new EjemploFlowLayout());
                    botonEjemploBorderLayout.addMouseListener(new EjemploBorderLayout());
                    botonEjemploGridLayout.addMouseListener(new EjemploGridLayout());
                    botonEjemploLabelYTextField.addMouseListener(new EjemploLabelYTextField());
                    botonSalir.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseClicked(MouseEvent e) {
                            System.exit(0);
                        }
                    });
                    }
                }
                break;

                case 3: {
                    //EJEMPLO MOUSEADAPTER
                    {
                    mostrarEjemploMouseAdapter();
                    }
                }
                break;

                case 4: {
                    // EJEMPLO DE KEYADAPTER
                    {
                    Frame miVentana = new Frame("Prueba eventos de raton");
                    Panel miPanel = new Panel();
                    Button boton1 = new Button("Silencio");
                    Button boton2 = new Button("Máquina de escribir");
                    miPanel.add(boton1);
                    miPanel.add(boton2);
                    miVentana.add(miPanel);
                    miVentana.setSize(400, 400);
                    miVentana.setVisible(true);
                    boton2.addKeyListener(new InterrupcionesDeTeclado());
                    }
                }
                break;

                case 5: {
                    // EJEMPLOS DE WINDOWLISTENER
                    {
                    Frame miVentana = new Frame("Prueba eventos de ventana");
                    miVentana.setSize(200, 100);
                    miVentana.setVisible(true);
                    miVentana.addWindowListener(new InterrupcionesDeVentana());
                    }
                }
                break;

                case 6: {
                    // EJEMPLO DE ACTIONLISTENER
                    {
                    Frame miVentana = new Frame("Prueba eventos de acción");
                    Panel miPanel = new Panel(new GridLayout(3, 1));
                    Button boton = new Button("Etiqueta del boton");
                    TextField campoDeTexto = new TextField("Texto del campo 8");
                    List lista = new List(3);
                    lista.add("Opcion 1 de la lista");
                    lista.add("Opcion 2 de la lista");
                    lista.add("Opcion 3 de la lista");
                    lista.add("Opcion 4 de la lista");
                    miPanel.add(boton);
                    miPanel.add(campoDeTexto);
                    miPanel.add(lista);
                    boton.addActionListener(new InterrupcionesDeAccion());
                    campoDeTexto.addActionListener(new InterrupcionesDeAccion());
                    lista.addActionListener(new InterrupcionesDeAccion());
                    miVentana.add(miPanel);
                    miVentana.setSize(400, 200);
                    miVentana.setVisible(true);
                    }
                }
                break;

                case 7: {
                    // EJEMPLO FOCUSLISTENER
                    {
                    Frame miVentana = new Frame("Prueba eventos de enfoque");
                    Panel miPanel = new Panel();
                    Button boton1 = new Button("Componente 1");
                    Button boton2 = new Button("Componente 2");
                    miPanel.add(boton1);
                    miPanel.add(boton2);
                    miVentana.add(miPanel);
                    miVentana.setSize(300, 200);
                    miVentana.setVisible(true);
                    boton2.addFocusListener(new InterrupcionesDeEnfoque());
                    }
                }
                break;
                
                case 8: {
                    // EJEMPLO ITEMLISTENER
                    {
                    Frame miVentana = new Frame("Prueba eventos de elemento");
                    Panel miPanel = new Panel(new GridLayout(4, 1));
                    Checkbox diesel = new Checkbox("Diesel", true);
                    Checkbox farosXenon = new Checkbox("Faros de Xenon", false);
                    Checkbox llantasAleacion = new Checkbox("Llantas de aleacion", false);
                    Checkbox pinturaMetalizada = new Checkbox("Pintura Metalizada", true);
                    miPanel.add(diesel);
                    miPanel.add(farosXenon);
                    miPanel.add(llantasAleacion);
                    miPanel.add(pinturaMetalizada);
                    diesel.addItemListener(new InterrupcionesDeElemento());
                    farosXenon.addItemListener(new InterrupcionesDeElemento());
                    llantasAleacion.addItemListener(new InterrupcionesDeElemento());
                    pinturaMetalizada.addItemListener(new InterrupcionesDeElemento());
                    miVentana.add(miPanel);
                    miVentana.setSize(400, 200);
                    miVentana.setVisible(true);
                    }
                }
                break;
            }
        }
        while (opcion != 9);
    }
}
 