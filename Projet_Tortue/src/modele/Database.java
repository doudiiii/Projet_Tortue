package modele;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
/**
 * Created by moi on 31/03/2017.
 */
public class Database {
    public class Connexion {
        private String DBPath = "Chemin aux base de donnée SQLite";
        private Connection connection = null;
        private Statement statement = null;

        public Connexion(String dBPath) {
            DBPath = dBPath;
        }

        public void connect() {
            try {
                Class.forName("org.sqlite.JDBC");
                connection = DriverManager.getConnection("jdbc:sqlite:" + DBPath);
                statement = connection.createStatement();
                System.out.println("Connexion a " + DBPath + " avec succès");
            } catch (ClassNotFoundException notFoundException) {
                notFoundException.printStackTrace();
                System.out.println("Erreur de connecxion");
            } catch (SQLException sqlException) {
                sqlException.printStackTrace();
                System.out.println("Erreur de connecxion");
            }
        }

        public void close() {
            try {
                connection.close();
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
