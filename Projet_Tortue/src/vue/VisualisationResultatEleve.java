/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vue;
import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeCellRenderer;
import modele.*;

/**
 *
 * @author Groupe3
 */
public class VisualisationResultatEleve extends JFrame{
    
    private JMenuBar menu = new JMenuBar();
    private JMenu deconnexion = new JMenu("Deconnexion");
    private JMenu retour = new JMenu("Retour");
    
    private JPanel panelGeneral = new JPanel(new GridLayout(1,2));
    private JPanel panelAffichage = new JPanel (new GridLayout(3,1));
    private JPanel panelNom = new JPanel (new GridLayout(1,2));
    private JPanel panelPrenom = new JPanel (new GridLayout(1,2));
    
    private JLabel labelNom;
    private JLabel labelPrenom ;
    private JLabel labelNomTree;
    private JLabel labelPrenomTree;
    
    private Table tableResultat;
    
    private Tree tree;
    private DefaultMutableTreeNode root = new DefaultMutableTreeNode("Classes");
    
    private ArrayList<Classe> classes;
    ImageIcon photo1 = new ImageIcon(".\\ressources\\Image\\Adele.jpg");
    ImageIcon photo2 = new ImageIcon(".\\ressources\\Image\\Adele.jpg");
    
    
    //creation Classes
    Classe cp = new Classe (1, "CP", "Annie Geniet", 2); 
    Classe ce1 = new Classe (2, "CE1", "Dominique Geniet", 2); 
    Classe ce2 = new Classe (3, "CE2", "Alan Fousse", 2); 
    Classe cm1 = new Classe (4, "CM1", "Patrck Girard",2); 
    Classe cm2 = new Classe (5, "CM2", "Gaelle Skapin",2); 
     //creation Eleves 
    Eleve eleve1 = new Eleve("Pehau", "Jennifer", 9,true,photo1,cp);
    Eleve eleve2 = new Eleve("Devienne", "Armand", 9,true,photo2,cp);        
    Eleve eleve3 = new Eleve("Vallée", "Marine",  6,true,photo1,cp);        
    Eleve eleve4 = new Eleve("Fonchais", "Pierre", 5,true,photo1,ce1);
    Eleve eleve5 = new Eleve("Pouvreau", "Chloé", 9,true,photo1,ce1);        
    Eleve eleve6 = new Eleve("Suc", "Doriane", 7,true,photo1,ce2); 
    Eleve eleve7 = new Eleve("Serazin", "Marion", 6,true,photo1,ce2);
    Eleve eleve8 = new Eleve("Saaspanithy", "Babujhi", 9,true,photo1,cm1);        
    Eleve eleve9 = new Eleve("Guillard", "Jonathan", 6,true,photo1,cm2);
    Eleve eleve10 = new Eleve("Zouaoui", "Cyprien",8,true,photo1,cm2);
    
    public VisualisationResultatEleve (){//ArrayList<Classe> classes
       
        
        cp.addEleve(eleve1);
        cp.addEleve(eleve2);
        cp.addEleve(eleve3);
        ce1.addEleve(eleve4);
        ce1.addEleve(eleve5);
        ce2.addEleve(eleve6);
        ce2.addEleve(eleve7);
        cm1.addEleve(eleve8);
        cm2.addEleve(eleve9);
        cm2.addEleve(eleve10);
        
        
        
        classes= new ArrayList<Classe>();
        classes.add(cp);
        classes.add(ce1);
        classes.add(ce2);
        classes.add(cm1);
        classes.add(cm2);
        
        //Creation du Menu
        this.menu.add(deconnexion);
        this.menu.add(retour);
               
        //this.classes= classes;
        
//        // Creation de l'arbre avec les eleves
//        for (Classe classe : classes){
//            DefaultMutableTreeNode classeNode = new DefaultMutableTreeNode(classe);
//            for (Eleve eleve : classe.getListEleve()){
//                    DefaultMutableTreeNode eleveNode = new DefaultMutableTreeNode(eleve);
//                    classeNode.add(eleveNode);
//                    }
//            root.add(classeNode);
//        }
        
        

        labelNom= new JLabel ("Nom : ");
        panelNom.add(labelNom);
        labelNomTree= new JLabel ("A REMPLIR");
        panelNom.add(labelNomTree);
        
        labelPrenom = new JLabel ("Prenom : ");
        panelPrenom.add(labelPrenom);
        //panelPrenom.add(labelPrenomTree);
        
        panelAffichage.add(panelNom);
        panelAffichage.add(panelPrenom);
        tableResultat = new Table();
        panelAffichage.add(tableResultat);
        
        tree= new Tree(classes,tableResultat);
        panelGeneral.add(tree);
        panelGeneral.add(panelAffichage);
        this.add(panelGeneral);
        this.setTitle("Visualisation des résultats");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
        
    }
public static void main(String[] args){
    //Visualisation myFrame = new JFrame();
    //classes = new ArrayList<Classe>();
    VisualisationResultatEleve co= new VisualisationResultatEleve();//classes
}  
}
