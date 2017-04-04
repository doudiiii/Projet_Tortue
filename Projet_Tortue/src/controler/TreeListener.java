/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import javax.swing.*;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.tree.DefaultMutableTreeNode;
import modele.*;
import sun.reflect.generics.tree.Tree;
import vue.*;

/**
 *
 * @author SERAZIN
 */
public class TreeListener  {
    private Tree treePan;
    private Table maTable;
    public TreeListener(Tree treePan, Table maTable){
        this.maTable=maTable;
        this.treePan=treePan;
        
        this.treePan.getTree().addTreeSelectionListener(
            e-> {
                valueChanged(e);
                updateInfo(e);
            });
        
        
    }
        
    public void valueChanged(TreeSelectionEvent e) {
        DefaultMutableTreeNode myNode = (DefaultMutableTreeNode)treePan.getTree().getLastSelectedPathComponent();
        if (myNode.getUserObject() instanceof Eleve) {
            Eleve e1 = (Eleve) myNode.getUserObject();
            //this.maTable.setData(e1.getNomE());
        }
    } 
    
    public void updateInfo(TreeSelectionEvent e){
        
    }
    
}
