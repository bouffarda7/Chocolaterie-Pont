package bouffarda7.tp3.pontchocolatrie;

import bouffarda7.tp3.pontchocolatrie.produit.*;

public class Caisse {

	public static void main(String[] args) {
		Facture fac = new Facture();
		
		fac.ajouterProduit(new ChocolatNoir(4.50, 0.00));
		fac.ajouterProduit(new ChocolatNoir(4.20, 1.00));
		fac.finaliserFacture();

	}

}
