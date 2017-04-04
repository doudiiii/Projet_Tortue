/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vue;
import javax.swing.*;


public class FaireExercice extends JFrame {
    
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
    
    //PANEL LABEL BOUTON
    PanelLabelBouton undo = new PanelLabelBouton(new ImageIcon(".\\ressources\\Image\\undo.png"), new JLabel ("Undo"));
    PanelLabelBouton redo = new PanelLabelBouton(new ImageIcon(".\\ressources\\Image\\redo.png"), new JLabel ("Redo"));
    PanelLabelBouton zoom = new PanelLabelBouton(new ImageIcon(".\\ressources\\Image\\zoom.png"), new JLabel ("Zoom"));
    PanelLabelBouton bleu = new PanelLabelBouton(new ImageIcon(".\\ressources\\Image\\bleu.png"), new JLabel ("Bleu"));
    PanelLabelBouton rouge = new PanelLabelBouton(new ImageIcon(".\\ressources\\Image\\rouge.png"), new JLabel ("Rouge"));
    PanelLabelBouton vert = new PanelLabelBouton(new ImageIcon(".\\ressources\\Image\\vert.png"), new JLabel ("Vert"));
    PanelLabelBouton rose = new PanelLabelBouton(new ImageIcon(".\\ressources\\Image\\rose.png"), new JLabel ("Rose"));
    PanelLabelBouton jaune = new PanelLabelBouton(new ImageIcon(".\\ressources\\Image\\jaune.png"), new JLabel ("Jaune"));
    PanelLabelBouton noir = new PanelLabelBouton(new ImageIcon(".\\ressources\\Image\\noir.png"), new JLabel ("Noir"));
    PanelLabelBouton dessiner = new PanelLabelBouton(new ImageIcon(".\\ressources\\Image\\dessiner.png"), new JLabel ("Dessiner"));
    PanelLabelBouton pasDessiner = new PanelLabelBouton(new ImageIcon(".\\ressources\\Image\\nepasdessiner.png"), new JLabel ("Ne pas dessiner"));
    PanelLabelBouton avancer = new PanelLabelBouton(new ImageIcon(".\\ressources\\Image\\avancer.png"), new JLabel ("Avancer"));
    PanelLabelBouton tourner = new PanelLabelBouton(new ImageIcon(".\\ressources\\Image\\tourner.png"), new JLabel ("Tourner"));
    
    // BOUTONS
    JButton haut = new JButton("+");
    JButton bas = new JButton("-");
    
    //LABEL
    JLabel nbCase = new JLabel("Nombre de case");
    JLabel nbCaseAffiche = new JLabel();
    
    public FaireExercice(){
        
        this.setTitle("Menu Eleves");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
    
}
