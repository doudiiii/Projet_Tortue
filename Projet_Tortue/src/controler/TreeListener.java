/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import javax.swing.*;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;

import javafx.scene.control.Tab;
import modele.*;
import vue.*;

/**
 * Created by moi on 24/03/2017.
 */
public class TreeListener implements TreeSelectionListener{

    private AppTree treePan;
    private AppTable maTable;
    private Object ActionEvent;

    public TreeListener(AppTree treePan, AppTable maTable){
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
            this.maTable.setData(e1.getClasse());
        }else if (myNode.getUserObject() instanceof Classe){
            Classe c1 =(Classe) myNode.getUserObject();
            this.maTable.setData(c1);
        }
    } 
    
    public void updateInfo(TreeSelectionEvent e){
        DefaultMutableTreeNode myNode = (DefaultMutableTreeNode)treePan.getTree().getLastSelectedPathComponent();
        if (myNode.getUserObject() instanceof Eleve){
            Eleve e1 = (Eleve) myNode.getUserObject();
            this.maTable.setDefaultRenderer(new TableComponent());
        }
    }
    
}
