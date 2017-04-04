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
 * @author SERAZIN
 */
public class InterfaceMenuEleve extends JFrame{
    
    private JMenuBar menu = new JMenuBar();
    private JMenu deconnexion = new JMenu("Deconnexion");
    private JMenu retour = new JMenu("Retour");
    private PanelLabelBouton img1 = new PanelLabelBouton(new ImageIcon(".\\ressources\\Image\\exercice.png"), new JLabel ("Exercices"));
    private PanelLabelBouton img2 = new PanelLabelBouton(new ImageIcon(".\\ressources\\Image\\resultat.png"), new JLabel ("Résultat"));

public InterfaceMenuEleve()
        {
            this.setTitle("Menu Eleves");
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.add(img1, BorderLayout.WEST);
            this.add(img2, BorderLayout.EAST);
            
            menu.add(deconnexion);
            menu.add(retour);
            setJMenuBar(menu);
            this.setSize(300, 100);
            this.pack();
            this.setVisible(true);
        }
public static void main(String[] args){
        InterfaceMenuEleve co= new InterfaceMenuEleve();
    }
}