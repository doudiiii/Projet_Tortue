package modele;

/**
 * Created by moi on 30/03/2017.
 * Permet la creation de l'objet Action et permet l'accès aux variables codeAction, libelleAction via des getters.
 * Permet de faire l'action donner
 */
public class Action {
    private String codeAction;
    private String libelleAction;

    public Action(String codeAction, String libelleAction) 
    {
        this.codeAction = codeAction;
        this.libelleAction = libelleAction;
    }

    public String getCodeAction() 
    {
        return codeAction;
    }

    public void setCodeAction(String codeAction) 
    {
        this.codeAction = codeAction;
    }

    public String getLibelleAction() 
    {
        return libelleAction;
    }

    public void setLibelleAction(String libelleAction) 
    {
        this.libelleAction = libelleAction;
    }

    /*
     * permet de faire  une action
     */
    public void doAction()
    {
    	// Avance, tourne , desssine, ne dessine pas, change la couleur, accélère, ralentis 
    }
}
