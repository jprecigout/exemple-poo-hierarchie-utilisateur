package fr.artofdevelopment;

public class Utilisateur extends Personne {

    private String login;
    private String password;
    private String service;
    private Profil profil;

    public Utilisateur(String nom, String prenom, String mail, String adresse,
                       String telephone, double salaire, String login, String password,
                       String service, Profil profil) {
        super(nom, prenom, mail, adresse, telephone, salaire);
        this.login = login;
        this.password = password;
        this.service = service;
        this.profil = profil;
    }

    public double calculerSalaire() {
        if (this.profil.getLibelle().equalsIgnoreCase("manager"))
            return 1.1 * this.salaire;
        else if (this.profil.getLibelle().equalsIgnoreCase("directeur"))
            return 1.4 * this.salaire;
        return super.calculerSalaire();
    }

    public void affiche() {
        super.affiche();
        System.out.println(" Profil : " + this.profil.getLibelle()
                + " Salaire : " + this.calculerSalaire());
    }

    public Profil getProfil() {
        return profil;
    }

}
