package controller;

import model.Datos;
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

        if (e != null) {
            JButton tmp = (JButton) e.getSource();
            String name = "";
            if (tmp.getText().equals("Crear Dulce")) {
                this.opcion = opcion.CREAR;
            } else if (tmp.getText().equals("Actualizar")) {
                this.opcion = opcion.ACTUALIZAR;
            } else if (tmp.getText().equals("Eliminar")) {
                this.opcion = opcion.ELIMINAR;
            } else if (tmp.getText().equals("Actualizar ")) {
                this.opcion = opcion.MOSTRAR;
            } else if (tmp.getText().equals("Dulces Creados")) {
                this.opcion = opcion.ALLMOSTRAR;
            }
        }

        switch (opcion) {
            case CREAR:
                String name = view.getNameAgregar();
                if (name.equals("")){
                    view.error("El nombre no puede estar vacio.");
                    break;
                }
                data.crearDulce(name, view.getTipoAgregar());
                break;
            case ACTUALIZAR:
                String nameActual = view.getNameActualizarC();
                String nameActualizar = view.getNameActualizar();
                if (nameActualizar.equals("")){
                    view.error("El nombre no puede estar vacio.");
                    break;
                }
                if (!data.actualizarDulces(nameActual, nameActualizar, null)){
                    view.error("No se pudo actualizar.");
                }

                break;
            case ELIMINAR:
                if (!data.eleminarDulce(view.getNameEliminar())){
                    view.error("No se pudo eliminar.");
                }
                break;
            case MOSTRAR:
                view.mostrarDulces(data.imprimirDulces());
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
