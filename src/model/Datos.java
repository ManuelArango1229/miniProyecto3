package model;

import java.util.ArrayList;

public class Datos {
    private ArrayList<Dulce> datos = new ArrayList<>();
    private ArrayList<Dulce> allDatos = new ArrayList<>();

    public Boolean agregarAllDulces(Dulce dulce) {
        allDatos.add(dulce);
        return true;
    }

    public ArrayList<Dulce> obteberAllDulces() {
        return allDatos;
    }

    public Boolean agregarDulces(Dulce dulce) {
        datos.add(dulce);
        return true;
    }

    public ArrayList<Dulce> obteberDulces() {
        return datos;
    }

}
