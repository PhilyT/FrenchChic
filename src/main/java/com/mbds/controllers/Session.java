
package com.mbds.controllers;

import java.util.Map;

import com.mbds.metier.Client;

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
	
	public ResultClient TraiterIdentification (String pseudo, char[] mdp) {
		
		EnumTypeEcran typeEcran = EnumTypeEcran.ECRAN_ACCUEIL_PERSO;

		Client leClient = Client.rechercherClientParPseudo(pseudo, mdp);
		
		ResultClient resultClient = new ResultClient(typeEcran, leClient);
		
		return resultClient;
			
	}
	public Client rechercherClientParPseudo(String _pseudo, String _motDePasse) {
		return new Client (_pseudo, _motDePasse);
	}
	
	
}
