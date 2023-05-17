package principal;

import controller.ControladorDulces;
import model.Datos;
import view.InterfazGrafica;

public class App {
    public static void main(String[] args) throws Exception {
        Datos data = new Datos();
        InterfazGrafica ventana = new InterfazGrafica();
        ControladorDulces controlador = new ControladorDulces(data, ventana);
        controlador.iniciar();
    }
}
