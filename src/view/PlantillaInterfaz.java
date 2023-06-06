package view;

import controller.ControladorDulces;

public interface PlantillaInterfaz {
    public void init(ControladorDulces controlador);

    public String getNameAgregar();

    public String getTipoAgregar();

    public String getNameActualizarC();

    public String getNameActualizar();

    public String getTipoActualizar();

    public String getNameEliminar();

    public void mostrarDulces(String n);

    public void mostrarAllDulces(String n);

}
