package com.cap.dao;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.cap.model.Profil;

public class MProfil implements IProfil {

	private HibernateTemplate hibernateTemplate;

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Override
	@Transactional
	public void addProfil(Profil p) {
		hibernateTemplate.saveOrUpdate(p);
	}

	@Override
	@Transactional
	public Profil FindProfile(int i) {
		return hibernateTemplate.get(Profil.class, i);
	}

	@Override
	@Transactional
	public void delete(Profil profil) {
		hibernateTemplate.delete(profil);
	}

	@Override
	@Transactional
	public Set<Profil> AllProfiles() {
		Session session = HibernateUtils.getSessionFactory().openSession();
		session.beginTransaction();
		List<Profil> ls = session.createQuery("from Profil").list();
		Set<Profil> profils = new HashSet<Profil>();
		return (Set<Profil>) hibernateTemplate.find("from Profil");
	}
}
