package view;

import model.Datos;
import controller.ControladorDulces;

public interface PlantillaInterfaz {
    public void init(ControladorDulces controlador);

    public String getNameAgregar();

    public String getTipoAgregar();

    public String getNameComprobar();

    public String getNameActualizar();

    public String getTipoActualizar();

    public String getNameEliminar();

    public void comprobar(String n);

    public void mostrarDulces(String n);

    public void mostrarAllDulces(String n);

}
