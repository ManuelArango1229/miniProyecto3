package model;

import java.util.ArrayList;

import controller.TipoDulce;

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

    public String imprimirDulces() {
        String imprimir = "";
        for (int i = 0; i < datos.size(); i++) {
            imprimir += datos.get(i).getName() + "\t\t" + "";
            imprimir += datos.get(i).getTipo() + "\n";
        }
        return imprimir;
    }

    public String allImprimirDulces() {
        String imprimir = "";
        for (int i = 0; i < allDatos.size(); i++) {
            imprimir += allDatos.get(i).getName() + "\t\t";
            imprimir += allDatos.get(i).getTipo() + "\n";
        }
        return imprimir;
    }

    public int comprobarDulces(String n) {
        int ret = 0;
        for (int i = 0; i < datos.size(); i++) {
            if (datos.get(i).getName().equals(n)) {
                ret = i;
            }
        }

        if (ret > -1) {
            return ret;
        } else {
            return -1;
        }

    }

    public boolean actualizarDulces(String nameA, String nameN, TipoDulce tipo) {
        int tmp = comprobarDulces(nameA);
        datos.get(tmp).setName(nameN);
        datos.get(tmp).setTipo(tipo);
        return true;
    }

    public void crearDulce(String name, TipoDulce n) {
        Dulce nuevo = new Dulce(n, name);
        agregarAllDulces(nuevo);
        agregarDulces(nuevo);
    }

    public boolean eleminarDulce(String name) {
        datos.remove(comprobarDulces(name));
        return true;
    }
}
