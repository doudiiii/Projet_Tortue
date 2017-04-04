/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vue;

/**
 *
 * @author Jennifer
 */
public class testConnexion 
{
    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vue;
import java.awt.*;
import java.net.URL;
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
        //test
        this.labelIdentification = new JLabel("Veuillez vous identifier :");
        labelIdentification.setHorizontalAlignment(JLabel.CENTER);
         //ImageIcon imageProf = new ImageIcon (Connexion.class.getResource("src/ressources/p2.png"));
        ///Users/Jennifer/Documents/COURS/M1/2EME SEMESTRE/IHM/Projet_Tortue/Projet_Tortue/Projet_Tortue
        ///Users/Jennifer/Documents/COURS /M1/2EME SEMESTRE/IHM/Projet_Tortue/Projet_Tortue/Projet_Tortue/src
        //ImageIcon icon = new ImageIcon(imageProf);
        
        
        //URL urlimage = VueConnexion.class.getResource(
              //  "/ressources/children.png");
		//this.eleveChoix = new JButton(new ImageIcon(urlimage));
		//urlimage = VueConnexion.class.getResource(
                // "/ressources/teacher.png");
        
        this.panelProf =  new PanelLabelBouton (imageProf, new JLabel ("Professeur"));
        this.panelEleve =  new PanelLabelBouton (new ImageIcon ("src/ressources/t2.png"), new JLabel ("Eleve")); 
        
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
    
}
