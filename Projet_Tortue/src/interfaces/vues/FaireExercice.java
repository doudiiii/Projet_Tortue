/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces.vues;
import java.awt.*;
import javax.swing.*;


public class FaireExercice extends JPanel {
    
    //MENU
    JMenuBar menu = new JMenuBar();
    JMenu fichier = new JMenu("Fichier");
    JMenu edition = new JMenu("Edition");
    JMenu aide = new JMenu("Aide");
    JMenu deconnexion = new JMenu("Deconnexion");
    JMenu retour = new JMenu("Retour");
    
    JMenuItem undoMenu = new JMenuItem("Undo");
    JMenuItem redoMenu = new JMenuItem("Redo");
    JMenuItem zoomMenu = new JMenuItem("Zoom");
    JMenuItem bleuMenu = new JMenuItem("Bleu");
    JMenuItem vertMenu = new JMenuItem("Vert");
    JMenuItem jauneMenu = new JMenuItem("Jaune");
    JMenuItem roseMenu = new JMenuItem("Rose");
    JMenuItem rougeMenu = new JMenuItem("Rouge");
    JMenuItem noirMenu = new JMenuItem("Noir");
    JMenuItem dessinerMenu = new JMenuItem("Dessiner");
    JMenuItem nePasDessinerMenu = new JMenuItem("Ne pas dessiner");
    JMenuItem tournerMenu = new JMenuItem("Tourner");
    JMenuItem avancerMenu = new JMenuItem("Avancer");
    
    //JPANEL
    JPanel panelGeneral = new JPanel();
    JPanel panelBouton = new JPanel();
    JPanel panelLigne1 = new JPanel();
    JPanel panelLigne2 = new JPanel();
    JPanel panelLigne3 = new JPanel();
    JPanel panelLigne11 = new JPanel();
    JPanel panelLigne12 = new JPanel();
    JPanel panelLigne13 = new JPanel();
    JPanel affichage = new JPanel();
    JPanel panelCode = new JPanel();
    JPanel panelModele = new JPanel();
    JPanel panVitesse = new JPanel();
    JPanel boutonV = new JPanel();
    
    //PANEL LABEL BOUTON
    PanelLabelBouton undo = new PanelLabelBouton(new ImageIcon("./pictures/undo.png"), new JLabel ("Undo"));
    PanelLabelBouton redo = new PanelLabelBouton(new ImageIcon("./pictures/redo.png"), new JLabel ("Redo"));
    PanelLabelBouton zoom = new PanelLabelBouton(new ImageIcon("./pictures/zoom.png"), new JLabel ("Zoom"));
    PanelLabelBouton bleu = new PanelLabelBouton(new ImageIcon("./pictures/bleu.png"), new JLabel ("Bleu"));
    PanelLabelBouton rouge = new PanelLabelBouton(new ImageIcon("./pictures/rouge.png"), new JLabel ("Rouge"));
    PanelLabelBouton vert = new PanelLabelBouton(new ImageIcon("./pictures/vert.png"), new JLabel ("Vert"));
    PanelLabelBouton rose = new PanelLabelBouton(new ImageIcon("./pictures/rose.png"), new JLabel ("Rose"));
    PanelLabelBouton jaune = new PanelLabelBouton(new ImageIcon("./pictures/jaune.png"), new JLabel ("Jaune"));
    PanelLabelBouton noir = new PanelLabelBouton(new ImageIcon("./pictures/noir.png"), new JLabel ("Noir"));
    PanelLabelBouton dessiner = new PanelLabelBouton(new ImageIcon("./pictures/dessiner.png"), new JLabel ("Dessiner"));
    PanelLabelBouton pasDessiner = new PanelLabelBouton(new ImageIcon("./pictures/nepasdessiner.png"), new JLabel ("Ne pas dessiner"));
    PanelLabelBouton avancer = new PanelLabelBouton(new ImageIcon("./pictures/avancer.png"), new JLabel ("Avancer"));
    PanelLabelBouton tourner = new PanelLabelBouton(new ImageIcon("./pictures/tourner.png"), new JLabel ("Tourner"));
    
    // BOUTONS
    JButton haut = new JButton("+");
    JButton bas = new JButton("-");
    
    //LABEL
    JLabel nbCase = new JLabel("Nombre de case");
    JLabel nbCaseAffiche = new JLabel();
    
    public FaireExercice(){
        
       // this.setTitle("Exercice");
        //this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        fichier.add(zoomMenu);
        fichier.add(dessinerMenu);
        fichier.add(nePasDessinerMenu);
        fichier.add(tournerMenu);
        fichier.add(avancerMenu);
        fichier.add(undoMenu);
        fichier.add(redoMenu);
        
        edition.add(bleuMenu);
        edition.add(vertMenu);
        edition.add(jauneMenu);
        edition.add(roseMenu);
        edition.add(rougeMenu);
        edition.add(noirMenu);
        
        menu.add(fichier);
        menu.add(edition);
        menu.add(aide);
        menu.add(retour);
        menu.add(deconnexion);

        boutonV.setLayout(new GridLayout(2,1));
        boutonV.add(haut);
        boutonV.add(bas);
        nbCase.setFont(new Font("Arial", Font.PLAIN, 18));

        panVitesse.add(nbCase);
        panVitesse.add(boutonV);
        panVitesse.add(nbCaseAffiche);

        //UNDO REDO ZOOM VITESSE
        panelLigne11.add(undo);
        panelLigne11.add(redo);
        panelLigne12.add(zoom);
        panelLigne13.add(panVitesse);
        
        // COULEURS
        panelLigne2.add(bleu);
        panelLigne2.add(vert);
        panelLigne2.add(rouge);
        panelLigne2.add(rose);
        panelLigne2.add(jaune);
        panelLigne2.add(noir);
        
        //FONCTIONS DE BASE
        panelLigne3.add(dessiner);
        panelLigne3.add(pasDessiner);
        panelLigne3.add(tourner);
        panelLigne3.add(avancer);
        
        panelLigne1.setLayout(new GridLayout(1,3));
        panelLigne1.add(panelLigne11);
        panelLigne1.add(panelLigne12);
        panelLigne1.add(panelLigne13);
                
        panelBouton.setLayout(new GridLayout(3,1));
        panelBouton.add(panelLigne1);
        panelBouton.add(panelLigne2);
        panelBouton.add(panelLigne3);
        
        
        panelGeneral.setLayout(new GridLayout(2,2));
        panelGeneral.add(affichage);
        panelGeneral.add(panelCode);
        panelGeneral.add(panelBouton);
        panelGeneral.add(panelModele);
        
        
     //   setJMenuBar(menu);
        this.setVisible(true);
        this.add(panelGeneral);
        this.setSize(1500,800);
       // this.setResizable(true);
        
    }
    public static void main(String[] args){
        FaireExercice FE= new FaireExercice();
    }
    
}
