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
public class Personne {
    private String nom;
    private String prenom;
    
public Personne(String nomp, String prenomp)
{
    nom=nomp;
    prenom=prenomp;
}


private String getNom(){
    return nom;
}

private String getPrenom(){
    return prenom;
}
}
