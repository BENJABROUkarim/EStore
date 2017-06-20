package com.formation.cap;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cap.dao.MAccount;
import com.cap.dao.MProduct;
import com.cap.dao.MProfil;
import com.cap.model.Account;
import com.cap.model.Item;
import com.cap.model.Product;
import com.cap.model.Profil;

public class TestMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		// Employee employee = (Employee) context.getBean("emp");
		// employee.getPost().afficher();
		//
		// // tester injection hibernate dans spring
		// MProfil profilDao = (MProfil) context.getBean("mProfil");
		// Profil profil = new Profil("karim", "benjabrou");
		// profilDao.addProfil(profil);
		//
		// MAccount mAccountDao = (MAccount) context.getBean("mAccount");
		// Account account = new Account("karim", "benjabrou");
		// mAccountDao.addAccount(account);

		//
		Item item = new Item("description", 44, "prix", "designation", "img");
		MProduct mProductDao = (MProduct) context.getBean("mProduct");
		Product product = new Product("jjjjjjjjjjjjjj");
		// Set<Item> set = new HashSet<Item>();
		// set.add(item);
		// product.setItems(set);
		mProductDao.addCategorie(product);

		 mProductDao.addItem(item, 1);
	}

}
