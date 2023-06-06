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
                this.tipo = TipoDulce.DULCE;
                break;
            case SINAZUCAR:
                this.tipo = TipoDulce.SINAZUCAR;
                break;
            case ACIDO:
                this.tipo = TipoDulce.ACIDO;
                break;
            default:
                this.tipo = TipoDulce.SINESPECIFICAR;
        
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
