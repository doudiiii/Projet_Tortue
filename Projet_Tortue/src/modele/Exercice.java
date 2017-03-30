package modele;

import javax.swing.*;
import java.util.Date;

/**
 * Created by moi on 30/03/2017.
 */
public class Exercice {
    private String nomExercice;
    private Date date;
    private ImageIcon Image;

    public Exercice(String nomExercice, Date date, ImageIcon image) {
        this.nomExercice = nomExercice;
        this.date = date;
        Image = image;
    }

    public String getNomExercice() {
        return nomExercice;
    }

    public Date getDate() {
        return date;
    }

    public ImageIcon getImage() {
        return Image;
    }
}
