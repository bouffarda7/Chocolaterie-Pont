package bouffarda7.tp3.pontchocolatrie.produit;

public class GateauBlanc implements Produit {
	
	private String m_NomProduit;
	
	private double m_PrixUnitaire;
	private double m_Rabais;

	
	private double m_PrixFinal;
	
	public GateauBlanc(double PrixBase, double Rabais) {
		m_NomProduit = "G�teau chocolat blanc";
		
		m_PrixUnitaire = 12.00;
		if (PrixBase != 00.00)
			setPrixUnitaire(PrixBase);
		else{
			setPrixUnitaire(m_PrixUnitaire);
		}
		setRabais(Rabais);
		setPrixFinal(m_PrixUnitaire, m_Rabais);
	}

	
	public String getNomProduit() {
		return m_NomProduit;
	}

	
	public double getPrixUnitaire() {
		return m_PrixUnitaire;
	}

	
	public double getRabais() {
		return m_Rabais;
	}

	
	public double getPrixFinal() {
		return m_PrixFinal;
	}

	public void setPrixUnitaire(double Montant) {
		m_PrixUnitaire = Montant;

	}

	
	public void setRabais(double pctRabais) {
		if (pctRabais <= 1.00)
			m_Rabais = pctRabais * m_PrixUnitaire; 

	}

	
	public void setPrixFinal(double PrixB, double Rabais) {
		m_PrixFinal = PrixB - Rabais;

	}

}
