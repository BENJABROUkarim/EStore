package com.cap.model;

public class Item {
	int idItem;
	String description;
	int qte;
	String prix;
	String designation;
	String img;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getQte() {
		return qte;
	}

	public void setQte(int qte) {
		this.qte = qte;
	}

	public String getPrix() {
		return prix;
	}

	public void setPrix(String prix) {
		this.prix = prix;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public Item(String description, int qte, String prix, String designation, String img) {
		super();
		this.description = description;
		this.qte = qte;
		this.prix = prix;
		this.designation = designation;
		this.img = img;
	}

}
