/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces.vues;
import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.event.ActionEvent;
/**
 *
 * @author Jennifer
 */
public class Connexion extends JPanel
{
    
    JLabel labelIdentification;
    PanelLabelBouton panelEleve; 
    PanelLabelBouton panelProf; 
    JPanel panelBouton;
    JPanel panelGeneral; 
    
    public Connexion ()
    {
        panelBouton = new JPanel();
        panelGeneral = new JPanel();
        //test
        this.labelIdentification = new JLabel("Veuillez vous identifier :");
        labelIdentification.setHorizontalAlignment(JLabel.CENTER);
        this.panelProf =  new PanelLabelBouton (new ImageIcon ("./pictures/t2.png"), new JLabel ("Professeur"));
        this.panelEleve =  new PanelLabelBouton (new ImageIcon("./pictures/p2.png"), new JLabel ("Eleve")); 
        
        //panelBouton.setLayout(new GridLayout(1,2));
        panelBouton.add(panelProf,BorderLayout.WEST); 
        panelBouton.add(panelEleve,BorderLayout.EAST);
        
        //panelGeneral.setLayout(new GridLayout(2,1));
        panelGeneral.add(labelIdentification,BorderLayout.NORTH);
        panelGeneral.add(panelBouton,BorderLayout.SOUTH);
        
        
        // Actions sur les panels des boutons 
        
        this.setSize(400, 250);
        this.setVisible(true);
        this.add(panelGeneral);
        
        
        
        
        //this.setResizable(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource()==panelProf)
        {
            new ConnexionProf();
        }
         if (e.getSource()==panelEleve)
        {
            new ConnexionEleve();
        }
    }
    
    public static void main(String[] args){
        Connexion co= new Connexion();
    }
    
    

}