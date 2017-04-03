package modele;

import static java.lang.System.exit;
import javax.swing.*;

/**
 * Created by Groupe3 on 24/03/2017.
 */
public class Eleve extends Personne
{
    // instance variables
    private ImageIcon photoEleve; 
    private boolean sexeEleve;
    private int ageEleve;
    private Classe classeEleve;

    /**
     * Constructor for objects of class Eleve
     * @param n nom de l'eleve
     * @param p prenom de l'eleve
     * @param age age de l'eleve
     * @param sexe sexe de l'eleve
     * @param icon photographie de l'eleve
     * @param classe classe dans laquelle l'eleve appartient 
     */

    public Eleve(String n, String p, int age, boolean sexe, ImageIcon icon, Classe classe)
    {
        super(n,p);
        ageEleve=age;
        sexeEleve=sexe;
        photoEleve=icon;
        classeEleve=classe;
    }



    /* 
     * Permet de retourner l'image d'un eleve 
     */
    public ImageIcon getPhotoEleve()
    {
        return photoEleve;
    }
    
    /* 
     * Permet de retourner le sexe d'un eleve 
     */
    public boolean getSexeEleve()
    {
        return sexeEleve;
    }
    
     /* 
     * Permet de retourner l'age d'un eleve 
     */
    public int getAgeEleve()
    {
        return ageEleve;
    }   
    
    /* 
     * Permet de modifier l'age d'un eleve 
     */
    public void setAgeEleve(int age)
    {
        ageEleve= age;
    }   
    
    /* 
     * Permet de modifier la photo d'un eleve 
     */
    public void setPhotoEleve(ImageIcon photo)
    {
        photoEleve= photo;
    }
    
    /* 
     * Permet de retrouner la classe d'un eleve  
     */
    public Classe getClasseEleve()
    {
         return classeEleve;
    }
    
    /* 
     * Permet de modifier la classe de l'eleve  
     */
    public void setClasseEleve(Classe c)
    {
        classeEleve= c;
    }
    
    /* 
     * Permet de calculer le nombre de tentatives d'un eleve pour un exercice donné
     * 
     */   
    public void calculTentative(){
    	// Calculer dans la base de donn�es donc ici requete sql
    }
}

    
    