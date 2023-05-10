package model;

public class Dulce{
    public Dulce(char Tipo,String name){
        dulce=false;
        acido=false;
        sinAzucar=false;
        this.name=name;
        switch (Tipo) {
            case 'D':
                this.dulce=true;
                break;
            case 'A':
                this.acido=true;
            case 'S':
                this.sinAzucar=true;
        }
    }

    public char getTipo(){
        if(dulce){
            return 'D';
        }else if(acido){
            return 'A';
        }else if(sinAzucar){
            return 'S';
        }else{
            return 'X';
        }
    }


    public String getName(){
        return name;
    }

    private String name;
    private boolean dulce;
    private boolean acido;
    private boolean sinAzucar;
}
