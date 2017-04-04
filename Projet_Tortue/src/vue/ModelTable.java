/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vue;
import modele.*;
import javax.swing.table.AbstractTableModel;
import modele.Eleve;

class MyModel extends AbstractTableModel{
        private final String[] columnName= {"Nom","Statut","Nombre de tentatives","Lien"};
        private Classe classe;
        public MyModel(Classe classe){
            this.classe=classe;
        }
        public int getColumnCount(){
            return 4;
        }
        public int getRowCount(){
           return classe.getListEleve().size();
        }
        public String getColumnName(int i){
            switch(i){
                case 0: return columnName[0];
                case 1: return columnName[1];
                case 2: return columnName[2];
                case 3: return columnName[3];
                case 4: return columnName[4];
                default: return "";
            }
        }
        public Object getValueAt(int rowIndex, int columnIndex){
            switch(columnIndex){
                case 0: return (classe.getListEleve().get(rowIndex).getNomE());
                case 1: return (classe.getListEleve().get(rowIndex).getPrenomE());
                case 2: return (classe.getListEleve().get(rowIndex).getPrenomE());
                case 3: return (classe.getListEleve().get(rowIndex).getPrenomE());
                case 4: return (classe.getListEleve().get(rowIndex).getPrenomE());
                default: return "";}
        }
        public void setData(Classe classe){
            this.classe = classe;
            this.fireTableDataChanged();
        }
        
        

    }