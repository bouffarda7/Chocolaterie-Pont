package bouffarda7.tp3.pontchocolatrie;

import bouffarda7.tp3.pontchocolatrie.produit.*;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 * Cette classe repr�sente une facture
 * typique de la chocolaterie. <br>Elle est compos�e
 * d'une liste de produit, du num�ro identifiant la facture,<br>
 * de la date de la cr�ation de la facture,
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
	 * M�thode g�n�rant un num�ro de facture
	 * 
	 * @author Alexandre Bouffard
	 *
	 */
	public void setNumeroFacture(){
		Random r = new Random();
		m_NumeroFact = r.nextInt(200000);	
	}
	
	/**
	 * M�thode permettant d'ajouter un produit � la facture
	 * 
	 * @param p    Classe impl�mentant l'interface Produit
	 * 
	 * @author Alexandre Bouffard <br>
	 *
	 * 
	 */
	public void ajouterProduit(Produit p){
		
		m_listeProduit.add(p);
	}
	
	/**
	 * M�thode calculant le montant de la facture - avant les taxes
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
     * M�thode qui calcul le montant de la TVQ.
     * 
     *  
     * @author Alexandre Bouffard
     *
     */
    public void calculerTVQ(){
    	m_MontantTVQ = m_MontantAvantTaxe * TAUX_TVQ;
    }
    
    /**
     * M�thode qui calcul le montant de la TPS.
     * 
     *  
     * @author Alexandre Bouffard
     *
     */
    public void calculerTPS(){
    	m_MontantTPS = m_MontantAvantTaxe * TAUX_TPS;
    }
    
    /**
     * M�thode qui calcul le montant final � payer - 
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
     * M�thode pour calculer/pr�parer la date actuelle au moment<br>
     * de l'achat/impression de la facture. <p>Selon le format: Heures:Minutes:Secondes jour/mois/ann�e
     * 
     * @author Alexandre Bouffard
     *
     */
    public void calculerDateActuelle(){
    	m_formatDate = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
    	m_dateActuelle = new Date();
    }
    
    /**
     * Super m�thode qui centralise les calculs pour la construction de la facture,
     * <br>� la fin, celle-ci est imprim�e � l'�cran.
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
     * M�thode imprimant la facture � l'�cran
     *  
     * @author Alexandre Bouffard
     *
     */
	public void ImprimerFacture(){
		//Cherche le format pour les montants d'argent selon le syst�me
		NumberFormat formatArgent = NumberFormat.getCurrencyInstance();
		System.out.println("Facture");
		System.out.println("----------------------");
		System.out.println("N� facture: " + String.format("%06d", m_NumeroFact));
		System.out.printf("%n");
		System.out.println(m_formatDate.format(m_dateActuelle));
		System.out.printf("%n");
		
		for(int i = 0; i < m_listeProduit.size(); i++)
			System.out.println(m_listeProduit.get(i).getNomProduit() + ", Quantit�: "
					+ "" +  m_listeProduit.get(i).getQuantite());	
		
		System.out.printf("%n");
		System.out.println("Montant avant taxes: " + formatArgent.format(m_MontantAvantTaxe));
		System.out.println("Montant TPS: " + formatArgent.format(m_MontantTPS));
		System.out.println("Montant TVQ: " + formatArgent.format(m_MontantTVQ));
		System.out.printf("%n");
		System.out.println("Montant � payer: " + formatArgent.format(m_MontantAPayer));
	}
}
