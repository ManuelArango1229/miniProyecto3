package controller;

import model.Datos;
import model.Dulce;
import view.InterfazGrafica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorDulces implements ActionListener {

    public ControladorDulces(Datos almacenamientoDatos, InterfazGrafica interfaz) {
        this.data = almacenamientoDatos;
        this.view = interfaz;
        view.buttonCrearDulce.addActionListener(this);
        view.ButtonactualizarM.addActionListener(this);
        view.buttonComprobarA.addActionListener(this);
    }

    public void iniciar() {
        view.iniciarComponentes();
        view.ventana.setVisible(true);
    }

    public void crearDulce(String name, char tipo) {
        Dulce nuevo = new Dulce(tipo, name);
        data.agregarDulces(nuevo);
    }

    public String mostrarDulces() {
        String texto = "";
        for (Dulce e : data.obteberDulces()) {
            texto += e.getName() + "    ";
            texto += e.getTipo() + "\n";
        }
        return texto;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == view.buttonCrearDulce) {
            char tipo = 'A';
            if (view.dulce.isSelected()) {
                tipo = 'D';
            } else if (view.acido.isSelected()) {
                tipo = 'A';
            } else {
                tipo = 'S';
            }
            crearDulce(view.campoNombre.getText(), tipo);
        }

        if (e.getSource() == view.ButtonactualizarM) {
            view.areaMostrar.setText(mostrarDulces());
        }
        if (e.getSource() == view.buttonComprobarA) {
            boolean band = false;
            for (int i = 0; i < data.obteberDulces().size(); i++) {
                if (data.obteberDulces().get(i).getName().equals(view.campoNombreActualizar.getText())) {
                    band = true;
                    index = i;
                    break;
                }
            }
            if (band) {
                view.campoNombreActualizar.setText("");
                view.labelNuevosDatos.setVisible(true);
                view.buttonComprobarA.setVisible(false);
                view.buttonActualizarA.setVisible(true);
            } else {
                view.dulceA.setVisible(false);
                view.sinAzucarA.setVisible(false);
                view.acidoA.setVisible(false);
                view.labelActualizar.setVisible(true);
            }

        }

    }

    private int index = 0;
    private Datos data;
    private InterfazGrafica view;

}
