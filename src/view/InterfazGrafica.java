package view;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
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
        gestionMenu();
        InitlaminaAgregar();
        ventana.setVisible(true);
    }

    public void gestionMenu() {
        JMenuBar barraMenu = new JMenuBar();
        JMenu menu = new JMenu("Gestionar Dulces");
        barraMenu.add(menu);
        JMenuItem AgregarDulces = new JMenuItem("Agregar Dulce");
        JMenuItem ModificarDulces = new JMenuItem("Modificar Dulces");
        JMenuItem EliminarDulces = new JMenuItem("Eliminar Dulces");
        menu.add(AgregarDulces);
        menu.add(ModificarDulces);
        menu.add(EliminarDulces);
        ventana.add(barraMenu, BorderLayout.NORTH);
    }

    public void InitlaminaAgregar() {
        laminaAgregar = new JPanel();
        laminaAgregar.setLayout(null);
        JLabel title = new JLabel("AGREGAR DULCES");
        title.setBounds(130, 40, 130, 30);
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
        ventana.add(laminaAgregar, BorderLayout.CENTER);
    }

    public JRadioButton dulce;
    public JRadioButton acido;
    public JRadioButton sinAzucar;
    public JButton buttonCrearDulce = new JButton("Crear Dulce");;
    public JFrame ventana;
    private JMenuBar barraMenu;
    private JPanel laminaAgregar;
    private ControladorDulces controlador;
    public JTextField campoNombre = new JTextField("");

}
