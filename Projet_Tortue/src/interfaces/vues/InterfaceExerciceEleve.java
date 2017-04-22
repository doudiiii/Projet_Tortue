
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces.vues;
import javax.swing.*;

public class InterfaceExerciceEleve extends JFrame{
    
    PanelLabelBouton panelFaire; 
    PanelLabelBouton panelRefaire;
    PanelLabelBouton panelVisuE; 
    JPanel panelBouton;
    JPanel panelGeneral;
    private JMenuBar menu = new JMenuBar();
    private JMenu retour = new JMenu("Retour");
    private JMenu deconnexion = new JMenu("Deconnexion");
    
    public InterfaceExerciceEleve()
    {
        
        panelBouton = new JPanel();
        panelGeneral = new JPanel();
        //test
        this.panelFaire =  new PanelLabelBouton (new ImageIcon(".\\doudi\\Desktop\\doE.png"), new JLabel ("Faire un Exercice"));
        this.panelRefaire =  new PanelLabelBouton (new ImageIcon(".\\doudi\\Desktop\\redoE.png"), new JLabel ("Refaire un Exercice")); 
        this.panelVisuE =  new PanelLabelBouton (new ImageIcon(".\\doudi\\Desktop\\visuE.png"), new JLabel ("Visualisation"));
        
        //panelBouton.setLayout(new GridLayout(3,1));
        panelBouton.add(panelFaire); //,BorderLayout.NORTH
        panelBouton.add(panelRefaire);//,BorderLayout.CENTER
        panelBouton.add(panelVisuE);//,BorderLayout.SOUTH
        
        //panelGeneral.add(panelBouton,BorderLayout.NORTH);
        //panelGeneral.add(panelEval,BorderLayout.SOUTH);
        menu.add(retour);
        menu.add(deconnexion);
        setJMenuBar(menu);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Menu Exercice Eleve");
        this.setSize(500,200);
        this.setVisible(true);
        this.add(panelBouton);
        this.setResizable(true); // A garder pour le menu, permet d'adapter la taille de la fenetre a son contenu
    }
    
    public static void main(String[] args)
    {
        InterfaceExerciceEleve iEE= new InterfaceExerciceEleve();
    }
}
