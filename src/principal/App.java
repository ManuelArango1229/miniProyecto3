package principal;

import controller.ControladorDulces;
import model.Datos;
import view.InterfazGrafica;
import view.PlantillaInterfaz;
import view.Consola;

public class App {
    public static void main(String[] args) throws Exception {
        Datos data = new Datos();
        PlantillaInterfaz ventana = new Consola();
        ControladorDulces controlador = new ControladorDulces(data, ventana);
        controlador.init();
    }
}
