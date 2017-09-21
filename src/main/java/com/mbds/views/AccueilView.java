package com.mbds.views;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


import com.mbds.controllers.AbstractController;
import com.mbds.controllers.Session;
import com.mbds.models.AbstractModel;


/**
 * Home View
 * @author Tom
 *
 */
public class AccueilView extends AbstractView {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8052797855953687730L;
	private AbstractController accueilController;
	
	/**
	 * Constructor
	 * @param controller
	 */
	public AccueilView(AbstractController controller) {
		accueilController = controller;
		
		this.setSize(400, 400);

	    this.setTitle("French Chic");

	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	    this.setLocationRelativeTo(null);

	    this.setResizable(false);

	    initComposant();                               

	    this.setVisible(true);
	}

	private void initComposant(){
		
		JLabel title = new JLabel("French Chic");
		title.setFont(new Font("Arial", Font.BOLD, 42));
		title.setForeground(Color.MAGENTA);
		
		JLabel label1 = new JLabel();
		label1.setText("Pseudo");
		label1.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 20));
		JTextField text1 = new JTextField(15);
		text1.setMaximumSize( new Dimension( 240, 24 ) );

		JLabel label2 = new JLabel();
		label2.setText("Mot de passe");
		label2.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		JPasswordField  text2 = new JPasswordField(15);
		text2.setMaximumSize( new Dimension( 240, 24 ) );
		 
		JButton SUBMIT=new JButton("S'identifier");
		
		JPanel b1 = new JPanel();
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

	    JPanel b5 = new JPanel();
	    b5.setLayout(new BoxLayout(b5, BoxLayout.PAGE_AXIS));
	    b5.add(b1);
	    b5.add(b2);
	    b5.add(b3);
	    b5.add(b4);
	    
	    this.getContentPane().add(b5);
	}
	
	public static void main(String[] args){
		Session controller = new Session(new AbstractModel(){});
		AccueilView view = new AccueilView(controller);
		
	}

}
