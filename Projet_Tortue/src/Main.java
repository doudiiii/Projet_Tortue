import modele.Classe;
import modele.Database;
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
            JLabel L = new JLabel("coucou");
            //Database.Connexion connexion = new Database.Connexion("Database.db");
            //connexion.connect();
            //connexion.close();
    }

    public static void main(String[] args){
        Main menu= new Main();
    }
}
    

