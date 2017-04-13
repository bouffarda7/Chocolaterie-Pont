package bouffarda7.tp3.pontchocolatrie.produit;

public class ChocolatNoir implements Produit{

	private String m_NomProduit;
	
	private double m_PrixUnitaire;
	private double m_Rabais;

	
	private double m_PrixFinal;
	
	/**
	 * Crée une instance d'un sac remplis 
	 * de petits chocolats noirs. La classe
	 * hérite de l'interface Produit qui 
	 * centralise certains comportements 
	 * généraux aux produits.
	 * <p>
	 * La classe est initialisée avec
	 * un prix de base et un pourcentage de
	 * rabais.
	 * Le prix final est calculé selon ces deux paramètres. 
	 *  
	 * 
	 * @param PrixBase Le prix unitaire initial pour un sac de chocolat noir
	 * 
	 * @param Rabais Le rabais doit être de format X.XX - où X est un nombre de 0 à 9,
	 *               exemple 15% = 0.15
	 *               
	 * 
	 * @author Alexandre Bouffard
	 */
	
	public ChocolatNoir(double PrixBase, double Rabais){
		m_NomProduit = "Chocolat noir";

		m_PrixUnitaire = 4.50;
		if (PrixBase != 00.00)
			setPrixUnitaire(PrixBase);
		else{
			setPrixUnitaire(m_PrixUnitaire);
		}
		setRabais(Rabais);
		setPrixFinal(m_PrixUnitaire, m_Rabais);
		
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
			m_Rabais = pctRabais * m_PrixUnitaire; 
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
	 * Méthode qui calcule le prix final, 
	 * c'est à dire le prix de base auquel on enlève
	 * le montant du rabais.
	 * 
	 * @param PrixB Prix unitaire
	 * @param Rabais Montant du rabais
	 * 
	 * 
	 * @author Alexandre Bouffard<br>
	 */
	public void setPrixFinal(double PrixB, double Rabais){
		m_PrixFinal = PrixB - Rabais;
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
