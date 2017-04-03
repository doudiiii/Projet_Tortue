/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vue;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author SERAZIN
 */

public class CreationExercice extends JFrame{
    //Creation de la barre menu
    private JMenuBar menu = new JMenuBar();
    private JMenu deconnexion = new JMenu("Deconnexion");
    private JMenu retour = new JMenu("Retour");
    
    //Creation des panels 
    private JPanel panelMenu = new JPanel();
    private JPanel panelGeneral = new JPanel();
    private JPanel panelTortue = new JPanel();
    private JPanel panelTortue2 = new JPanel(); // panel qui va contenir les 3 boutons des tortues 
    private JPanel panelInfo = new JPanel();
    private JPanel panelImage = new JPanel();
    
    //Creation des labels 
    private JLabel labelTitre = new JLabel("Création de l'exercice : ");
    private JLabel labelNom = new JLabel("Nom : ");
    private JLabel labelDate = new JLabel("Date : ");
    private JLabel labelAjouterImage = new JLabel("Ajouter une image : ");
    private JLabel labelTortueDispo = new JLabel("Tortues disponibles : ");
   
    //Creation des JTextField 
    private JTextField entreeNom;
    private JTextField entreeDate;
    
    //Creation du bouton valider 
    private JButton valider = new JButton ("Valider");
    
    //Creation des tortues sélectionnable 
    private PanelLabelBouton tClassique = new PanelLabelBouton(new ImageIcon("C:\\Users\\SERAZIN\\Desktop\\IHM_Projet\\tortue.jpg"), new JLabel ("Tortue Classique"));
    private PanelLabelBouton tRapide = new PanelLabelBouton(new ImageIcon("C:\\Users\\SERAZIN\\Desktop\\IHM_Projet\\tortue.jpg"), new JLabel ("Tortue Rapide"));
    private PanelLabelBouton tCouleur = new PanelLabelBouton(new ImageIcon("C:\\Users\\SERAZIN\\Desktop\\IHM_Projet\\tortue.jpg"), new JLabel ("Tortue Couleur"));

public CreationExercice(){
    this.setTitle("Creation de l'exercice");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    //ajout des éléments dans la barre des menus 
    menu.add(deconnexion);
    menu.add(retour);
    panelMenu.add(menu);
    
     
    panelTortue2.setLayout(new GridLayout(1,3));
    panelTortue2.add(tClassique);
    panelTortue2.add(tRapide);
    panelTortue2.add(tCouleur);
    
    panelTortue.add(labelTortueDispo, BorderLayout.NORTH);
    panelTortue.add(panelTortue2, BorderLayout.CENTER); 
    panelTortue.add(valider, BorderLayout.SOUTH);
    
    panelGeneral.setLayout(new GridLayout(4,1));
    panelGeneral.add(panelMenu);
    panelGeneral.add(panelInfo);
    panelGeneral.add(panelImage);
    panelGeneral.add(panelTortue);
    
    this.add(panelGeneral);
    this.pack();
    this.setVisible(true);
    
    
    
}
}
