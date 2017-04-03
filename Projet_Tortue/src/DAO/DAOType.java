package DAO;

/**
 * Created by moi on 03/04/2017.
 */
import java.sql.Connection;


public abstract class DAOtype<T> {
    protected Connection connect = null;

    public DAOtype(Connection conn){
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
    public abstract boolean delete(T obj);

    /**
     * Méthode de recherche des informations
     * @param id
     * @return T
     */
    public abstract T find(int id);
}

