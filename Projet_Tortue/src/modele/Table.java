

import modele.*;
import javax.swing.*;


/**
 * 
 * @author Groupe 3
 */
public class Table extends JScrollPane{
    private JTable table;

    public Table(){

        table = new JTable();
        this.add(table);
        this.setViewportView(table);
    }  
    
    
    
    
}
