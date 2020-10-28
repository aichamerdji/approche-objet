package entites;

public class Personne {

    String nom;
    String prénom;
    AdressePostale a;

    public Personne(String nom, String prénom, AdressePostale a) {
        this.nom = nom;
        this.prénom = prénom;
        this.a = a;
    }
}
