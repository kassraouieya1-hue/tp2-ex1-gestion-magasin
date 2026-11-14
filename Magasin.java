package ex1;

public class Magasin {
	private int capacite;
    private Article[] stock;
    private int nbarticle;

    public Magasin(int capacite) {
        this.capacite = capacite;
        stock = new Article[capacite];
        nbarticle = 0;
    }

    public void ajouter(Article a) {

        if (nbarticle < capacite) {
            stock[nbarticle] = a;
            nbarticle++;
            System.out.println("Article ajoute avec succes");
        } else {
            System.out.println("Stock plein ");
        }
    }

    public void inventaire() {

        for (int i = 0; i < nbarticle; i++) {
            System.out.println(stock[i].toString());
            System.out.println("------------------");
        }
    }
	
}
