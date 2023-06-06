package view;

import controller.ControladorDulces;
import controller.Opcion;
import model.Datos;
import controller.TipoDulce;

import java.util.Scanner;

public class Consola implements PlantillaInterfaz {

    Scanner scanner = new Scanner(System.in);
    ControladorDulces controlador;
    int opcion = 0;
    Datos data;
    String nombre;
    @Override
    public void init(ControladorDulces controlador) {
        
        while(true){
        System.out.println("******************** BIENVENIDO ********************\n");
        System.out.println("1. Agregar Dulces");
        System.out.println("2. Actualizar Dulces");
        System.out.println("3. Eliminar Dulces");
        System.out.println("4. Mostrar Dulces Actuales");
        System.out.println("5. Mostrar Todos los Dulces");
        System.out.println("0. Salir\n");

        do {
            System.out.print("Ingrese una opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine();
        }while(opcion < 0 || opcion > 5);

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
                break;
            case 5:
                controlador.setOpcion(Opcion.ALLMOSTRAR);
        }

        controlador.actionPerformed(null);
    }
    }

    @Override
    public String getNameAgregar() {
        String nombre = "";
        System.out.println("\n****************************************************");
        System.out.print("Ingrese el nombre del dulce: ");
        nombre = scanner.nextLine();
        return nombre;
    }

    @Override
    public TipoDulce getTipoAgregar() {
        TipoDulce tipo = TipoDulce.DULCE;
        int tipoInt = 0;
        System.out.println("\n****************************************************");
        System.out.println("Ingrese el tipo de dulce...");
        System.out.println("1. Dulce");
        System.out.println("2. Acido");
        System.out.println("3. Sin Azucar\n");
        System.out.print("Ingrese su eleccion:");

        while (tipoInt < 1 || tipoInt > 3) {
            tipoInt = scanner.nextInt();
            scanner.nextLine();
        }

        switch (tipoInt) {
            case 1:
                tipo = TipoDulce.DULCE;
                break;
            case 2:
                tipo = TipoDulce.ACIDO;
                break;
            case 3:
                tipo = TipoDulce.SINAZUCAR;
                break;
        }

        return tipo;
    }

    @Override
    public String getNameActualizarC() {
        String nombre = "";
        System.out.println("\n****************************************************");
        System.out.print("Ingrese el nombre actual del dulce: ");
        nombre = scanner.nextLine();
        return nombre;
    }

    @Override
    public String getNameActualizar() {

        String nombre = "";
        System.out.println("\n****************************************************");
        System.out.print("Ingrese el nombre nuevo del dulce: ");
        nombre = scanner.nextLine();
        return nombre;
    }

    @Override
    public String getTipoActualizar() {

        String tipo = "";
        int tipoInt = 0;
        System.out.println("\n****************************************************");
        System.out.println("Ingrese el tipo de dulce...");
        System.out.println("1. Dulce");
        System.out.println("2. Acido");
        System.out.println("3. Sin Azucar\n");
        System.out.print("Ingrese su eleccion:");

        while (tipoInt < 1 || tipoInt > 3) {
            tipoInt = scanner.nextInt();
            scanner.nextLine();
        }

        switch (tipoInt) {
            case 1:
                tipo = "Dulce";
                break;
            case 2:
                tipo = "Acido";
                break;
            case 3:
                tipo = "Sin Azucar";
                break;
        }

        return tipo;
    }

    @Override
    public String getNameEliminar() {

        String nombre = "";
        System.out.println("\n****************************************************");
        System.out.print("Ingrese el nombre del dulce a eliminar: ");
        nombre = scanner.nextLine();
        return nombre;
    }

    @Override
    public void mostrarDulces(String n) {
        System.out.println("\n****************************************************");
        System.out.println(n + "\n");
        System.out.print("Presione enter para continuar...");
        scanner.nextLine();
    }

    @Override
    public void mostrarAllDulces(String n) {
        System.out.println("\n****************************************************");
        System.out.println(n + "\n");
        System.out.print("Presione enter para continuar...");
        scanner.nextLine();
    }

}