package ex1;

public class Article {

    private int nInventaire;
    private String designation;
    private String couleur;
    private double prix;
    private String famille;

    public Article(int nInventaire, String designation,
                   String couleur, double prix, String famille) {

        this.nInventaire = nInventaire;
        this.designation = designation;
        this.couleur = couleur;
        this.prix = prix;
        this.famille = famille;
    }

    public String toString() {
        return "Numero inventaire : " + nInventaire +
               "\nDesignation : " + designation +
               "\nCouleur : " + couleur +
               "\nPrix : " + prix +
               "\nFamille : " + famille;
    }

    public boolean memeFamille(Article a) {
        return this.famille.equals(a.famille);
    }
}

	 
