package bouffarda7.tp3.pontchocolatrie;

import bouffarda7.tp3.pontchocolatrie.produit.*;

public class Caisse {

	public static void main(String[] args) {
		Facture fac = new Facture();
		
		fac.ajouterProduit(new ChocolatNoir(00.00, 0.00));
		fac.ajouterProduit(new ChocolatNoir(00.00, 0.40));
		fac.ajouterProduit(new GateauBlanc(00.00, 0.10));
		fac.ajouterProduit(new GateauBlanc(00.00, 00.00));
		fac.finaliserFacture();

	}

}
