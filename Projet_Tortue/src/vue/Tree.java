package vue;

import controler.TreeListener;
import modele.Eleve;
import modele.Classe;
import javax.swing.*;
import javax.swing.event.TreeSelectionListener;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeCellRenderer;
import javax.swing.tree.TreeSelectionModel;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.*;
import java.util.ArrayList;

 
public class Tree extends JPanel 
{   
    private DefaultMutableTreeNode root = new DefaultMutableTreeNode("Classes");
    private JTree tree;
    private ArrayList<Classe> mesClasses;
    private TreeListener treeListen;
    
    public Tree(ArrayList<Classe> mesClasses, Table maTable){

        this.mesClasses =mesClasses;
        //create the tree by passing in the root node
       
        for (Classe cl : this.mesClasses){
            DefaultMutableTreeNode cNode = new DefaultMutableTreeNode(cl);
            for (Eleve el : cl.getListEleve()){
                    DefaultMutableTreeNode eNode = new DefaultMutableTreeNode(el);
                    cNode.add(eNode);
                    }
            root.add(cNode);
        }
        tree = new JTree(root);
        tree.getSelectionModel().setSelectionMode(
                TreeSelectionModel.SINGLE_TREE_SELECTION);
        treeListen = new TreeListener((sun.reflect.generics.tree.Tree) this, maTable);
  
        tree.setCellRenderer(new TreeCellRenderer(){
            @Override
            public Component getTreeCellRendererComponent(JTree tree, Object value, boolean selected, boolean expanded, boolean leaf, int row, boolean hasFocus) {
                JLabel mylabel = new JLabel();
                if (value instanceof DefaultMutableTreeNode) {
                    DefaultMutableTreeNode myNode = (DefaultMutableTreeNode) value;
                    //ImageIcon executantImage = null;
                    if (myNode.getUserObject() instanceof Eleve) {
                        Eleve e = (Eleve) myNode.getUserObject();
                        mylabel = new JLabel(e.getPrenomE());
                  
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