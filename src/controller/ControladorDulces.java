package controller;

import model.Datos;
import model.Dulce;
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
        } else if (tmp.getText().equals("Actualizar")) {
            this.opcion = opcion.ACTUALIZAR;
        } else if (tmp.getText().equals("Eliminar")) {
            this.opcion = opcion.ELIMINAR;
        } else if (tmp.getText().equals("ActualizarM")) {
            this.opcion = opcion.MOSTRAR;
        } else if (tmp.getText().equals("Dulces Creados")) {
            this.opcion = opcion.ALLMOSTRAR;
        }

        switch (opcion) {
            case CREAR:
                data.crearDulce(view.getNameAgregar(), view.getTipoAgregar());
                break;
            case ACTUALIZAR:
                data.actualizarDulces(view.getNameActualizarC(), view.getNameActualizar(), view.getTipoActualizar());
                break;
            case ELIMINAR:
                data.eleminarDulce(view.getNameEliminar());
                break;
            case MOSTRAR:
                view.mostrarDulces(data.imprimirDulces());
                for (int i = 0; i < data.obteberDulces().size(); i++) {
                    System.out.println(data.obteberDulces().get(i).getName());
                }
                break;
            case ALLMOSTRAR:
                view.mostrarAllDulces(data.allImprimirDulces());
                break;
        }

    }

    private Opcion opcion;
    private Datos data;
    private PlantillaInterfaz view;
    private TipoDulce tipoDulce;

}
