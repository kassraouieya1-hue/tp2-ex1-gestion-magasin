
	package ex1;

	public class Article_Lot extends Article {

	    private int nbPieces;

	    public Article_Lot(int nInventaire, String designation,
	                       String couleur, double prix,
	                       String famille, int nbPieces) {

	        super(nInventaire, designation, couleur, prix, famille);

	        this.nbPieces = nbPieces;
	    }

	    public String toString() {
	        return super.toString() +
	               "\nNombre de pieces : " + nbPieces;
	    }
	}


