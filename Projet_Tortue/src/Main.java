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
        /////////////////////////////////////////
        System.out.println("Inserting records into the table...");
        Statement statement = connexion.createStatement();

        String sql = "INSERT INTO Eleve " +
                "VALUES (3,100, 'Vallee', 'Narine', 18,1,'balabal')";
        statement.executeUpdate(sql);
        sql = "INSERT INTO Eleve " +
                "VALUES (4,101, 'Suc', 'Dori-Ane', 25,1,'balabal')";
        statement.executeUpdate(sql);
        sql = "INSERT INTO Eleve " +
                "VALUES (5,102, 'Sarazin', 'Marion', 30,1,'balabal')";
        statement.executeUpdate(sql);
        sql = "INSERT INTO Eleve " +
                "VALUES(6,103, 'Pepas', 'Jennifire', 28,1,'balabal')";
        statement.executeUpdate(sql);
        System.out.println("Inserted records into the table...");




    ////////////////////////////////////////
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
    

