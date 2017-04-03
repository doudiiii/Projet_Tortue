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
public class PanelLabelBouton extends JPanel
{
   ImageIcon imageBouton; 
   JButton bouton;
   JLabel labelBouton; 
   
   public PanelLabelBouton (ImageIcon image, JLabel label)
   {
       super();
       this.labelBouton = label; 
       this.imageBouton = image; 
       this.bouton = new JButton (imageBouton); 
       
       
       this.add(bouton, BorderLayout.NORTH);
       this.add(labelBouton, BorderLayout.SOUTH);
       
   }
}