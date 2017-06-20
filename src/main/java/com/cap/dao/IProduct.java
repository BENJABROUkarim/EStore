package com.cap.dao;

import java.util.List;

import com.cap.model.Item;
import com.cap.model.Product;

public interface IProduct {
	public void addCategorie(Product product);

	public Product findPdById(int idp);

	public List<Product> allCats();

	public void addItem(Item item, int idp);

	public List<Item> allItemCat(int idc);

	public Item findItemById(int idit);

}
