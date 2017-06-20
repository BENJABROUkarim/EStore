package com.cap.model;

import java.util.HashSet;
import java.util.Set;

public class Product {

	int idpr;
	String libelle;
	Set<Item> items = new HashSet<Item>();

	public Product() {
		super();
	}

	public Set<Item> getItems() {
		return items;
	}

	public void setItems(Set<Item> items) {
		this.items = items;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public Product(String libelle) {
		super();
		this.libelle = libelle;
	}

	public Product(String libelle, Set<Item> items) {
		super();
		this.libelle = libelle;
		this.items = items;
	}

}
