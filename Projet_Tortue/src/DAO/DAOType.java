package DAO;

/**
 * Created by moi on 03/04/2017.
 */
import modele.Eleve;

import java.sql.Connection;


public abstract class DAOType<T> {
    protected Connection connect = null;

    public DAOType(Connection conn){
        this.connect = conn;
    }

    /**
     * Méthode de création
     * @param obj
     * @return boolean
     */
    public abstract boolean create(T obj);

    /**
     * Méthode pour effacer
     * @param obj
     * @return boolean
     */
    public abstract void delete(T obj);

    /**
     * Méthode de recherche des informations
     * @param nom
     * @return T
     */
    public abstract T find(String nom);

    public abstract void add(Eleve eleve);
}

