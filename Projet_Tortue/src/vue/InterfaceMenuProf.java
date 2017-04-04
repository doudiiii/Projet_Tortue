/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vue;
import java.awt.*;
import javax.swing.*;

public class InterfaceMenuProf extends JFrame {
    
    JLabel labelIdentification;
    PanelLabelBouton panelCrea; 
    PanelLabelBouton panelEval;
    PanelLabelBouton panelVisu; 
    JPanel panelBouton;
    JPanel panelGeneral;
    private JMenuBar menu = new JMenuBar();
    private JMenu deconnexion = new JMenu("Deconnexion");
    
    public InterfaceMenuProf()
    {
        
        panelBouton = new JPanel();
        panelGeneral = new JPanel();
        //test
        this.panelCrea =  new PanelLabelBouton (new ImageIcon(".\\ressources\\Image\\creation.png"), new JLabel ("Creation"));
        this.panelEval =  new PanelLabelBouton (new ImageIcon(".\\ressources\\Image\\Check.png"), new JLabel ("Evaluation")); 
        this.panelVisu =  new PanelLabelBouton (new ImageIcon(".\\ressources\\Image\\Visu.png"), new JLabel ("Visualisation"));
        
        //panelBouton.setLayout(new GridLayout(3,1));
        panelBouton.add(panelCrea); //,BorderLayout.NORTH
        panelBouton.add(panelVisu);//,BorderLayout.CENTER
        panelBouton.add(panelEval);//,BorderLayout.SOUTH
        
        //panelGeneral.add(panelBouton,BorderLayout.NORTH);
        //panelGeneral.add(panelEval,BorderLayout.SOUTH);
        menu.add(deconnexion);
        setJMenuBar(menu);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Test");
        this.setSize(500,200);
        this.setVisible(true);
        this.add(panelBouton);
        this.setResizable(true); // A garder pour le menu, permet d'adapter la taille de la fenetre a son contenu
    }
    
    public static void main(String[] args){
        InterfaceMenuProf co= new InterfaceMenuProf();
    }
    
    
    
}
