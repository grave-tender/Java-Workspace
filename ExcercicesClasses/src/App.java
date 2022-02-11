public class App {
    public static void main(String[] args) {
        Patient patient = new Patient();
        Patient patient2 = new Patient();

        patient.setNom("L'Eponge");
        patient.setPrenom("Bob");
        patient.setSexe('H');
        patient.setVille("Bikini Bottom");

        patient2.setNom("Leon");
        patient2.setPrenom("Carlos");
        patient2.setSexe('H');
        patient2.setVille("Montreal");

        System.out.println("Patient 1: " + patient.getPrenom() + " " + patient.getNom()
        + " Sexe: " + patient.getVille() + " Sexe: " + patient.getSexe());

        System.out.println("Patient 2: " + patient2.getPrenom() + " " + patient2.getNom()
        + " Sexe: " + patient2.getVille() + " Sexe: " + patient2.getSexe());

        patient.setVille("Madrid");
        patient2.setVille("Lyon");
        
        System.out.println("Patient 1: " + patient.getPrenom() + " " + patient.getNom()
        + " Sexe: " + patient.getVille() + " Sexe: " + patient.getSexe());

        System.out.println("Patient 2: " + patient2.getPrenom() + " " + patient2.getNom()
        + " Sexe: " + patient2.getVille() + " Sexe: " + patient2.getSexe());
    }
}
