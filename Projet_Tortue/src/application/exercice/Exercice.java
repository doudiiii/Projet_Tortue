package application.exercice;

import application.eleve.Classe;
import java.util.ArrayList;
import javax.swing.*;
import java.util.Date;

/**
 * Created by Groupe3 on 30/03/2017.
 * permet la creation de l'objet Exercice et permet l'accès au variable via des getters nomExercice, date, ImageE
 */
public class Exercice {
	
    private String nomExercice;
    private Date date;
    private ImageIcon imageE;
    private int numeroExo;
    private ArrayList<Classe> lClasse= new ArrayList<Classe>();

    public Exercice(String nomExercice,int numE, ArrayList<Classe> listClasse, Date date, ImageIcon image) {
        this.nomExercice = nomExercice;
        this.numeroExo = numE;
        this.date = date;
        this.lClasse = listClasse;
        imageE = image;
    }

    public String getNomExercice() {
        return nomExercice;
    }
    
    public int getNumExo() { 
        return numeroExo;
    }

    public Date getDate() {
        return date;
    }

    public ImageIcon getImage() {
        return imageE; 
    }
    
    public ArrayList<Classe> getListClasse() {
        return lClasse;
    }
}
