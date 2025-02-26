package models;

public class Personne {

    private final String nom;
    private final String prenom;

    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    @Override
    public String toString() {
        return nom.toUpperCase() + " " + prenom;
    }

}
