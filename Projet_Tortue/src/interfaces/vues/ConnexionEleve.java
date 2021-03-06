/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.///
 */
package interfaces.vues;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author SERAZIN
 */
public class ConnexionEleve extends JPanel{
    
    private JMenuBar menu = new JMenuBar();
    private JMenu retour = new JMenu("Retour");
    private PanelLabelBouton img1 = new PanelLabelBouton(new ImageIcon("./pictures/doriane.png"), new JLabel ("Doriane Suc"));
    private PanelLabelBouton img2 = new PanelLabelBouton(new ImageIcon("./pictures/jennifer.png"), new JLabel ("Jennifer Pehau"));
    private PanelLabelBouton img3 = new PanelLabelBouton(new ImageIcon("./pictures/marine.png"), new JLabel ("Marine Vallée"));
    private PanelLabelBouton img4 = new PanelLabelBouton(new ImageIcon("./pictures/armand.png"), new JLabel ("Armand Devienne"));
    private JPanel panelGp = new JPanel();
    private JPanel panelT = new JPanel();
    private JPanel panelG = new JPanel();
    
    private JLabel titre = new JLabel("Choisis ta photographie pour te connecter : ");
    
    public ConnexionEleve(){

        Font police = new Font("Tahoma", Font.BOLD, 22);
        titre.setFont(police);
        
        menu.add(retour);
        

        panelGp.setLayout(new GridLayout(1,4));
        panelGp.add(img1);
        panelGp.add(img2);
        panelGp.add(img3);
        panelGp.add(img4);
        
        this.add(titre, BorderLayout.NORTH);
        this.add(panelGp, BorderLayout.SOUTH);
        //this.setSize(300, 100);
        //this.pack();
        this.setVisible(true);
    }
    
    
}
