package DAO;

import modele.Eleve;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by moi on 03/04/2017.
 */
public class DAOEleve extends DAOtype<Eleve> {

    Connection connection = null;
    PreparedStatement ptmt = null;
    ResultSet resultSet = null;

    public DAOEleve(Connection conn) {
        super(conn);
    }

    @Override
    public boolean create(Eleve obj) {
        return false;
    }

    public void add(Eleve eleve) {
        try {
            String queryString = "INSERT INTO student(RollNo, Age, Nom, Prenom, Sexe, Photo, Classe) VALUES(?,?,?,?,?,?,?)";
            ptmt = this.connect.prepareStatement(queryString);
           // ptmt.setInt(1, eleve.getRollNo());
            ptmt.setString(2, eleve.getNom());
            ptmt.setString(3, eleve.getPrenom());
            ptmt.setString(4, String.valueOf(eleve.getAgeEleve()));
            ptmt.setString(5, String.valueOf(eleve.getSexeEleve()));
            ptmt.setString(6, String.valueOf(eleve.getPhotoEleve()));
            ptmt.setString(7, String.valueOf(eleve.getClasseEleve()));
            ptmt.executeUpdate();
            System.out.println("Data Added Successfully");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (ptmt != null)
                    ptmt.close();
                if (connection != null)
                    connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

    }


    @Override
    public void delete(Eleve obj) {
        try {
            this    .connect
                    .createStatement(
                            ResultSet.TYPE_SCROLL_INSENSITIVE,
                            ResultSet.CONCUR_UPDATABLE
                    ).executeUpdate(
                    "DELETE FROM Eleve WHERE Eleve_Nom = " + obj.getNomE()
            );

        } catch (SQLException e) {
            e.printStackTrace();
        }
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
