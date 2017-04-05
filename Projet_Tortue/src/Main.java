import DAO.Database;
import application.eleve.Classe;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.util.ArrayList;

/**
 * Created by moi on 24/03/2017.
 * test
 */
public class Main extends JFrame {

    private JPanel panelGauche = new JPanel();
    private ArrayList<Classe> mesClasses;


    public Main() throws SQLException {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Test");
        this.setSize(1200, 800);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        JLabel L = new JLabel("coucou");

        Database connexion = new Database(".\\ressources\\IHM\\");
        connexion.connect();

        //connexion = null;
       // Statement statement = null;
        ResultSet resultat = null;

       Statement statement = connexion.createStatement();
        resultat = statement.executeQuery("SELECT Nom,Prenom  FROM Eleve;");

        /* Récupération des données du résultat de la requête de lecture */
        while ( resultat.next() ) {
            String nom = resultat.getString( "nom" );
            String prenom = resultat.getString( "prenom" );

            JTabbedPane messages = null;
            System.out.print("Données retournées par la requête : nom = " + nom + ", prenom = " + prenom + "." );
        }
        //ecrasement de la BDD par les nouvelles donnees
    }

    public static void main(String[] args) throws SQLException {
        Main menu= new Main();
    }
}
    

