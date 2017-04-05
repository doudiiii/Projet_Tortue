/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces.vues;
import java.awt.*;
import javax.swing.*;

/**
 *
 * @author doudi
 */
public class ConnexionProf extends JPanel {
    
    private JLabel labMess = new JLabel("Veuillez remplir les champs pour vous connecter");
    private JLabel labelIdentification = new JLabel("Identifiant : ");
    private JLabel labelMotDePasse = new JLabel("Mot de passe : ");
    private JTextField entreeID = new JTextField();
    private JTextField entreeMDP = new JTextField();
    private JButton connexion = new JButton("Connexion");
    
    JPanel panelID = new JPanel();
    JPanel panelMdp = new JPanel();
    JPanel panelGeneral = new JPanel();
    
    public ConnexionProf(){
        
        entreeMDP.setColumns(10);
        entreeID.setColumns(10);
        
        panelID.setLayout(new GridLayout(2,2));
        panelID.add(labelIdentification);
        panelID.add(entreeID);
        panelID.add(labelMotDePasse);
        panelID.add(entreeMDP);
        
        panelGeneral.add(labMess, BorderLayout.NORTH);
        panelGeneral.add(panelID);//, BorderLayout.NORTH
        panelGeneral.add(connexion, BorderLayout.SOUTH);
        
        //this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //this.setTitle("Test");
        this.setSize(300, 150);
        this.setVisible(true);
        this.add(panelGeneral);
    }
    
    //public static void main(String[] args){
     //   ConnexionProf cp = new ConnexionProf();
  //  }
}