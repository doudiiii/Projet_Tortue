package modele;

/**
 * Created by moi on 30/03/2017.
 */
public class Action {
    private String codeAction;
    private String libelleAction;

    public Action(String codeAction, String libelleAction) {
        this.codeAction = codeAction;
        this.libelleAction = libelleAction;
    }

    public String getCodeAction() {
        return codeAction;
    }

    public void setCodeAction(String codeAction) {
        this.codeAction = codeAction;
    }

    public String getLibelleAction() {
        return libelleAction;
    }

    public void setLibelleAction(String libelleAction) {
        this.libelleAction = libelleAction;
    }

    /*
     * permet de realiser une action
     */
    public void goAction(){}
}
