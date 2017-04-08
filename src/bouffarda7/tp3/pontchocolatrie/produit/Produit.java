package bouffarda7.tp3.pontchocolatrie.produit;

/**
 * Cette interface repr�sente toutes les m�thodes de bases 
 * que DOIVENT impl�menter tous les produits disponibles 
 *
 * @author Alexandre Bouffard
 *
 */
public interface Produit {
	
	/**
	 * M�thode qui retourne le nom du produit
	 * 
	 * @return m_NomProduit Nom du produit
	 * 
	 * @author Alexandre Bouffard <br>
	 */
	public String getNomProduit();
	
	/**
	 * M�thode qui retourne le prix unitaire
	 * 
	 * @return m_PrixUnitaire Prix unitaire du produit
	 * 
	 * @author Alexandre Bouffard<br>
	 * 
	 */
	public double getPrixUnitaire();
	
	/**
	 * M�thode qui retourne le montant du rabais.
	 * 
	 * @return m_Rabais Le montant calcul� du rabais.
	 * @author Alexandre Bouffard<br>
	 */
	public double getRabais();
	
	/**
	 * M�thode qui retourne le prix final calcul�
	 * 
	 * @return m_PrixFinal Retourne le prix final
	 * @author Alexandre Bouffard<br>
	 */
	public double getPrixFinal();
	
	/**
	 * M�thode qui retourne le nombre/la quantit� du produit.
	 * 
	 * @return m_Quantite Retourne la quantit�
	 * @author Alexandre Bouffard <br> 
	 *
	 */
	public int getQuantite();
	
	/**
	 * M�thode qui initialise le prix de base du produit
	 * 
	 * @param Montant Le montant qui respr�sente le prix de base � assigner au produit
	 * 
	 * @author Alexandre Bouffard <br>
	 */
	public void setPrixUnitaire(double Montant);
	
	/**
	 * M�thode qui calcule le montant de rabais selon le prix initial
	 * et le pourcentage de rabais
	 * <p>
	 * Le pourcentage doit �tre un nombre � virgule allant de 0.00 (0%)
	 * � 1.00 (100%)
	 * 
	 * @param pctRabais Le pourcentage de rabais.
	 * @author Alexandre Bouffard <br>
	 */
	public void setRabais(double pctRabais);
	
	/**
	 * M�thode qui calcule le prix final, 
	 * c'est � dire le prix de base auquel on enl�ve
	 * le montant du rabais, et on multiplie le r�sultat
	 * par la quantit� achet�e
	 * 
	 * @param PrixB Prix unitaire
	 * @param Rabais Montant du rabais
	 * @param Quant Quantit� du produit
	 * 
	 * @author Alexandre Bouffard<br>
	 */
	public void setPrixFinal(double PrixB, double Rabais, int Quant);
	
	/**
	 * M�thode qui initialize la quantit�.
	 * Cette derni�re doit �tre, �videmment, plus grande que 1.
	 * 
	 * @param Quant La quantit� du produit � acheter
	 * @author Alexandre Bouffard <br>
	 */
	public void setQuantite(int Quant);
	
}
