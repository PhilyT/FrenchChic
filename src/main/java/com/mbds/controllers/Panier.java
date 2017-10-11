package com.mbds.controllers;

import java.util.ArrayList;
import com.mbds.metier.Produit;
import com.mbds.metier.Stock;

/**
 * Panier Controller
 * @author Tom
 *
 */
public class Panier {
	private Produit produit;
	private Stock stock;
	
	public Panier(){
		produit = new Produit();
		stock = new Stock();
	}
	
	public EnumTypeEcran ajoutProduit(int quantite){
		ArrayList<Produit> produits = new ArrayList<Produit>();
		for(int i = 0; i<quantite;i++){
			produits.add(produit.getProduitDuJour());
			stock.removeProduitDuJour();
		}
		return EnumTypeEcran.ECRAN_PANIER;
	}
}
