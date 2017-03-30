package modele;


import java.awt.List;
import java.util.ArrayList;


/**
 * Created by moi on 24/03/2017.
 */
public class Classe 
{
    // instance variables - replace the example below with your own
    private  String nom;
    private String professeur;
    private int id;
    private Eleve eleves;
    private ArrayList<Eleve> listEleves = new ArrayList<Eleve>();
    private int tailleClasse;

    /**
     * Constructor for objects of class Classe
     */
    public Classe(int idC, String nomC, String prof, int t)
    {
        id=idC;
        this.nom=nomC;
        this.professeur=prof;
        //this.listEleves = lE;
        this.tailleClasse = t;
    }

    Classe() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getIdClasse(){
        return this.id;
    }
    public String getNomClasse(){
        return this.nom;
    }
    public String getProf(){
        return this.professeur;
    }    
    public ArrayList<Eleve> getListEleve(){
        return this.listEleves;
    }
    
    public void addEleve(Eleve eleve){
        this.listEleves.add(eleve);
        eleve.setClasse(this);
        tailleClasse=tailleClasse+1;
    }
    
    public void deleteEleve(Eleve eleve){
        this.listEleves.remove(eleve);
        tailleClasse=tailleClasse-1;
    }

    public int getSize() {
        return tailleClasse;
    }
}

    
  