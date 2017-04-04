/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import controler.TreeListener;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeCellRenderer;
import javax.swing.tree.TreeSelectionModel;

/**
 *
 * @author Marine
 */
public class Tree extends JPanel 
{   
    private DefaultMutableTreeNode root = new DefaultMutableTreeNode("Classes");
    private JTree tree;
    private ArrayList<Classe> Classes;
    private TreeListener treeListen;
    
    public Tree(ArrayList<Classe> Classes, Table Table){

        this.Classes =Classes;
        //create the tree by passing in the root node
       
        for (Classe classe : this.Classes){
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

        this.add(tree);
    }
   
    public JTree getTree(){
        return this.tree;
    }
    
}
