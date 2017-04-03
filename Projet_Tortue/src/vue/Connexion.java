/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vue;
import java.awt.BorderLayout;
import javax.swing.*;
/**
 *
 * @author Jennifer
 */
public class Connexion extends JPanel
{
    
    JLabel labelIdentification;
    PanelLabelBouton panelEleve; 
    PanelLabelBouton panelProf; 
    JPanel panelGeneral; 
    
    public Connexion ()
    {
        this.labelIdentification = new JLabel("Veuillez vous identifier :");
        this.panelProf =  new PanelLabelBouton (new ImageIcon("/Users/Jennifer/Desktop/professor.png"), new JLabel ("Professeur"));
        this.panelEleve =  new PanelLabelBouton (new ImageIcon("/Users/Jennifer/Desktop/graduate-boy.png"), new JLabel ("Eleve")); 
        panelGeneral.add(panelProf,BorderLayout.WEST); 
        panelGeneral.add(panelEleve,BorderLayout.EAST);
        
        
    }

    
    
}