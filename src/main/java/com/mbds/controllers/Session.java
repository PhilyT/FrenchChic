package com.mbds.controllers;

import com.mbds.models.AbstractModel;
import com.mbds.views.EnumTypeEcran;

/**
 * Home Controller
 * @author Tom
 *
 */
public class Session extends AbstractController{
	/**
	 * 
	 */
	private AbstractModel accueilModel;
	
	/**
	 * Constructor
	 * @param model
	 */
	public Session(AbstractModel model){
		accueilModel = model;
	}
	

	public EnumTypeEcran traiterConnexion(){
		return EnumTypeEcran.Ecran_Accueil;
	}
	
	
}
