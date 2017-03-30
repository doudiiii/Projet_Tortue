package modele;

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
	
	/**
	 * Constructeur
	 * 
	 */
    public TentativeExercice(int nT, ArrayList<Action> sA, boolean ac, boolean c, String eval, String com){
    	this.numeroTentative = 0;
    	
    }
    
    /**
	 * reinitialiser la tentative
	 * 
	 */
    private void reset(){
    	
    }
    
    /**
	 * obtenir l'evaluation pour l'exercice
	 * 
	 */
	private String getEvaluation(){
	    	return(this.evaluation);
	    }
	
	/**
	 * Donner un evalutation pour la tentative
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
	 * dans le cas ou la tentative a ete realise n'a pas ete encore corrige
	 * 
	 */
	private boolean getACorriger(){
		return(this.aCorriger);
	}
	
	
	/**
	 * permet de changer le booleen
	 * TRUE : dans le cas ou la tentative est a corriger
	 * FALSE: dans le cas ou l'exercice n'a pas ete realise ou a ete corrige
	 */
	private boolean setACorriger(boolean ac){
		this.aCorriger = ac;
	}
	
	/**
	 * permet de changer le booleen corrige
	 * TRUE : dans le cas ou l'exercice vient d'etre corrige
	 * FALSE: dans le cas ou l'exercice n'a pas ete corrige ou qu'il est a corriger
	 */
	private boolean setCorrige(boolean c){
		this.corriger = c;
	}
	
	/**
	 * permet de d'obtenir le boolean
	 * TRUE : dans le cas ou l'exercice vient d'etre corrige
	 * FALSE: dans le cas ou l'exercice n'a pas ete corrige ou qu'il est a corriger
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