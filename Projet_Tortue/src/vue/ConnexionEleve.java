/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.///
 */
package vue;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author SERAZIN
 */
public class ConnexionEleve extends JFrame{
    
    private JMenuBar menu = new JMenuBar();
    private JMenu retour = new JMenu("Retour");
    private PanelLabelBouton img1 = new PanelLabelBouton(new ImageIcon(".\\ressources\\Image\\doriane.png"), new JLabel ("Tete de gouda"));
    private PanelLabelBouton img2 = new PanelLabelBouton(new ImageIcon(".\\ressources\\Image\\jennifer.png"), new JLabel ("Tete de noeud"));
    private PanelLabelBouton img3 = new PanelLabelBouton(new ImageIcon(".\\ressources\\Image\\marine.png"), new JLabel ("Narine en haut de la Vallée"));
    private PanelLabelBouton img4 = new PanelLabelBouton(new ImageIcon(".\\ressources\\Image\\armand.png"), new JLabel ("Tête de gland"));
    private JPanel panelGp = new JPanel();
    private JPanel panelT = new JPanel();
    private JPanel panelG = new JPanel();
    
    private JLabel titre = new JLabel("Choisis ta photographie pour te connecter : ");
    
    public ConnexionEleve(){
        Font police = new Font("Tahoma", Font.BOLD, 22);
        titre.setFont(police);
        this.setTitle("Connexion élèves");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        menu.add(retour);
        setJMenuBar(menu);
        
        panelGp.setLayout(new GridLayout(1,4));
        panelGp.add(img1);
        panelGp.add(img2);
        panelGp.add(img3);
        panelGp.add(img4);
        
        this.add(titre, BorderLayout.NORTH);
        this.add(panelGp, BorderLayout.SOUTH);
        this.setSize(300, 100);
        this.pack();
        this.setVisible(true);
    }
    public static void main(String[] args){
        ConnexionEleve co= new ConnexionEleve();
    }
    
}
