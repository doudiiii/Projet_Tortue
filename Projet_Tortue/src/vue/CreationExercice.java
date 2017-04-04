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
    private ImageIcon image = new ImageIcon();
    
    //Creation des panels 
    private JPanel panelGeneral1 = new JPanel();
    private JPanel panelGeneral = new JPanel(); // permet de regrouper l'ensemble des donnees
    private JPanel panelTortue = new JPanel();
    private JPanel panelTortue2 = new JPanel(); // panel qui va contenir les 3 boutons des tortues 
    private JPanel panelInfo = new JPanel();
    private JPanel panelImage = new JPanel();
    private JPanel panelNom = new JPanel();
    private JPanel panelDate = new JPanel();
    
    //Creation des labels 
    private JLabel labelTitre = new JLabel("Création de l'exercice : ");
    
    private JLabel labelNom = new JLabel("Nom : ");
    private JLabel labelDate = new JLabel("Date : ");
    
    private JLabel labelAjouterImage = new JLabel("Ajouter une image : ");
    private JLabel labelTortueDispo = new JLabel("Tortues disponibles : ");
    
    //Creation des JTextField 
    private JTextField entreeNom = new JTextField();
    private JTextField entreeDate = new JTextField();
    
    private JLabel messImage = new JLabel("Sélectionnez votre image :");
    
    //Creation du bouton valider 
    private JButton valider = new JButton ("Valider");
    
    //Creation des tortues sélectionnable 
    private PanelLabelBouton tClassique = new PanelLabelBouton(new ImageIcon(".\\ressources\\Image\\t2.png"), new JLabel ("Tortue Classique"));
    private PanelLabelBouton tRapide = new PanelLabelBouton(new ImageIcon(".\\ressources\\Image\\t2.png"), new JLabel ("Tortue Rapide"));
    private PanelLabelBouton tCouleur = new PanelLabelBouton(new ImageIcon(".\\ressources\\Image\\t2.png"), new JLabel ("Tortue Couleur"));

public CreationExercice(){
    this.setTitle("Creation de l'exercice");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //this.setSize(800, 600);
    
    //ajout des éléments dans la barre des menus 
    menu.add(deconnexion);
    menu.add(retour);
    setJMenuBar(menu);
    
    entreeNom.setColumns(10);
    entreeDate.setColumns(10);
    panelNom.add(labelNom,BorderLayout.WEST);
    panelNom.add(entreeNom,BorderLayout.EAST);
    panelDate.add(labelDate,BorderLayout.WEST);
    panelDate.add(entreeDate,BorderLayout.EAST);

    //Panel informations de l'exo
    panelInfo.setLayout(new GridLayout(3,1));
    panelInfo.add(labelTitre);
    panelInfo.add(panelNom);
    panelInfo.add(panelDate);
    
    // CREE PANEL
    panelImage = new JPanel(new BorderLayout(2,1));
    panelImage.add(messImage);
    panelImage.add(new JLabel(image));
    
    //panelTortue2.setLayout(new GridLayout(1,3));
    panelTortue2.add(tClassique, BorderLayout.WEST);
    panelTortue2.add(tRapide, BorderLayout.CENTER);
    panelTortue2.add(tCouleur, BorderLayout.EAST);
    
    panelTortue.setLayout(new GridLayout(2,1));
    panelTortue.add(labelTortueDispo);
    panelTortue.add(panelTortue2);
    
    // panel general regrouppant tous les items
    panelGeneral1.setLayout(new GridLayout(2,1));
    panelGeneral1.add(panelInfo);
   // panelGeneral1.add(panelImage);
    panelGeneral1.add(panelTortue);
    
    //panelGeneral.setLayout(new BoxLayout(panelGeneral, BoxLayout.Y_AXIS));
    panelGeneral.add(panelGeneral1);
    panelGeneral.add(valider);
    
    this.add(panelGeneral);
    this.pack();
    this.setVisible(true);
}


public static void main(String[] args){
        CreationExercice co= new CreationExercice();
    }
}