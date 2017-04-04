package vue;

import modele.*;
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
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author SERAZIN
 */
public class Tables extends JScrollPane{
    private JTable table;
    private MyModel modele;
    public Tables(Classe cl){
        modele = new MyModel(cl);
        table = new JTable(modele);
        this.add(table);
        this.setViewportView(table);
    }
    public void setData(Classe cl){
        modele.setData(cl);
    }
    
    
    
    
    
}
