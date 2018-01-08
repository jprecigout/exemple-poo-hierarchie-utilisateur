package fr.artofdevelopment;

public class Personne {

    protected int id;
    protected String nom;
    protected String prenom;
    protected String mail;
    protected String adresse;
    protected String telephone;
    protected double salaire;

    private static int comp;

    public Personne(String nom, String prenom, String mail, String adresse,
                    String telephone, double salaire) {
        this.id = ++comp;
        this.nom = nom;
        this.prenom = prenom;
        this.mail = mail;
        this.adresse = adresse;
        this.telephone = telephone;
        this.salaire = salaire;
    }

    public double calculerSalaire() {
        return this.salaire;
    }

    public void affiche() {
        System.out.print("Personne : " + this.prenom + " " + this.nom);
    }

}
