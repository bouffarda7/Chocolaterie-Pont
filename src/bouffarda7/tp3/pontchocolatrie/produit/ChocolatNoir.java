package bouffarda7.tp3.pontchocolatrie.produit;

public class ChocolatNoir implements Produit{

	private String m_NomProduit;
	
	private double m_PrixUnitaire;
	private double m_Rabais;
	private int m_Quantite;
	
	private double m_PrixFinal;
	
	/**
	 * Crée une instance d'un sac remplis 
	 * de petits chocolats noirs. La classe
	 * hérite de l'interface Produit qui 
	 * centralise certains comportements 
	 * généraux aux produits.
	 * <p>
	 * La classe est initialisée avec
	 * un prix de base, un pourcentage de
	 * rabais et une quantité.
	 * Le prix final est calculé selon ces trois paramètres. 
	 * 
	 * 
	 * 
	 * @param PrixBase Le prix unitaire initial pour un sac de chocolat noir
	 * 
	 * @param Rabais Le rabais doit être de format X.XX - où X est un nombre de 0 à 9,
	 *               exemple 15% = 0.15
	 *               
	 * @param Quantite La quantité est le nombre de sac que le client achète
	 * 
	 * @author Alexandre Bouffard
	 */
	
	public ChocolatNoir(double PrixBase, double Rabais, int Quantite){
		m_NomProduit = "Chocolat noir";
		setPrixUnitaire(PrixBase);
		setRabais(Rabais);
		setQuantite(Quantite);
		setPrixFinal(PrixBase, Rabais, Quantite);
		
	}
	
	/**
	 * Méthode qui retourne le nom du produit
	 * 
	 * @return m_NomProduit Nom du produit
	 * 
	 * @author Alexandre Bouffard <br>
	 */
	public String getNomProduit(){
		return m_NomProduit;
	}
	
	/**
	 * Méthode qui initialise le prix de base du produit
	 * 
	 * @param Montant Le montant qui resprésente le prix de base à assigner au produit
	 * 
	 * @author Alexandre Bouffard <br>
	 */
	public void setPrixUnitaire(double Montant){
		m_PrixUnitaire = Montant;
	}
	
	/**
	 * Méthode qui retourne le prix unitaire
	 * 
	 * @return m_PrixUnitaire Prix unitaire du produit
	 * 
	 * @author Alexandre Bouffard<br>
	 * 
	 */
	public double getPrixUnitaire(){
		return m_PrixUnitaire;
	}
	
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
	public void setRabais(double pctRabais){
		if (pctRabais <= 1.00)
			m_Rabais = pctRabais * getPrixUnitaire(); 
	}
	
	/**
	 * Méthode qui retourne le montant du rabais.
	 * 
	 * @return m_Rabais Le montant calculé du rabais.
	 * @author Alexandre Bouffard<br>
	 */
	public double getRabais(){
		return m_Rabais;
	}
	
	/**
	 * Méthode qui initialize la quantité.
	 * Cette dernière doit être, évidemment, plus grande que 1.
	 * 
	 * @param Quant La quantité du produit à acheter
	 * @author Alexandre Bouffard <br>
	 */
	public void setQuantite(int Quant){
		if (Quant > 0)
		 m_Quantite = Quant;
	}
	
	/**
	 * Méthode qui retourne le nombre/la quantité du produit.
	 * 
	 * @return m_Quantite Retourne la quantité
	 * @author Alexandre Bouffard <br> 
	 *
	 */
	public int getQuantite(){
		return m_Quantite;
	}
	
	/**
	 * Méthode qui calcule le prix final, 
	 * c'est à dire le prix de base auquel on enlève
	 * le montant du rabais, et on multiplie le résultat
	 * par la quantité achetée
	 * 
	 * @param PrixB Prix unitaire
	 * @param Rabais Montant du rabais
	 * @param Quant Quantité du produit
	 * 
	 * @author Alexandre Bouffard<br>
	 */
	public void setPrixFinal(double PrixB, double Rabais, int Quant){
		m_PrixFinal = (PrixB - Rabais) * Quant;
	}
	
	/**
	 * Méthode qui retourne le prix final calculé
	 * 
	 * @return m_PrixFinal Retourne le prix final
	 * @author Alexandre Bouffard<br>
	 */
	public double getPrixFinal(){
		return m_PrixFinal;
	}
	
}
