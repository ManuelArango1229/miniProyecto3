package controller;

import model.Datos;
import model.Dulce;
import view.InterfazGrafica;
import view.PlantillaInterfaz;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ControladorDulces implements ActionListener {

    public ControladorDulces(Datos almacenamientoDatos, PlantillaInterfaz interfaz) {
        this.data = almacenamientoDatos;
        this.view = interfaz;
    }

    public void init() {
        view.init(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton tmp = (JButton) e.getSource();
        if (tmp.getText().equals("Crear Dulce")) {
            System.out.println("sirve");
        }

    }

    private Datos data;
    private PlantillaInterfaz view;
    private TipoDulce tipoDulce;

}
