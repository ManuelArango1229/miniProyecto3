package model;

public class Dulce {
    public Dulce(char Tipo, String name) {
        dulce = false;
        acido = false;
        sinAzucar = false;
        this.name = name;
        switch (Tipo) {
            case 'D':
                this.dulce = true;
                break;
            case 'A':
                this.acido = true;
            case 'S':
                this.sinAzucar = true;
        }
    }

    public String getTipo() {
        if (dulce) {
            return "Dulce";
        } else if (acido) {
            return "Acido";
        } else if (sinAzucar) {
            return "Sin Azucar";
        } else {
            return "No Especificado";
        }
    }

    public void setTipo(char tipo) {
        dulce = false;
        sinAzucar = false;
        acido = false;
        switch (tipo) {
            case 'D':
                dulce = true;
                break;
            case 'S':
                sinAzucar = true;
            case 'A':
                acido = true;
            default:
                break;
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private String name;
    private boolean dulce;
    private boolean acido;
    private boolean sinAzucar;
}
