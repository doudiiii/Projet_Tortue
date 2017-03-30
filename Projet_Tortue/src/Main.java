import modele.Classe;
import modele.Eleve;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * Created by moi on 24/03/2017.
 */
public class Main extends JFrame {

    private GridLayout Grid = new GridLayout(2,1);
    private JPanel panelGauche = new JPanel();
    private JPanel panelDroite = new JPanel(Grid);
    private ArrayList<Classe> mesClasses;

    public Main()
    {
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setTitle("Test");
            this.setSize(1200, 800);
            this.setLocationRelativeTo(null);
            this.setVisible(true); 
    }

    public static void main(String[] args){
        Main menu= new Main();
    }
}
    

