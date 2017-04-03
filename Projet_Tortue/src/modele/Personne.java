
package modele;

/**
 *
 * @author SERAZIN
 */
public class Personne {
    private String nom;
    private String prenom;
    
    /**
     *
     * @param nomp qui représente le nom de la personne
     * @param prenomp qui représente le prenom de la personne
     */
    public Personne(String nomp, String prenomp)
    {
        nom=nomp;
        prenom=prenomp;
    }

    /* 
    * Permet de retourner le nom d'une personne
    */
    public String getNom(){
        return nom;
    }

    /* 
    * Permet de retourner le prénom d'une personne
    */
    public String getPrenom(){
        return prenom;
    }
}
