package interfazGrafica;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class laminaGestionar extends JPanel{
    public laminaGestionar(){
        this.setLayout(new GridLayout(0,3));

        etiquetaAñadir=new JLabel("AÑADIR DULCE");
        add(etiquetaAñadir);

        etiquetaModificar=new JLabel("MODIFICAR DULCE");
        add(etiquetaModificar);

        etiquetaEliminar=new JLabel("ELIMINAR DULCE");
        add(etiquetaEliminar);
    }

    private JLabel etiquetaAñadir;
    private JLabel etiquetaEliminar;
    private JLabel etiquetaModificar;
}
