/**
 * Tentative exercice est une classe qui permet ï¿½ un ï¿½lï¿½ve de faire une tentative d'exercice,
 * qui sera corrigï¿½ et ï¿½valuï¿½ par le professeur
 *
 * @author Groupe 3
 * @author Armand Devienne - Jennifer Pehau - Marion Sï¿½razin - Doriane Suc - Marine Vallï¿½e
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
	 * Donner un ï¿½valutation pour la tentative
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
	 * dans le cas oï¿½ la tentative a ï¿½tï¿½ rï¿½alisï¿½ mais pas encore corrigï¿½
	 * 
	 */
	private boolean getACorriger(){
		return(this.aCorriger);
	}
	
	
	/**
	 * permet de changer le booleen
	 * TRUE : dans le cas ou la tentative est ï¿½ corriger
	 * FALSE: dans le cas ou l'exercice n'a pas ï¿½tï¿½ realisï¿½ ou a ï¿½tï¿½ corrigï¿½
	 */
	private boolean setACorriger(boolean ac){
		this.aCorriger = ac;
	}
	
	/**
	 * permet de changer le booleen corrige
	 * TRUE : dans le cas ou l'exercice vient d'ï¿½tre corrigï¿½
	 * FALSE: dans le cas oï¿½ l'exercice n'a pas ï¿½tï¿½ corrige ou qu'il est ï¿½ corriger
	 */
	private boolean setCorrige(boolean c){
		this.corriger = c;
	}
	
	/**
	 * permet de d'obtenir le boolean
	 * TRUE : dans le cas ou l'exercice vient d'ï¿½tre corrigï¿½
	 * FALSE: dans le cas oï¿½ l'exercice n'a pas ï¿½tï¿½ corrige ou qu'il est ï¿½ corriger
	 */
	private boolean getCorrige(boolean c){
		return(this.corriger);
	}
	
	/**
	 * Permet d'enlever une action
	 * Possible que dans le cas où une action a déjà été faite
	 */
	private undoAction(){
		 
	}
	
	/**
	 * Permet de refaire la dernière action
	 * Possible que dans le cas où une action viens d'être annulé
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