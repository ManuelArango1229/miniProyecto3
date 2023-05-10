package interfazGrafica;

import javax.swing.JFrame;

public class PrincipalGrafica {
    public PrincipalGrafica(){
        Frame ventana=new Frame();
        ventana.setVisible(true);
    }
    private class Frame extends JFrame{
        public Frame(){
            this.setSize(400,400);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setLocationRelativeTo(null);
            this.add(new LaminaPrincipal());
        }
    }
}



