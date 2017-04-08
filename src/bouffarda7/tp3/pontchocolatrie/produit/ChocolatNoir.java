package bouffarda7.tp3.pontchocolatrie.produit;

public class ChocolatNoir implements Produit{

	private String m_NomProduit;
	
	private double m_PrixUnitaire;
	private double m_Rabais;
	private int m_Quantite;
	
	private double m_PrixFinal;
	
	/**
	 * Cr�e une instance d'un sac remplis 
	 * de petits chocolats noirs. La classe
	 * h�rite de l'interface Produit qui 
	 * centralise certains comportements 
	 * g�n�raux aux produits.
	 * <p>
	 * La classe est initialis�e avec
	 * un prix de base, un pourcentage de
	 * rabais et une quantit�.
	 * Le prix final est calcul� selon ces trois param�tres. 
	 * 
	 * 
	 * 
	 * @param PrixBase Le prix unitaire initial pour un sac de chocolat noir
	 * 
	 * @param Rabais Le rabais doit �tre de format X.XX - o� X est un nombre de 0 � 9,
	 *               exemple 15% = 0.15
	 *               
	 * @param Quantite La quantit� est le nombre de sac que le client ach�te
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
	 * M�thode qui retourne le nom du produit
	 * 
	 * @return m_NomProduit Nom du produit
	 * 
	 * @author Alexandre Bouffard <br>
	 */
	public String getNomProduit(){
		return m_NomProduit;
	}
	
	/**
	 * M�thode qui initialise le prix de base du produit
	 * 
	 * @param Montant Le montant qui respr�sente le prix de base � assigner au produit
	 * 
	 * @author Alexandre Bouffard <br>
	 */
	public void setPrixUnitaire(double Montant){
		m_PrixUnitaire = Montant;
	}
	
	/**
	 * M�thode qui retourne le prix unitaire
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
	 * M�thode qui calcule le montant de rabais selon le prix initial
	 * et le pourcentage de rabais
	 * <p>
	 * Le pourcentage doit �tre un nombre � virgule allant de 0.00 (0%)
	 * � 1.00 (100%)
	 * 
	 * @param pctRabais Le pourcentage de rabais.
	 * @author Alexandre Bouffard <br>
	 */
	public void setRabais(double pctRabais){
		if (pctRabais <= 1.00)
			m_Rabais = pctRabais * getPrixUnitaire(); 
	}
	
	/**
	 * M�thode qui retourne le montant du rabais.
	 * 
	 * @return m_Rabais Le montant calcul� du rabais.
	 * @author Alexandre Bouffard<br>
	 */
	public double getRabais(){
		return m_Rabais;
	}
	
	/**
	 * M�thode qui initialize la quantit�.
	 * Cette derni�re doit �tre, �videmment, plus grande que 1.
	 * 
	 * @param Quant La quantit� du produit � acheter
	 * @author Alexandre Bouffard <br>
	 */
	public void setQuantite(int Quant){
		if (Quant > 0)
		 m_Quantite = Quant;
	}
	
	/**
	 * M�thode qui retourne le nombre/la quantit� du produit.
	 * 
	 * @return m_Quantite Retourne la quantit�
	 * @author Alexandre Bouffard <br> 
	 *
	 */
	public int getQuantite(){
		return m_Quantite;
	}
	
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
	public void setPrixFinal(double PrixB, double Rabais, int Quant){
		m_PrixFinal = (PrixB - Rabais) * Quant;
	}
	
	/**
	 * M�thode qui retourne le prix final calcul�
	 * 
	 * @return m_PrixFinal Retourne le prix final
	 * @author Alexandre Bouffard<br>
	 */
	public double getPrixFinal(){
		return m_PrixFinal;
	}
	
}
