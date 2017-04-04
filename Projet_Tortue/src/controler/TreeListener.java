package Controler;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.tree.DefaultMutableTreeNode;
import Modele.*;
import View.*;

/**
 *This class allows interacting
 * @author Marine VALLEE
 */
public class TreeListener  {
    private Tree treePan;
    private Table Table;
    public TreeListener(Tree treePan, Table Table){
        this.Table=Table;
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
            Eleve ele = (Eleve) myNode.getUserObject();
            this.Table.setData(ele.getClasse());
        }else if (myNode.getUserObject() instanceof Classe){
            Classe classe =(Classe) myNode.getUserObject();
            this.Table.setData(classe);
        }
    } 

    
}

}
