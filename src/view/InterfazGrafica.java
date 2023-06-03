package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import controller.ControladorDulces;
import model.Datos;

public class InterfazGrafica implements PlantillaInterfaz {

    public InterfazGrafica() {
        buttonEliminar = new JButton("Eliminar");
        labelActualizar = new JLabel("no se encontro nigun dulce con este nombre");
        labelNuevosDatos = new JLabel("Ingrese los nuevos datos: ");
        ButtonactualizarM = new JButton("ActualizarM");
        areaMostrar = new JTextArea("");
        buttonCrearDulce = new JButton("Crear Dulce");
        campoNombre = new JTextField("");
        campoNombreEliminar = new JTextField("");
        campoNombreActualizar = new JTextField("");
        buttonComprobarA = new JButton("Comprobar");
        buttonActualizarA = new JButton("Actualizar");
        buttonAllDulces = new JButton("Dulces Creados");
        areaMostrarAll = new JTextArea();
        exitAll = new JButton("Salir");

    }

    @Override
    public void init(ControladorDulces controlador) {
        ventana = new JFrame("Dulceria");
        ventana.setResizable(false);
        ventana.setLayout(new BorderLayout());
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(new Dimension(400, 400));
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
        this.controlador = controlador;
        InitlaminaAgregar();
        initLaminaActualizar();
        initLaminaMostar();
        initLaminaEliminar();
        gestionMenu();

    }

    @Override
    public String getNameComprobar() {
        return campoNombreActualizar.getText();
    }

    @Override
    public void comprobar(String n) {
        int var = controlador.retornoComprobar(n);
        if (var > -1) {
            campoNombreActualizar.setText("");
            cambiarVistaActualizar();
        }
    }

    @Override
    public void mostrarAllDulces(String n) {

    }

    @Override
    public void mostrarDulces(String n) {
        areaMostrar.setText(n);
    }

    @Override
    public String getNameAgregar() {
        return campoNombre.getText();
    }

    @Override
    public String getTipoAgregar() {
        if (categoriaDulce.getSelection() == dulce) {
            return dulce.getText();
        } else if (categoriaDulce.getSelection() == acido) {
            return acido.getText();
        } else {
            return sinAzucar.getText();
        }

    }

    @Override
    public String getNameActualizar() {
        return campoNombreActualizar.getText();
    }

    @Override
    public String getTipoActualizar() {
        if (categoriaDulce.getSelection() == dulceA) {
            return dulceA.getText();
        } else if (categoriaDulce.getSelection() == acidoA) {
            return acidoA.getText();
        } else {
            return sinAzucarA.getText();
        }
    }

    @Override
    public String getNameEliminar() {
        return campoNombreEliminar.getText();
    }

    public void gestionMenu() {
        JTabbedPane panel = new JTabbedPane();
        panel.addTab("Agregar", laminaAgregar);
        panel.addTab("Actualizar", laminaActualizarDulces);
        panel.addTab("Eliminar", laminaEliminarDulces);
        panel.addTab("Mostrar", LaminaMostrarDulces);
        ventana.add(panel);

    }

    public void InitlaminaAgregar() {
        laminaAgregar = new JPanel();
        laminaAgregar.setBackground(new Color(196, 223, 223));
        laminaAgregar.setLayout(null);
        title = new JLabel("AGREGAR DULCES");
        title.setBounds(130, 30, 130, 30);
        laminaAgregar.add(title);
        nombreDulce = new JLabel("Nombre del Dulce: ");
        nombreDulce.setBounds(60, 100, 180, 30);
        laminaAgregar.add(nombreDulce);
        campoNombre.setBounds(180, 100, 150, 30);
        campoNombre.setBackground(new Color(248, 246, 244));
        laminaAgregar.add(campoNombre);
        labelTipoDulce = new JLabel("Tipo De Dulce:");
        labelTipoDulce.setBounds(140, 155, 150, 30);
        laminaAgregar.add(labelTipoDulce);
        sinAzucar = new JRadioButton("Sin Azucar");
        acido = new JRadioButton("Acido");
        dulce = new JRadioButton("Dulce");
        dulce.setBackground(new Color(196, 223, 223));
        sinAzucar.setBackground(new Color(196, 223, 223));
        acido.setBackground(new Color(196, 223, 223));
        categoriaDulce = new ButtonGroup();
        categoriaDulce.add(sinAzucar);
        categoriaDulce.add(acido);
        categoriaDulce.add(dulce);
        sinAzucar.setBounds(140, 190, 100, 20);
        acido.setBounds(140, 210, 100, 20);
        dulce.setBounds(140, 230, 100, 20);
        laminaAgregar.add(sinAzucar);
        laminaAgregar.add(acido);
        laminaAgregar.add(dulce);
        buttonCrearDulce.setBounds(210, 270, 120, 30);
        buttonCrearDulce.setBackground(new Color(227, 244, 244));
        buttonCrearDulce.addActionListener(controlador);
        laminaAgregar.add(buttonCrearDulce);
        buttonAllDulces.setBounds(40, 270, 150, 30);
        buttonAllDulces.setBackground(new Color(227, 244, 244));
        buttonAllDulces.addActionListener(controlador);
        laminaAgregar.add(buttonAllDulces);
    }

