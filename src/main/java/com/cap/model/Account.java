package com.cap.model;

public class Account {
	int idacc;
	String pass, log;
	Profil prf;
	
	

	public Account(String pass, String log) {
		super();
		this.pass = pass;
		this.log = log;
	}

	public int getIdacc() {
		return idacc;
	}

	public void setIdacc(int idacc) {
		this.idacc = idacc;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public Account(Profil prf) {
		super();
		//aggrégation
		this.prf = prf;
	}

	public String getLog() {
		return log;
	}

	public void setLog(String log) {
		this.log = log;
	}

	public Profil getPrf() {
		return prf;
	}

	public void setPrf(Profil prf) {
		this.prf = prf;
	}

}
