package model;

import controller.TipoDulce;

public class Dulce {

    public Dulce(TipoDulce Tipo, String name) {

        this.name = name;
        this.tipo = Tipo;

    }

    public String getTipo() {
        switch (tipo) {
            case DULCE:
                return "Dulce";
            case SINAZUCAR:
                return "Sin Azucar";
            default:
                return "Acido";
        }

    }

    public void setTipo(char tipo) {
        // dulce = false;
        // sinAzucar = false;
        // acido = false;
        // switch (tipo) {
        // case 'D':
        // dulce = true;
        // break;
        // case 'S':
        // sinAzucar = true;
        // case 'A':
        // acido = true;
        // default:
        // break;
        // }
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private Datos data;
    private String name;
    private TipoDulce tipo;
}
