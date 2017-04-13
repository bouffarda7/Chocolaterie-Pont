package bouffarda7.tp3.pontchocolatrie.produit;

/**
 * Cette interface représente toutes les méthodes de bases 
 * que DOIVENT implémenter tous les produits disponibles 
 *
 * @author Alexandre Bouffard
 *
 */
public interface Produit {
	
	/**
	 * Méthode qui retourne le nom du produit
	 * 
	 * @return m_NomProduit Nom du produit
	 * 
	 * @author Alexandre Bouffard <br>
	 */
	public String getNomProduit();
	
	/**
	 * Méthode qui retourne le prix unitaire
	 * 
	 * @return m_PrixUnitaire Prix unitaire du produit
	 * 
	 * @author Alexandre Bouffard<br>
	 * 
	 */
	public double getPrixUnitaire();
	
	/**
	 * Méthode qui retourne le montant du rabais.
	 * 
	 * @return m_Rabais Le montant calculé du rabais.
	 * @author Alexandre Bouffard<br>
	 */
	public double getRabais();
	
	/**
	 * Méthode qui retourne le prix final calculé
	 * 
	 * @return m_PrixFinal Retourne le prix final
	 * @author Alexandre Bouffard<br>
	 */
	public double getPrixFinal();
	
	
	/**
	 * Méthode qui initialise le prix de base du produit
	 * 
	 * @param Montant Le montant qui resprésente le prix de base à assigner au produit
	 * 
	 * @author Alexandre Bouffard <br>
	 */
	public void setPrixUnitaire(double Montant);
	
	/**
	 * Méthode qui calcule le montant de rabais selon le prix initial
	 * et le pourcentage de rabais
	 * <p>
	 * Le pourcentage doit être un nombre à virgule allant de 0.00 (0%)
	 * à 1.00 (100%)
	 * 
	 * @param pctRabais Le pourcentage de rabais.
	 * @author Alexandre Bouffard <br>
	 */
	public void setRabais(double pctRabais);
	
	/**
	 * Méthode qui calcule le prix final, 
	 * c'est à dire le prix de base auquel on enlève
	 * le montant du rabais.
	 * 
	 * @param PrixB Prix unitaire
	 * @param Rabais Montant du rabais
	 * 
	 * @author Alexandre Bouffard<br>
	 */
	public void setPrixFinal(double PrixB, double Rabais);
	
}
