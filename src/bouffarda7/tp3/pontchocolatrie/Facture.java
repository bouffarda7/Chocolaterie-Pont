package bouffarda7.tp3.pontchocolatrie;

import bouffarda7.tp3.pontchocolatrie.produit.*;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 * Cette classe représente une facture
 * typique de la chocolaterie. <br>Elle est composée
 * d'une liste de produit, du numéro identifiant la facture,<br>
 * de la date de la création de la facture,
 * du montant des taxes, du montant des taxes, etc.
 * 
 * @author Alexandre Bouffard
 */
public class Facture {

	
	private List<Produit> m_listeProduit;
	private int m_NumeroFact;
	
	private double m_MontantAvantTaxe;
	private double m_MontantTVQ;
	private double m_MontantTPS;
	private double m_MontantAPayer;
	
	private Date m_dateActuelle;
	private SimpleDateFormat m_formatDate;
	
	private static final double TAUX_TVQ = 0.09975;
	private static final double TAUX_TPS = 0.05;	

	public Facture(){
		setNumeroFacture();
		m_listeProduit = new ArrayList<Produit>();
		m_MontantAvantTaxe = 0.0;
	}
	
	/**
	 * Méthode générant un numéro de facture
	 * 
	 * @author Alexandre Bouffard
	 *
	 */
	public void setNumeroFacture(){
		Random r = new Random();
		m_NumeroFact = r.nextInt(200000);	
	}
	
	/**
	 * Méthode permettant d'ajouter un produit à la facture
	 * 
	 * @param p    Classe implémentant l'interface Produit
	 * 
	 * @author Alexandre Bouffard <br>
	 *
	 * 
	 */
	public void ajouterProduit(Produit p){
		
		m_listeProduit.add(p);
	}
	
	/**
	 * Méthode calculant le montant de la facture - avant les taxes
	 * en fonction des prix des <br>produits inscris dans la liste (dans la facture).
	 * 
	 * @author Alexandre Bouffard
	 *
	 */
    public void caculerPrixAvantTaxe(){
    	for(int i = 0; i < m_listeProduit.size(); i++)
    		m_MontantAvantTaxe = m_MontantAvantTaxe + m_listeProduit.get(i).getPrixFinal();
    	
    }
    
    /**
     * Méthode qui calcul le montant de la TVQ.
     * 
     *  
     * @author Alexandre Bouffard
     *
     */
    public void calculerTVQ(){
    	m_MontantTVQ = m_MontantAvantTaxe * TAUX_TVQ;
    }
    
    /**
     * Méthode qui calcul le montant de la TPS.
     * 
     *  
     * @author Alexandre Bouffard
     *
     */
    public void calculerTPS(){
    	m_MontantTPS = m_MontantAvantTaxe * TAUX_TPS;
    }
    
    /**
     * Méthode qui calcul le montant final à payer - 
     * <br>Montant de bases, plus le montant des taxes.
     * 
     * 
     * @author Alexandre Bouffard
     *
     */
    public void calculerPrixAPayer(){
    	m_MontantAPayer = m_MontantAvantTaxe + m_MontantTVQ + m_MontantTPS;
    }
    
    /**
     * Méthode pour calculer/préparer la date actuelle au moment<br>
     * de l'achat/impression de la facture. <p>Selon le format: Heures:Minutes:Secondes jour/mois/année
     * 
     * @author Alexandre Bouffard
     *
     */
    public void calculerDateActuelle(){
    	m_formatDate = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
    	m_dateActuelle = new Date();
    }
    
    /**
     * Super méthode qui centralise les calculs pour la construction de la facture,
     * <br>à la fin, celle-ci est imprimée à l'écran.
     * 
     * 
     * @author Alexandre Bouffard
     *
     */
    public void finaliserFacture(){
    	caculerPrixAvantTaxe();
    	calculerTVQ();
    	calculerTPS();
    	calculerPrixAPayer();
    	calculerDateActuelle();
    	
    	ImprimerFacture();
    	
    }
	
    /**
     * Méthode imprimant la facture à l'écran
     *  
     * @author Alexandre Bouffard
     *
     */
	public void ImprimerFacture(){
		//Cherche le format pour les montants d'argent selon le système
		NumberFormat formatArgent = NumberFormat.getCurrencyInstance();
		System.out.println("Facture");
		System.out.println("----------------------");
		System.out.println("N° facture: " + String.format("%06d", m_NumeroFact));
		System.out.printf("%n");
		System.out.println(m_formatDate.format(m_dateActuelle));
		System.out.printf("%n");
		
		for(int i = 0; i < m_listeProduit.size(); i++)
			System.out.println(m_listeProduit.get(i).getNomProduit() + ", Quantité: "
					+ "" +  m_listeProduit.get(i).getQuantite());	
		
		System.out.printf("%n");
		System.out.println("Montant avant taxes: " + formatArgent.format(m_MontantAvantTaxe));
		System.out.println("Montant TPS: " + formatArgent.format(m_MontantTPS));
		System.out.println("Montant TVQ: " + formatArgent.format(m_MontantTVQ));
		System.out.printf("%n");
		System.out.println("Montant à payer: " + formatArgent.format(m_MontantAPayer));
	}
}
