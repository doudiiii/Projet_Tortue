/**
 * Tentative exercice est une classe qui permet à un élève de faire une tentative d'exercice,
 * qui sera corrigé et évalué par le professeur
 *
 * @author Groupe 3
 * @author Armand Devienne - Jennifer Pehau - Marion Sérazin - Doriane Suc - Marine Vallée
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
    private reset{
    	
    }
    
    /**
	 * obtenir l'evaluation pour l'exercice
	 * 
	 */
	private getEvaluation(){
	    	return(this.evaluation)
	    }
	
	/**
	 * Donner un évalutation pour la tentative
	 * 
	 */
	private setEvaluation(String e){
    	this.evaluation = e
    }
    
	/**
	 * obtenir les commentaires de la tentative
	 * 
	 */
	private getCommentaire(){
    	return(this.commentaire);
    }
	
	/**
	 * saisir les commentaires de la tentative
	 * 
	 */
	private setCommentaire(String c){
		this.commentaire = c;
	}
	
	/**
	 * savoir si la tentative est a corriger
	 * dans le cas où la tentative a été réalisé mais pas encore corrigé
	 * 
	 */
	private getACorriger(){
		return(this.aCorriger);
	}
	
	
	/**
	 * permet de changer le booleen
	 * TRUE : dans le cas ou la tentative est à corriger
	 * FALSE: dans le cas ou l'exercice n'a pas été realisé ou a été corrigé
	 */
	private setACorriger(boolean ac){
		this.aCorriger = ac;
	}
	
	/**
	 * permet de changer le booleen corrige
	 * TRUE : dans le cas ou l'exercice vient d'être corrigé
	 * FALSE: dans le cas où l'exercice n'a pas été corrige ou qu'il est à corriger
	 */
	private setCorrige(boolean c){
		this.corriger = c;
	}
	
	/**
	 * permet de d'obtenir le boolean
	 * TRUE : dans le cas ou l'exercice vient d'être corrigé
	 * FALSE: dans le cas où l'exercice n'a pas été corrige ou qu'il est à corriger
	 */
	private getCorrige(boolean c){
		return(this.corriger);
	}
	
	/**
	 * Permet d'enlever une action
	 * Possible que 
	 */
	private undoAction(){
		
	}
	
	private redoAction(){
		
	}
	
	private addAction(){
		
	}
	
	private visualiserTentative(){
		
	}
	
	
}