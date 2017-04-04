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
    
    private JLabel labelNom = new JLabel ("Nom : ");
    private JLabel labelPrenom = new JLabel ("Prenom : ");
    private JLabel labelNomTree;
    private JLabel labelPrenomTree;
    
    private JTable tableResultat = new JTable ();
    
    private JTree tree = new JTree();
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
   
    

        
//            mesClasses = new ArrayList<Classe>();
//            mesClasses.add(cp);
//            mesClasses.add(ce1);
//            mesClasses.add(ce2);
//            mesClasses.add(cm1);
//            mesClasses.add(cm2);

    
    public VisualisationResultatEleve (){//ArrayList<Classe> classes
       
      
        classes.add(cp);
        classes.add(ce1);
        classes.add(ce2);
        classes.add(cm1);
        classes.add(cm2);
        
        //Creation du Menu
        this.menu.add(deconnexion);
        this.menu.add(retour);
        
        
        this.classes= classes;
        
        // Creation de l'arbre avec les eleves
        for (Classe classe : this.classes){
            DefaultMutableTreeNode classeNode = new DefaultMutableTreeNode(classe);
            for (Eleve eleve : classe.getListEleve()){
                    DefaultMutableTreeNode eleveNode = new DefaultMutableTreeNode(eleve);
                    classeNode.add(eleveNode);
                    }
            root.add(classeNode);
        }
        tree = new JTree(root);
        tree.setCellRenderer(new TreeCellRenderer(){
            @Override
            public Component getTreeCellRendererComponent(JTree tree, Object value, boolean selected, boolean expanded, boolean leaf, int row, boolean hasFocus) {
                JLabel mylabel = new JLabel();
                if (value instanceof DefaultMutableTreeNode) {
                    DefaultMutableTreeNode myNode = (DefaultMutableTreeNode) value;
                    if (myNode.getUserObject() instanceof Eleve) {
                        Eleve ele = (Eleve) myNode.getUserObject();
                        mylabel = new JLabel(ele.getPrenom()+ " "+ ele.getNom());
                    }else if (myNode.getUserObject() instanceof Classe){
                        Classe cl =(Classe) myNode.getUserObject();
                        mylabel = new JLabel(cl.getClasse());
                    }
                }
            
                //Creation des panel 
                return(mylabel);               
            }
          });
//        @Override
//        public void valueChanged(TreeSelectionEvent e) {
//            DefaultMutableTreeNode myNode = (DefaultMutableTreeNode)tree.getLastSelectedPathComponent();
//            if (myNode.getUserObject() instanceof Eleve) {
//                Eleve ele = (Eleve) myNode.getUserObject();
//                labelPrenomTree = new JLabel (ele.getPrenom());
//                labelNomTree = new JLabel (ele.getNom());            
//                }
//            }

        
        panelNom.add(labelNom);
        panelNom.add(labelNomTree);
        
        panelPrenom.add(labelPrenom);
        panelPrenom.add(labelPrenomTree);
        
        panelGeneral.add(tree);
        panelGeneral.add(panelAffichage);
        this.add(panelGeneral);
        this.setTitle("Visualisation des résultats");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
        
  
    }
public void main(String[] args){
    //Visualisation myFrame = new JFrame();
    //classes = new ArrayList<Classe>();
    VisualisationResultatEleve co= new VisualisationResultatEleve();//classes
}  
}

