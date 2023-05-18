package view;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class InterfazGrafica {

    public void iniciarComponentes() {
        ventana = new JFrame("Dulceria");
        ventana.setResizable(false);
        ventana.setLayout(new BorderLayout());
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(new Dimension(400, 400));
        ventana.setLocationRelativeTo(null);
        InitlaminaAgregar();
        initLaminaEliminar();
        initLaminaMostar();
        initLaminaActualizar();
        gestionMenu();
    }

    public void gestionMenu() {
        JTabbedPane panel = new JTabbedPane();
        panel.addTab("Agregar", laminaAgregar);
        panel.addTab("Eliminar", laminaEliminarDulces);
        panel.addTab("Mostrar", LaminaMostrarDulces);
        panel.addTab("Actualizar", laminaActualizarDulces);
        ventana.add(panel);

    }

    public void InitlaminaAgregar() {
        laminaAgregar = new JPanel();
        laminaAgregar.setLayout(null);
        JLabel title = new JLabel("AGREGAR DULCES");
        title.setBounds(130, 30, 130, 30);
        laminaAgregar.add(title);
        JLabel nombreDulce = new JLabel("Nombre del dulce: ");
        nombreDulce.setBounds(60, 100, 180, 30);
        laminaAgregar.add(nombreDulce);
        campoNombre.setBounds(180, 100, 150, 30);
        laminaAgregar.add(campoNombre);
        JLabel labelTipoDulce = new JLabel("Tipo De Dulce:");
        labelTipoDulce.setBounds(140, 155, 150, 30);
        laminaAgregar.add(labelTipoDulce);
        sinAzucar = new JRadioButton("Sin Azucar");
        acido = new JRadioButton("Acido");
        dulce = new JRadioButton("Dulce");
        ButtonGroup categoriaDulce = new ButtonGroup();
        categoriaDulce.add(sinAzucar);
        categoriaDulce.add(acido);
        categoriaDulce.add(dulce);
        sinAzucar.setBounds(140, 190, 100, 20);
        acido.setBounds(140, 210, 100, 20);
        dulce.setBounds(140, 230, 100, 20);
        laminaAgregar.add(sinAzucar);
        laminaAgregar.add(acido);
        laminaAgregar.add(dulce);
        buttonCrearDulce.setBounds(200, 270, 120, 30);
        laminaAgregar.add(buttonCrearDulce);
        JButton buttonrefrescarCampos = new JButton("Refrescar");
        buttonrefrescarCampos.setBounds(70, 270, 100, 30);
        laminaAgregar.add(buttonrefrescarCampos);
    }

    public void initLaminaEliminar() {
        laminaEliminarDulces = new JPanel();
        laminaEliminarDulces.setLayout(null);
        JLabel titleEliminar = new JLabel("ELIMINAR DULCE");
        titleEliminar.setBounds(130, 30, 150, 30);
        laminaEliminarDulces.add(titleEliminar);
        JLabel labelnameD = new JLabel("Nombre Del Dulce: ");
        labelnameD.setBounds(60, 100, 180, 30);
        laminaEliminarDulces.add(labelnameD);
        campoNombreEliminar.setBounds(180, 100, 150, 30);
        laminaEliminarDulces.add(campoNombreEliminar);
        labelEliminar.setBounds(120, 170, 180, 30);
        laminaEliminarDulces.add(labelEliminar);
        labelEliminar.setVisible(false);
        buttonEliminar.setBounds(150, 250, 90, 30);
        laminaEliminarDulces.add(buttonEliminar);
    }

    public void initLaminaMostar() {
        LaminaMostrarDulces = new JPanel();
        LaminaMostrarDulces.setLayout(null);
        JLabel titleMostrar = new JLabel("VISTA DE TODOS LOS DULCES");
        titleMostrar.setBounds(100, 30, 200, 30);
        LaminaMostrarDulces.add(titleMostrar);
        areaMostrar.setBounds(30, 60, 320, 200);
        areaMostrar.setEditable(false);
        LaminaMostrarDulces.add(areaMostrar);
        ButtonactualizarM.setBounds(150, 285, 100, 30);
        LaminaMostrarDulces.add(ButtonactualizarM);

    }

    public void initLaminaActualizar() {
        laminaActualizarDulces = new JPanel();
        laminaActualizarDulces.setLayout(null);
        JLabel titleActualizar = new JLabel("ACTUALIZAR DULCES");
        titleActualizar.setBounds(130, 30, 150, 30);
        laminaActualizarDulces.add(titleActualizar);
        JLabel labelnameA = new JLabel("Nombre Del Dulce: ");
        labelnameA.setBounds(60, 100, 180, 30);
        laminaActualizarDulces.add(labelnameA);
        campoNombreActualizar.setBounds(180, 100, 150, 30);
        laminaActualizarDulces.add(campoNombreActualizar);
        buttonActualizarA.setBounds(150, 220, 100, 30);
        laminaActualizarDulces.add(buttonActualizarA);
        buttonComprobarA.setBounds(150, 220, 100, 30);
        laminaActualizarDulces.add(buttonComprobarA);
        labelActualizar.setBounds(65, 170, 320, 20);
        laminaActualizarDulces.add(labelActualizar);
        labelActualizar.setVisible(false);
        ButtonGroup grupoA = new ButtonGroup();
        dulceA = new JRadioButton("Dulce");
        acidoA = new JRadioButton("Acido");
        sinAzucarA = new JRadioButton("Sin Azucar");
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
        laminaActualizarDulces.add(buttonComprobarA);
        buttonActualizarA.setVisible(false);
    }

    public JButton buttonEliminar = new JButton("Eliminar");
    public JLabel labelEliminar = new JLabel("No Se Encontro El Dulce");
    public JLabel labelActualizar = new JLabel(
            "no se encontro nigun dulce con este nombre");
    public JLabel labelNuevosDatos = new JLabel("Ingrese los nuevos datos: ");
    public JButton ButtonactualizarM = new JButton("Actualizar");
    public JTextArea areaMostrar = new JTextArea("");
    private JPanel laminaActualizarDulces;
    private JPanel LaminaMostrarDulces;
    private JPanel laminaEliminarDulces;
    public JRadioButton dulceA;
    public JRadioButton acidoA;
    public JRadioButton sinAzucarA;
    public JRadioButton dulce;
    public JRadioButton acido;
    public JRadioButton sinAzucar;
    public JButton buttonCrearDulce = new JButton("Crear Dulce");;
    public JFrame ventana;
    private JPanel laminaAgregar;
    public JTextField campoNombre = new JTextField("");
    public JTextField campoNombreEliminar = new JTextField("");
    public JTextField campoNombreActualizar = new JTextField("");
    public JButton buttonComprobarA = new JButton("Comprobar");
    public JButton buttonActualizarA = new JButton("Actualizar");
}
