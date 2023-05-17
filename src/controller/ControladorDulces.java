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
    }

    public void iniciar() {
        view.iniciarComponentes();
    }

    public void crearDulce(String name, char tipo) {
        Dulce nuevo = new Dulce(tipo, name);
        data.agregarDulces(nuevo);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        char tipo = 'A';
        if (e.getSource() == view.buttonCrearDulce) {
            if (view.dulce.isSelected()) {
                tipo = 'D';
            } else if (view.acido.isSelected()) {
                tipo = 'A';
            } else {
                tipo = 'S';
            }
            crearDulce(view.campoNombre.getText(), tipo);
        }

    }

    private Datos data;
    private InterfazGrafica view;

}
