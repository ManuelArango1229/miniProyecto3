package view;

import controller.ControladorDulces;
import controller.Opcion;
import model.Datos;

import java.util.Scanner;

class Consola implements PlantillaInterfaz {

    Scanner scanner = new Scanner(System.in);
    ControladorDulces controlador;
    int opcion = 0;
    Datos data;
    String nombre;
    @Override
    public void init(ControladorDulces controlador) {
        
        System.out.println("******************** BIENVENIDO ********************\n");
        System.out.println("1. Agregar Dulces");
        System.out.println("2. Actualizar Dulces");
        System.out.println("3. Eliminar Dulces");
        System.out.println("4. Mostrar Dulces");
        System.out.println("0. Salir");

        while(opcion <= 4 && opcion >= 0){
            System.out.print("Ingrese una opcion: ");
            scanner.nextInt();
            scanner.nextLine();
        }

        switch (opcion) {
            case 0:
                System.exit(0);
                break;
        
            case 1:
                controlador.setOpcion(Opcion.CREAR);
                //data.crearDulce(getNameAgregar(), getTipoAgregar());
                break;
            case 2:
                controlador.setOpcion(Opcion.ACTUALIZAR);
                //data.actualizarDulces(getNameActualizarC(), getNameActualizar(), null);
                break;
            case 3:
                controlador.setOpcion(Opcion.ELIMINAR);
                //data.eleminarDulce(getNameEliminar());
                break;
            case 4:
                controlador.setOpcion(Opcion.MOSTRAR);
        }

        controlador.actionPerformed(null);
    }

    @Override
    public String getNameAgregar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getNameAgregar'");
    }

    @Override
    public String getTipoAgregar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getTipoAgregar'");
    }

    @Override
    public String getNameActualizarC() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getNameActualizarC'");
    }

    @Override
    public String getNameActualizar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getNameActualizar'");
    }

    @Override
    public String getTipoActualizar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getTipoActualizar'");
    }

    @Override
    public String getNameEliminar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getNameEliminar'");
    }

    @Override
    public void mostrarDulces(String n) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mostrarDulces'");
    }

    @Override
    public void mostrarAllDulces(String n) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mostrarAllDulces'");
    }


}