
package com.mbds.controllers;

import com.mbds.views.Client;

/**
 * Home Controller
 * @author Tom
 *
 */
public class Session {
	/**
	 * 
	 */
	
	
	/**
	 * Constructor
	 */
	public Session(){

	}
	

	public EnumTypeEcran traiterConnexion(){
		return EnumTypeEcran.Ecran_Accueil;
	}
	
	public EnumTypeEcran TraiterIdentification (String pseudo, String mdp) {
		return EnumTypeEcran.Ecran_Accueil;
			
	}
	public Client rechercherClientParPseudo(String _pseudo, String _motDePasse) {
		return new Client (_pseudo, _motDePasse);
	}
	
	
}
