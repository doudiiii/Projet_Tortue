package DAO;

import modele.Eleve;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by moi on 03/04/2017.
 */
public class DAOEleve extends DAOtype<Eleve> {

    public DAOEleve(Connection conn) {
        super(conn);
    }

    @Override
    public boolean create(Eleve obj) {
        return false;
    }

    @Override
    public boolean delete(Eleve obj) {
        return false;
    }

    @Override
    public Eleve find(String nom) {
        return null;
    }


/*
    public Eleve find(String nom) {
        Eleve eleve = new Eleve();

        try {
            ResultSet result = this.connect.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * FROM eleve WHERE Eleve_Nom = " + nom);
            if(result.first())
                eleve = new Eleve(
                        nom,
                        result.getString("Eleve_Prenom"),
                        result.getInt("Eleve_Age"),
                        result.getBoolean("Eleve_Sexe")
                        //result.getIcon("Eleve_Photo"),
                        //result.getClasse("Eleve_Classe")
                );
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return eleve;
    }
*/

}
