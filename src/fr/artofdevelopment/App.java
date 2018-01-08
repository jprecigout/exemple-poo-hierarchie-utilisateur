package fr.artofdevelopment;

public class App {
    public static void main(String[] args) {

        Profil profils[] = new Profil[3];
        profils[0] = new Profil("MN", "Manager");
        profils[1] = new Profil("DG", "Directeur");
        profils[2] = new Profil("EE", "Employe");

        Utilisateur users[] = new Utilisateur[3];

        users[0] = new Utilisateur("Durant", "marc", "marcdurand@gmail.com", "angouleme",
                "0643434", 10000, "login", "password", "service", profils[0]);
        users[1] = new Utilisateur("Dupond", "jean", "jeandupond@gmail.com", "niort",
                "0643434", 20000, "login", "password", "service", profils[1]);
        users[2] = new Utilisateur("Moe", "joe", "joemoe@gmail.com", "bordeaux",
                "0643434", 5000, "login", "password", "service", profils[2]);

        System.out.println("La liste des utilisateurs : ");
        for (Utilisateur u : users) {
            u.affiche();
        }
        System.out.println();
        System.out.println("Liste des managers  : ");

        for (Utilisateur u : users) {
            if (u.getProfil().getLibelle().equalsIgnoreCase("manager"))
                u.affiche();
        }
    }
}
