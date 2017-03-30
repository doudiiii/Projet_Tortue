package modele;

/**
 * Tentative exercice est une classe qui permet � un �l�ve de faire une tentative d'exercice,
 * qui sera corrig� et �valu� par le professeur
 *
 * @author Groupe 3
 * @author Armand Devienne - Jennifer Pehau - Marion S�razin - Doriane Suc - Marine Vall�e
 * 
 * @version Mars 2017
 */
public class TentativeExercice
{
	private int numeroTentative;
	private ArrayList<Action> suiteAction;
	private boolean aCorriger;
	private boolean corrige;
	private String evaluation;
	private String commentaire;
	
	/**
	 * Constructeur
	 * 
	 */
    public TentativeExercice{
    	
    }
    
    /**
	 * reinitialiser la tentative
	 * 
	 */
    private void reset{
    	
    }
    
    /**
	 * obtenir l'evaluation pour l'exercice
	 * 
	 */
	private String getEvaluation(){
	    	return(this.evaluation)
	    }
	
	/**
	 * Donner un �valutation pour la tentative
	 * 
	 */
	private String setEvaluation(String e){
    	this.evaluation = e;
    }
    
	/**
	 * obtenir les commentaires de la tentative
	 * 
	 */
	private String getCommentaire(){
    	return(this.commentaire);
    }
	
	/**
	 * saisir les commentaires de la tentative
	 * 
	 */
	private String setCommentaire(String c){
		this.commentaire = c;
	}
	
	/**
	 * savoir si la tentative est a corriger
	 * dans le cas o� la tentative a �t� r�alis� mais pas encore corrig�
	 * 
	 */
	private boolean getACorriger(){
		return(this.aCorriger);
	}
	
	
	/**
	 * permet de changer le booleen
	 * TRUE : dans le cas ou la tentative est � corriger
	 * FALSE: dans le cas ou l'exercice n'a pas �t� realis� ou a �t� corrig�
	 */
	private boolean setACorriger(boolean ac){
		this.aCorriger = ac;
	}
	
	/**
	 * permet de changer le booleen corrige
	 * TRUE : dans le cas ou l'exercice vient d'�tre corrig�
	 * FALSE: dans le cas o� l'exercice n'a pas �t� corrige ou qu'il est � corriger
	 */
	private boolean setCorrige(boolean c){
		this.corriger = c;
	}
	
	/**
	 * permet de d'obtenir le boolean
	 * TRUE : dans le cas ou l'exercice vient d'�tre corrig�
	 * FALSE: dans le cas o� l'exercice n'a pas �t� corrige ou qu'il est � corriger
	 */
	private boolean getCorrige(boolean c){
		return(this.corriger);
	}
	
	/**
	 * Permet d'enlever une action
	 * Possible que dans le cas cas ou une action a deja ete faite
	 */
	private undoAction(){
		 
	}
	
	/**
	 * Permet de refaire la derniere action
	 * Possible que dans le cas ou une action viens d'etre annuler
	 */
	private redoAction(){
		
	}
	
	/**
	 * Ajouter une action
	 * 
	 */
	private addAction(){
		
	}
	
	/**
	 * permet de visualiser une tentative
	 * 
	 */
	private visualiserTentative(){
		
	}
}