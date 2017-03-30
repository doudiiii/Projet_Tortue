package modele;

import static java.lang.System.exit;
import javax.swing.*;

/**
 * Created by moi on 24/03/2017.
 */
public class Eleve extends Personne
{
    // instance variables - replace the example below with your own
    private ImageIcon photoEleve; 
    private boolean sexeEleve;
    private int ageEleve;
    private Classe classeEleve;
    
    /**
     * Constructor for objects of class Eleve
     * @param n nom de l'élève
     * @param p prenom de l'élève
     * @param age age de l'élève
     * @param sexe sexe de l'élève
     * @param icon photographie de l'élève
     * @param classe classe dans laquelle l'élève appartient 
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
     * Permet de retourner l'image d'un élève 
     */
    private ImageIcon getPhotoEleve()
    {
        return photoEleve;
    }
    
    /* 
     * Permet de retourner le sexe d'un élève 
     */
    private boolean getSexeEleve()
    {
        return sexeEleve;
    }
    
     /* 
     * Permet de retourner l'âge d'un élève 
     */
    private int getAgeEleve()
    {
        return ageEleve;
    }   
    
    /* 
     * Permet de modifier l'âge d'un élève 
     */
    private void setAgeEleve(int age)
    {
        ageEleve= age;
    }   
    
    /* 
     * Permet de modifier la photo d'un élève 
     */
    private void setPhotoEleve(ImageIcon photo)
    {
        photoEleve= photo;
    }
    
    /* 
     * Permet de calculer le nombre de tentatives d'un élève pour un exercice donné
     * 
     */   
    private void calculTentative(){
    }
}

    
    