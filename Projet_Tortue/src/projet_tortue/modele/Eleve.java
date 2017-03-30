package modele;

/**
 * Created by moi on 24/03/2017.
 */
public class Eleve
{
    // instance variables - replace the example below with your own
    private String prenom;
    private String nom;
    private int id;
    private String sexe;
    private int age;
    private Classe maClasse;

    /**
     * Constructor for objects of class Eleve
     */
    public Eleve(int idE ,String nomE, String prenomE,String sexeE ,int ageE )
    {
        id=idE;
        this.nom=nomE;
        this.prenom=prenomE;
        this.sexe=sexeE;
        this.age=ageE;
    }
    
    public void setClasse(Classe cl){
        this.maClasse=cl;
    }
    
    public Classe getClasse(){
        return this.maClasse;
    }
    
    public int getIdEleve(){
        return id;
    }
    public String getNomEleve(){
        return nom;
    }
    public String getPrenomEleve(){
        return prenom;
    }
        public int getAgeEleve(){
        return age;
    }
        public String getSexeEleve(){
        return sexe;
    }
}