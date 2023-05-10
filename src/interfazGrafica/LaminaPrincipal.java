package interfazGrafica;

import java.awt.BorderLayout;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

public class LaminaPrincipal extends JPanel {
    public LaminaPrincipal(){
        this.setLayout(new BorderLayout());
        MenuPrincipal();
    }
    
    public void MenuPrincipal(){
        JMenuBar barraMenu = new JMenuBar();
        add(barraMenu,BorderLayout.NORTH);

        JMenu gestionarDulces=new JMenu("Gestionar Dulces");
        barraMenu.add(gestionarDulces);

        JMenu buscarDulces=new JMenu("Buscar Dulces");
        barraMenu.add(buscarDulces);

        JMenu listarDulces=new JMenu("Bodega");
        barraMenu.add(listarDulces);
    }
}
