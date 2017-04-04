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
 * @author Jennifer
 */
public class Connexion extends JFrame
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
        this.labelIdentification = new JLabel("Veuillez vous identifier :");
        labelIdentification.setHorizontalAlignment(JLabel.CENTER);
        this.panelProf =  new PanelLabelBouton (new ImageIcon("/Users/Jennifer/Desktop/imagesprojet/t2.png"), new JLabel ("Professeur"));
        this.panelEleve =  new PanelLabelBouton (new ImageIcon("/Users/Jennifer/Desktop/imagesprojet/p2.png"), new JLabel ("Eleve")); 
        
        //panelBouton.setLayout(new GridLayout(1,2));
        panelBouton.add(panelProf,BorderLayout.WEST); 
        panelBouton.add(panelEleve,BorderLayout.EAST);
        
        //panelGeneral.setLayout(new GridLayout(2,1));
        panelGeneral.add(labelIdentification,BorderLayout.NORTH);
        panelGeneral.add(panelBouton,BorderLayout.SOUTH);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Test");
        this.setSize(400, 200);
        this.setVisible(true);
        this.add(panelGeneral);
    }
    
    public static void main(String[] args){
        Connexion co= new Connexion();
    }
}