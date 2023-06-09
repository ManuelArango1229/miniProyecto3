package view;

import controller.ControladorDulces;
import controller.TipoDulce;

public interface PlantillaInterfaz {
    public void init(ControladorDulces controlador);

    public String getNameAgregar();

    public TipoDulce getTipoAgregar();

    public String getNameActualizarC();

    public String getNameActualizar();

    public String getTipoActualizar();

    public String getNameEliminar();

    public void mostrarDulces(String n);

    public void mostrarAllDulces(String n);

    public void error(String n);

}
