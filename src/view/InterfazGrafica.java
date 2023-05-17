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
import javax.swing.JTextField;

import controller.ControladorDulces;

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
        JButton eliminar = new JButton("Elminar");
        eliminar.setBounds(150, 250, 90, 30);
        laminaEliminarDulces.add(eliminar);
    }

    public void initLaminaMostar() {
        LaminaMostrarDulces = new JPanel();
        LaminaMostrarDulces.setLayout(null);
        JLabel titleMostrar = new JLabel("VISTA DE TODOS LOS DULCES");
        titleMostrar.setBounds(100, 30, 200, 30);
        LaminaMostrarDulces.add(titleMostrar);
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
    }

    private JPanel laminaActualizarDulces;
    private JPanel LaminaMostrarDulces;
    private JPanel laminaEliminarDulces;
    public JRadioButton dulce;
    public JRadioButton acido;
    public JRadioButton sinAzucar;
    public JButton buttonCrearDulce = new JButton("Crear Dulce");;
    public JFrame ventana;
    private JPanel laminaAgregar;
    private ControladorDulces controlador;
    public JTextField campoNombre = new JTextField("");
    public JTextField campoNombreEliminar = new JTextField("");
    public JTextField campoNombreActualizar = new JTextField("");
}
