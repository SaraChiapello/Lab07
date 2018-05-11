package it.polito.tdp.poweroutages.model;

import java.util.List;

import it.polito.tdp.poweroutages.db.PowerOutageDAO;

public class Model {

	private PowerOutageDAO podao;
	
	private List<PowerOutageEvent> po;
	private List<Nerc> nerc;
	
	private NercIdMap nercmap;
		
	
	public Model() {
		podao = new PowerOutageDAO();
		
		nercmap=new NercIdMap();
		
		nerc=podao.getNercList(nercmap);
	}
	
	public List<Nerc> getNercList() {
//	return podao.getNercList;
		return this.nerc;

	}

}
