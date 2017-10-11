package com.mbds.views;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.JTextField;

import com.mbds.controllers.EnumTypeEcran;
import com.mbds.controllers.Panier;
import com.mbds.controllers.Session;

/**
 * Home View
 * 
 * @author Tom
 *
 */
public class VueJetable extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8052797855953687730L;

	private JLabel title = new JLabel("French Chic");
	// panel pour le titre
	private JPanel b1 = new JPanel();
	// master panel
	private JPanel b5 = new JPanel();

	/**
	 * Constructor
	 * 
	 * @param controller
	 */
	public VueJetable() {
		Session accueilController = new Session();

		this.setSize(400, 400);

		this.setTitle("French Chic");

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		this.setLocationRelativeTo(null);

		this.setResizable(false);
		if (accueilController.traiterConnexion().equals(EnumTypeEcran.Ecran_Accueil)) {
			initComposant();
		}

		// debug
		// affichageAccueilPerso();

		this.setVisible(true);
	}

	private void initComposant() {
		title.setFont(new Font("Arial", Font.BOLD, 42));
		title.setForeground(Color.MAGENTA);

		JLabel label1 = new JLabel();
		label1.setText("Pseudo");
		label1.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 20));
		JTextField text1 = new JTextField(15);
		text1.setMaximumSize(new Dimension(240, 24));

		JLabel label2 = new JLabel();
		label2.setText("Mot de passe");
		label2.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		JPasswordField text2 = new JPasswordField(15);
		text2.setMaximumSize(new Dimension(240, 24));

		JButton SUBMIT = new JButton("S'identifier");
		SUBMIT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				affichageAccueilPerso();
			}
		});

		b1.setBorder(BorderFactory.createEmptyBorder(20, 10, 20, 10));
		b1.setLayout(new BoxLayout(b1, BoxLayout.LINE_AXIS));
		b1.add(title);

		JPanel b2 = new JPanel();
		b2.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		b2.setLayout(new BoxLayout(b2, BoxLayout.LINE_AXIS));
		b2.add(label1);
		b2.add(text1);

		JPanel b3 = new JPanel();
		b3.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		b3.setLayout(new BoxLayout(b3, BoxLayout.LINE_AXIS));
		b3.add(label2);
		b3.add(text2);

		JPanel b4 = new JPanel();
		b4.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		b4.setLayout(new BoxLayout(b4, BoxLayout.LINE_AXIS));
		b4.add(SUBMIT);

		b5.setLayout(new BoxLayout(b5, BoxLayout.PAGE_AXIS));
		b5.add(b1);
		b5.add(b2);
		b5.add(b3);
		b5.add(b4);

		this.getContentPane().add(b5);
	}

	private void affichageAccueilPerso() {

		// clean des conmposants inutiles pour l'accueil perso
		removeComposant();

		JLabel greeting = new JLabel("Bonjour ");
		JLabel annonceProduitJour = new JLabel("Le produit du jour est le au prix HT de ");
		JLabel labelQuantite = new JLabel("Quantite ");
		JTextField quantite = new JTextField();
		JButton ajouterProduit = new JButton("Ajouter le produit du jour au panier");
		quantite.setMaximumSize(new Dimension(50, 24));

		JPanel b1 = new JPanel();
		b1.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		b1.setLayout(new BoxLayout(b1, BoxLayout.X_AXIS));
		b1.add(greeting);

		JPanel b2 = new JPanel();
		b2.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		b2.setLayout(new BoxLayout(b2, BoxLayout.X_AXIS));
		b2.add(annonceProduitJour);

		JPanel b3 = new JPanel();
		b3.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		b3.setLayout(new BoxLayout(b3, BoxLayout.X_AXIS));
		b3.add(labelQuantite);
		b3.add(quantite);

		JPanel ajouterProduitPane = new JPanel();
		ajouterProduitPane.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		ajouterProduitPane.setLayout(new BoxLayout(ajouterProduitPane, BoxLayout.X_AXIS));
		ajouterProduitPane.add(ajouterProduit);

		b5.add(b1);
		b5.add(b2);
		b5.add(b3);
		b5.add(ajouterProduitPane);

		this.getContentPane().add(b5);
	}

	private void removeComposant() {
		for (Component comp : b5.getComponents()) {
			if (!comp.equals(b1)) {
				b5.remove(comp);
			}
		}
	}
	
	private void affichagePanier(){
		
		int i= 5;
		
		Panier panier = new Panier();
		
		if(panier.ajoutProduit(i).equals(EnumTypeEcran.ECRAN_PANIER)){
			removeComposant();
			title.setText("Votre Panier");
			
			JLabel label2 = new JLabel();
			label2.setText("Montant panier");
			label2.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
			JTextField text2 = new JTextField(15);
			text2.setMaximumSize(new Dimension(240, 24));
			
			Object[][] donnees = {  
					    
					} ;
			String[] titreColonnes = { 
					   "Libellé","PRix HT", "Quantité",
					   "Montant"}; 
			JTable jTable1 = new JTable(
					      donnees, titreColonnes);
			
			JPanel b2 = new JPanel();
			b2.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
			b2.add(jTable1);
			
			JPanel b3 = new JPanel();
			b3.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
			b3.setLayout(new BoxLayout(b3, BoxLayout.LINE_AXIS));
			b3.add(label2);
			b3.add(text2);
			
			
			b5.add(b2);
			b5.add(b3);
		}		
	}

	public static void main(String[] args) {
		VueJetable view = new VueJetable();

	}

}
