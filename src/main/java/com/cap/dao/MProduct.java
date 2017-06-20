package com.cap.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.cap.model.Item;
import com.cap.model.Product;

public class MProduct implements IProduct {
	
	private  SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void addCategorie(Product product) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(product);
		session.getTransaction().commit();
	}

	@Override
	public Product findPdById(int idp) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Product product = (Product) session.get(Product.class, idp);
		return product;
	}

	@Override
	public List<Product> allCats() {
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		List<Product> ls = session.createQuery("from Product").list();
		return ls;
	}

	@Override
	public void addItem(Item item, int idp) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Product product = (Product) session.get(Product.class, idp);
		product.getItems().add(item);
		session.save(item);
		session.getTransaction().commit();
	}

	@Override
	public List<Item> allItemCat(int idc) {
		List<Item> items = new ArrayList<>();
		items.addAll(findPdById(idc).getItems());
		return items;
	}

	@Override
	public Item findItemById(int idit) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		return (Item) session.load(Item.class, idit);
	}

}
