public class App {
    public static void main(String[] args) {
        //Creation de la premiere instance
        Passenger passenger1 = new Passenger();

        //set le nom de passenger1
        passenger1.setNom("L'Eponge");
        
        //set le prenom de passenger1
        passenger1.setPrenom("Bob");

        //set l'age
        passenger1.setAge(10);

        System.out.println("Nom: " + passenger1.getNom() + " Prenom: " + passenger1.getPrenom() + " Age: " + passenger1.getAge());
    }    
}
