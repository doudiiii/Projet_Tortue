/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vue;
import java.awt.*;
import javax.swing.*;
/**
 * test
 * @author Jennifer
 * Test push Jennifer 
 */
public class PanelLabelBouton extends JPanel
{
   ImageIcon imageBouton; 
   JButton bouton;
   JLabel labelBouton; 
   
   public PanelLabelBouton (ImageIcon image, JLabel label)
   {
       super();
       this.labelBouton = label; 
       labelBouton.setHorizontalAlignment(JLabel.CENTER);
       labelBouton.setVerticalAlignment(JLabel.NORTH);
       this.imageBouton = image; 
       this.bouton = new JButton (imageBouton); 
       this.setLayout(new GridLayout(2,1));
       this.add(bouton);
       this.add(labelBouton);
       //this.add(bouton, BorderLayout.NORTH);
       //this.add(labelBouton, BorderLayout.SOUTH);
       
   }
}