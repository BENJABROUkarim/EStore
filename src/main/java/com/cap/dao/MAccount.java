package com.cap.dao;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.cap.model.Account;
import com.cap.model.Profil;

public class MAccount implements IAccount {

	private HibernateTemplate hibernateTemplate;

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Override
	@Transactional
	public void addAccount(String log, String pass, int i) {
		Account a = new Account(log, pass);
		a.setPrf(hibernateTemplate.get(Profil.class, i));
		hibernateTemplate.saveOrUpdate(hibernateTemplate.get(Profil.class, i));
	}

	@Override
	@Transactional
	public void addAccount(Account account) {
		hibernateTemplate.saveOrUpdate(account);

	}

	@Override
	@Transactional
	public Account authentificate(String log, String pass) {
		Account ac = (Account) hibernateTemplate
				.find("from Account a where a.getLog()=" + log + "and a.getPass()=" + pass).get(0);
		return ac;
	}

}
