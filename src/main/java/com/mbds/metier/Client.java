package com.mbds.metier;

public class Client {
	
	String nom;
	String prenom;
	String pseudo;
	String motDePasse;
	
	public Client(String _pseudo, String _mdp) {
		this.pseudo=_pseudo;
		this.motDePasse=_mdp;
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
