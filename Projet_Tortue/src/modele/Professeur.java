/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

/**
 *
 * @author SERAZIN
 */
public class Professeur extends Personne {
    private String motPasse;
    private String identifiant;
    
     /**
     * Constructor for objects of class Eleve
     * @param n nom du professeur
     * @param p prenom du professeur
     * @param mdp mot de passe du professeur pour sa connexion
     * @param id identifiant du professeur pour sa connexion
     */
    public Professeur(String n, String p, String mdp,String id)
    {
        super(n,p);
        motPasse=mdp;
        identifiant=id;
    }

    /* 
    * Permet de retourner le mot de passe d'un professeur
    */
    private String getMotPasse(){
        return motPasse;
    }

    /* 
    * Permet de retourner le mot de passe d'un professeur
    */
    private String getIdentifiant(){
        return identifiant;
    }
}