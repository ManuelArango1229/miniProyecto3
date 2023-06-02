package view;

import model.Datos;
import controller.ControladorDulces;

public interface PlantillaInterfaz {
    public void init(ControladorDulces controlador);

    public String getNameAgregar();

    public String getTipoAgregar();

    public String getNameActualizar();

    public String getTipoActualizar();

    public String getNameEliminar();

    public void mostrarDulces(Datos data);
}
