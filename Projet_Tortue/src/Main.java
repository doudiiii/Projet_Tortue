import DAO.Database;
import modele.Classe;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * Created by moi on 24/03/2017.
 * test
 */
public class Main extends JFrame {

    private JPanel panelGauche = new JPanel();
    private ArrayList<Classe> mesClasses;

    public Main()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Test");
        this.setSize(1200, 800);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        JLabel L = new JLabel("coucou");
        Database connexion = new Database(".\\ressources\\IHM\\");
        connexion.connect();


        //ecrasement de la BDD par les nouvelles donnees
    }

    public static void main(String[] args){
        Main menu= new Main();
    }
}
    

