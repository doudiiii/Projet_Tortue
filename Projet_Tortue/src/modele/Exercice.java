package modele;

import javax.swing.*;
import java.util.Date;

/**
 * Created by moi on 30/03/2017.
 * permet la creation de l'objet Exercice et permet l'accès au variable via des getters nomExercice, date, ImageE
 */
public class Exercice {
    private String nomExercice;
    private Date date;
    private ImageIcon ImageE;

    public Exercice(String nomExercice, Date date, ImageIcon image) {
        this.nomExercice = nomExercice;
        this.date = date;
        ImageE = image;
    }

    public String getNomExercice() {
        return nomExercice;
    }

    public Date getDate() {
        return date;
    }

    public ImageIcon getImage() {
        return ImageE;
    }
}
