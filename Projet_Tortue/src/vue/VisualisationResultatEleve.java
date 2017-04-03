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
public class VisualisationResultatEleve extends JFrame {
    
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

    
    public VisualisationResultatEleve (ArrayList<Classe> classes){
     
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
        
  
    }
    

    public static void main(String[] args, ArrayList<Classe> classes){
        VisualisationResultatEleve co= new VisualisationResultatEleve(classes);
    }
}
