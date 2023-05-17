package model;

import java.util.ArrayList;

public class Datos {
    private ArrayList<Dulce> datos = new ArrayList<>();

    public Boolean agregarDulces(Dulce dulce) {
        datos.add(dulce);
        return true;
    }

    public ArrayList<Dulce> obteberDulces() {
        return datos;
    }

}
