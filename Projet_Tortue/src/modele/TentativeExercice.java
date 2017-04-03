package modele;
import java.util.ArrayList;
/**
 * Tentative exercice est une classe qui permet a un eleve de faire une tentative d'exercice,
 * qui sera corrige et evalue par le professeur
 *
 * @author Groupe 3
 * @author Armand Devienne - Jennifer Pehau - Marion Serazin - Doriane Suc - Marine Vallee
 * 
 * @version Mars 2017
 */
public class TentativeExercice
{
	private int numeroTentative;
	private ArrayList<Action> suiteAction = new ArrayList<Action>();
	private boolean aCorriger;
	private boolean corrige;
	private String evaluation;
	private String commentaire;
        private int cptTable;
        private boolean undoAble, redoAble;
	
	/**
	 * Constructeur
	 * 
	 */
    public TentativeExercice(){
    	this.numeroTentative = 0;
    	this.aCorriger = false;
    	this.corrige = true;
    	this.evaluation = "";
    	this.commentaire = "";
        this.cptTable=0;
        this.undoAble=false;
        this.redoAble=false;
    	
    	
    } 
    
    /**
	 * obtenir l'evaluation pour l'exercice
	 * 
	 */
	public String getEvaluation(){
	    	return(this.evaluation);
	    }
	
	/**
	 * Donner un evalutation pour la tentative
	 * 
	 */
	public void setEvaluation(String e){
    	this.evaluation = e;
    }
    
	/**
	 * obtenir les commentaires de la tentative
	 * 
	 */
	public String getCommentaire(){
    	return(this.commentaire);
    }
	
	/**
	 * saisir les commentaires de la tentative
	 * 
	 */
	public void setCommentaire(String c){
		this.commentaire = c;
	}
	
	/**
	 * savoir si la tentative est a corriger
	 * dans le cas ou la tentative a ete realise n'a pas ete encore corrige
	 * 
	 */
	public boolean getACorriger(){
		return(this.aCorriger);
	}
	
	
	/**
	 * permet de changer le booleen
	 * TRUE : dans le cas ou la tentative est a corriger
	 * FALSE: dans le cas ou l'exercice n'a pas ete realise ou a ete corrige
	 */
	public void setACorriger(boolean ac){
		this.aCorriger = ac;
	}
	
	/**
	 * permet de changer le booleen corrige
	 * TRUE : dans le cas ou l'exercice vient d'etre corrige
	 * FALSE: dans le cas ou l'exercice n'a pas ete corrige ou qu'il est a corriger
	 */
	public void setCorrige(boolean c){
		this.corrige = c;
	}
	
	/**
	 * permet de d'obtenir le boolean
	 * TRUE : dans le cas ou l'exercice vient d'etre corrige
	 * FALSE: dans le cas ou l'exercice n'a pas ete corrige ou qu'il est a corriger
	 */
	public boolean getCorrige(){
		return(this.corrige);
	}
	
        public int getNbAction(){
            return cptTable;
        }
        
        public int calculeNbaction(ArrayList<Action> suiteActions, int cpaction){
            for (int i = 0; i<suiteActions.size(); i++)
            {
                cpaction+=1;
            }
            return cpaction;

        }
        
        public void undo ()
        {
            cptTable-=1;
        }
        
        
        public boolean redodispo()
        {
            if (cptTable< suiteAction.size())
            {
                this.redoAble= true;
            }
            return redoAble;
        }
        
        public boolean undoDispo()
        { 
            if (cptTable >0)
            {
                this.undoAble= true;
            }
            return undoAble;
        }
        
               
        public void redo(ArrayList<Action> suiteActions)
        {
            
            if (cptTable<suiteActions.size())
            {
                cptTable+=1;
            }
        }
        public void addAction (ArrayList<Action> suiteActions, int cp, ){
            
            if (cptTable < nb d'elt ds ma table'){
            supprimme leselt qui sont apres cpttable
        }
            ajoute l'action'
            cpt++
                   
        }
        
	
	/**
	 * permet de visualiser une tentative
	 * 
	 */
	public void visualiserTentative(){
		
	}
}