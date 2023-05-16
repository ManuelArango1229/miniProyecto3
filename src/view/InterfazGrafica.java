package view;

import javax.swing.JFrame;

public class InterfazGrafica implements DulceriaVistas {

    public void iniciarComponentes() {
        ventana = new JFrame("Dulceria");
    }

    @Override
    public void ingresoDulce(String name, String tipo) {

    }

    @Override
    public void idNameBuscar(String name) {

    }

    private JFrame ventana;
}
