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
            case ACIDO:
                return "Acido";
            default:
                return "Sin Especificar";
        }

    }

    public void setTipo(TipoDulce tipo) {
        switch (tipo) {
            case DULCE:
                tipo = TipoDulce.DULCE;
            case SINAZUCAR:
                tipo = TipoDulce.SINAZUCAR;
            case ACIDO:
                tipo = TipoDulce.ACIDO;
            default:
                tipo = TipoDulce.SINESPECIFICAR;
        }

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
