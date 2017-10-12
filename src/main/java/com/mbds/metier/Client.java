package com.mbds.metier;

import java.util.Arrays;

public class Client {
	
	String nom;
	String prenom;
	String pseudo;
	String motDePasse;
	
	public Client(String _pseudo, String _mdp) {
		this.pseudo=_pseudo;
		this.motDePasse=_mdp;
		}
	
	public static Client rechercherClientParPseudo(String pseudo, char[] mdp) {
		Client clientDeTest = new Client("User", "root");
		clientDeTest.setNom("Dupond");
		clientDeTest.setPrenom("Marie");
		
		
		if (pseudo.equals(clientDeTest.getPseudo()) & isPasswordCorrect(mdp)) {
			return clientDeTest;
		}
		return null;
	}
	
	private static boolean isPasswordCorrect(char[] input) {
	    boolean isCorrect = true;
	    char[] correctPassword = { 'r', 'o', 'o', 't' };

	    if (input.length != correctPassword.length) {
	        isCorrect = false;
	    } else {
	        isCorrect = Arrays.equals (input, correctPassword);
	    }

	    //Zero out the password.
	    Arrays.fill(correctPassword,'0');

	    return isCorrect;
	}
	
	public String getNom() {
		return nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public String getPseudo() {
		return pseudo;
	}
	public String getMotDePasse() {
		return motDePasse;
	}
	
	public void setNom(String _nom) {
		this.nom = _nom;
	}
	public void setPrenom(String _prenom) {
		this.prenom = _prenom;
	}
	public void setPseudo(String _pseudo) {
		this.pseudo = _pseudo;
	}
	public void setMotDePasse(String _mdp) {
		this.motDePasse = _mdp;
	}
	
}