    public void initLaminaEliminar() {
        laminaEliminarDulces = new JPanel();
        laminaEliminarDulces.setBackground(new Color(196, 223, 223));
        laminaEliminarDulces.setLayout(null);
        JLabel titleEliminar = new JLabel("ELIMINAR DULCE");
        titleEliminar.setBounds(130, 30, 150, 30);
        laminaEliminarDulces.add(titleEliminar);
        JLabel labelnameD = new JLabel("Nombre Del Dulce: ");
        labelnameD.setBounds(60, 100, 180, 30);
        laminaEliminarDulces.add(labelnameD);
        campoNombreEliminar.setBounds(180, 100, 150, 30);
        campoNombreEliminar.setBackground(new Color(248, 246, 244));
        laminaEliminarDulces.add(campoNombreEliminar);
        buttonEliminar.setBounds(150, 250, 90, 30);
        buttonEliminar.setBackground(new Color(227, 244, 244));
        buttonEliminar.addActionListener(controlador);
        laminaEliminarDulces.add(buttonEliminar);
    }

    public void initLaminaMostar() {
        LaminaMostrarDulces = new JPanel();
        LaminaMostrarDulces.setBackground(new Color(196, 223, 223));
        LaminaMostrarDulces.setLayout(null);
        JLabel titleMostrar = new JLabel("VISTA DE TODOS LOS DULCES");
        titleMostrar.setBounds(100, 30, 200, 30);
        LaminaMostrarDulces.add(titleMostrar);
        areaMostrar.setBounds(30, 60, 320, 250);
        areaMostrar.setBackground(new Color(196, 223, 223));
        areaMostrar.setEditable(false);
        LaminaMostrarDulces.add(areaMostrar);
        ButtonactualizarM.setBounds(150, 285, 100, 30);
        ButtonactualizarM.setVisible(true);
        ButtonactualizarM.addActionListener(controlador);
        LaminaMostrarDulces.add(ButtonactualizarM);

    }

    public void initLaminaActualizar() {
        laminaActualizarDulces = new JPanel();
        laminaActualizarDulces.setBackground(new Color(196, 223, 223));
        laminaActualizarDulces.setLayout(null);
        JLabel titleActualizar = new JLabel("ACTUALIZAR DULCES");
        titleActualizar.setBounds(130, 30, 150, 30);
        laminaActualizarDulces.add(titleActualizar);
        JLabel labelnameA = new JLabel("Nombre Del Dulce: ");
        labelnameA.setBounds(60, 100, 180, 30);
        laminaActualizarDulces.add(labelnameA);
        campoNombreActualizar.setBounds(180, 100, 150, 30);
        campoNombreActualizar.setBackground(new Color(248, 246, 244));
        laminaActualizarDulces.add(campoNombreActualizar);
        buttonActualizarA.setBounds(150, 220, 100, 30);
        laminaActualizarDulces.add(buttonActualizarA);
        buttonComprobarA.setBounds(150, 220, 100, 30);
        laminaActualizarDulces.add(buttonComprobarA);
        labelActualizar.setBounds(65, 170, 320, 20);
        laminaActualizarDulces.add(labelActualizar);
        labelActualizar.setVisible(false);
        grupoA = new ButtonGroup();
        dulceA = new JRadioButton("Dulce");
        acidoA = new JRadioButton("Acido");
        sinAzucarA = new JRadioButton("Sin Azucar");
        dulceA.setBackground(new Color(196, 223, 223));
        sinAzucarA.setBackground(new Color(196, 223, 223));
        acidoA.setBackground(new Color(196, 223, 223));
        grupoA.add(dulceA);
        grupoA.add(acidoA);
        grupoA.add(sinAzucarA);
        dulceA.setBounds(120, 180, 60, 30);
        sinAzucarA.setBounds(120, 160, 100, 30);
        acidoA.setBounds(120, 140, 60, 30);
        laminaActualizarDulces.add(dulceA);
        laminaActualizarDulces.add(sinAzucarA);
        laminaActualizarDulces.add(acidoA);
        dulceA.setVisible(false);
        acidoA.setVisible(false);
        sinAzucarA.setVisible(false);
        labelNuevosDatos.setBounds(60, 80, 180, 20);
        laminaActualizarDulces.add(labelNuevosDatos);
        labelNuevosDatos.setVisible(false);
        buttonComprobarA.setBounds(150, 220, 100, 30);
        buttonComprobarA.setBackground(new Color(227, 244, 244));
        buttonComprobarA.addActionListener(controlador);
        laminaActualizarDulces.add(buttonComprobarA);
        buttonActualizarA.setBackground(new Color(227, 244, 244));
        buttonActualizarA.setVisible(false);
        buttonActualizarA.addActionListener(controlador);
    }

    public void cambiarVistaActualizar() {
        buttonActualizarA.setVisible(false);
        dulceA.setVisible(true);
        acidoA.setVisible(true);
        sinAzucarA.setVisible(true);
        labelNuevosDatos.setVisible(true);
        buttonActualizarA.setVisible(true);
    }

    public JButton buttonEliminar;
    public JButton buttonAllDulces;
    public JButton buttonComprobarA;
    public JButton buttonActualizarA;
    public JButton exitAll;
    public JButton buttonCrearDulce;
    public JButton ButtonactualizarM;

    public JLabel title;
    public JLabel nombreDulce;
    public JLabel labelTipoDulce;
    public JLabel labelActualizar;
    public JLabel labelNuevosDatos;

    public JTextField campoNombre;
    public JTextField campoNombreEliminar;
    public JTextField campoNombreActualizar;

    public JTextArea areaMostrarAll;
    public JTextArea areaMostrar;

    public JRadioButton dulceA;
    public JRadioButton acidoA;
    public JRadioButton sinAzucarA;
    public JRadioButton dulce;
    public JRadioButton acido;
    public JRadioButton sinAzucar;

    public ButtonGroup grupoA;
    public ButtonGroup categoriaDulce;

    private JPanel laminaActualizarDulces;
    private JPanel LaminaMostrarDulces;
    private JPanel laminaEliminarDulces;
    public JPanel laminaAgregar;

    public JFrame ventana;

    private ControladorDulces controlador;

}
