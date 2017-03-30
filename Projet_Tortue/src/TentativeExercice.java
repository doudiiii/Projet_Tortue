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
	
    public TentativeExercice{
    	
    }
    
    private reset{
    	
    }
    
	private getEvaluation(){
	    	return(this.evaluation)
	    }
	
	private setEvaluation(String e){
    	this.evaluation = e
    }
    
	private getCommentaire(){
    	return(this.commentaire);
    }
	
	private setCommentaire(String c){
		this.commentaire = c;
	}
	
	private getACorriger(){
		return(this.aCorriger);
	}
	
	private setACorriger(boolean ac){
		this.aCorriger = ac;
	}
	
	private setCorrige(boolean c){
		this.corriger = c;
	}
	
	private getCorrige(boolean c){
		return(this.corriger);
	}
	
	private undoAction(){
		
	}
	
	private redoAction(){
		
	}
	
	private addAction(){
		
	}
	
	private visualiserTentative(){
		
	}
	
	
}