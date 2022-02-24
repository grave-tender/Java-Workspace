package model;

/**
 * Classe des Employes
 */
public class Employee {
    private int id;
    private String nom;
    private String prenom;

    /**
     * Constructeur d'Employee
     * @param id
     * @param nom
     * @param prenom
     */
    public Employee(int id, String nom, String prenom) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
    }

    /**
     * getter de l'id de l'Employee
     * @return 
     */
    public int getId(){
        return id;
    }

    /**
     * getter du nom de l'Employee
     * @return String nom
     */
    public String getNom(){
        return nom;
    }

    /**
     * getter du prenom de l'Employee'
     * @return String prenom
     */
    public String getPrenom(){
        return prenom;
    }
}
