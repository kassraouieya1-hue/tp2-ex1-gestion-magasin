package ex1;

public class TestMagasin {

	public static void main(String[] args) {
		
		 Magasin m = new Magasin(5);

	        Article a1 = new Article(1, "Stylo", "Bleu", 2.5, "Bureau");

	        Article_Lot a2 = new Article_Lot(
	            2, "Cahier", "Rouge", 5.0, "Ecole", 10
	        );

	        m.ajouter(a1);
	        m.ajouter(a2);

	        System.out.println("INVENTAIRE DU MAGASIN");

	        m.inventaire();
	    }
	}


