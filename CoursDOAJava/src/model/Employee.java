package model;

/**
 * Classe des Employes
 */
public class Employee {
    private int id;
    private String nom;
    private String prenom;

    /**
     * Constructeur des instances d'Employees
     * @param int id
     * @param String nom
     * @param String prenom
     */
    public Employee(int id, String nom, String prenom) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
    }

    /**
     * getter de l'id de l'instance de l'Employee
     * @return int id
     */
    public int getId(){
        return id;
    }

    /**
     * getter du nom de l'instance de l'Employee
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
