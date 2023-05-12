package controller;

import model.Datos;
import view.DulceriaVistas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorDulces implements ActionListener{
    
    public ControladorDulces(Datos almacenamientoDatos, DulceriaVistas interfaz) {
        this.data = almacenamientoDatos;
        this.view = interfaz;
    }

    public void iniciar(){   //////iniciar vista
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }

    private Datos data;
    private DulceriaVistas view;
    
}
