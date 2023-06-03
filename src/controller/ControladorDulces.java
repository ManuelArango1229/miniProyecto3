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

    public void setOpcion(Opcion n) {
        this.opcion = n;
    }

    public int retornoComprobar(String n) {
        return data.comprobarDulces(n);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton tmp = (JButton) e.getSource();
        String name = "";
        if (tmp.getText().equals("Crear Dulce")) {
            this.opcion = opcion.CREAR;
        } else if (tmp.getText().equals("Comprobar")) {
            this.opcion = opcion.COMPROBAR;
            name = view.getNameComprobar();
        } else if (tmp.getText().equals("Actualizar")) {
            this.opcion = opcion.ACTUALIZAR;
        } else if (tmp.getText().equals("Eliminar")) {
            this.opcion = opcion.ELIMINAR;
        } else if (tmp.getText().equals("ActualizarM")) {
            this.opcion = opcion.MOSTRAR;
        }

        switch (opcion) {
            case CREAR:
                data.crearDulce(view.getNameAgregar(), view.getTipoAgregar());
                break;
            case COMPROBAR:
                view.comprobar(view.getNameComprobar());
                break;
            case ACTUALIZAR:
                data.actualizarDulces(name, view.getNameActualizar(), null);
                break;
            case ELIMINAR:
                data.eleminarDulce(view.getNameEliminar());
                break;
            case MOSTRAR:
                view.mostrarDulces(data.imprimirDulces());
                break;

        }
        // if (tmp.getText().equals("Crear Dulce")) {
        // data.crearDulce(view.getNameAgregar(), view.getTipoAgregar());
        // } else if (tmp.getText().equals("Dulces Creados")) {
        // view.mostrarAllDulces(data.allImprimirDulces());
        // } else if (tmp.getText().equals("Comprobar")) {
        // System.out.println(data.comprobarDulces(view.getNameActualizar()));
        // } else if (tmp.getText().equals("Actualizar")) {
        // System.out.println("sirve");
        // } else if (tmp.getText().equals("Eliminar")) {
        // System.out.println("sirve");
        // }

    }

    private Opcion opcion;
    private Datos data;
    private PlantillaInterfaz view;
    private TipoDulce tipoDulce;

}
