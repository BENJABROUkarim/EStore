package com.formation.cap;

import org.hibernate.Session;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cap.dao.HibernateUtils;
import com.cap.dao.MProfil;
import com.cap.model.Profil;

public class TestHibernate {
	public static void main(String[] args) {
		Session session = HibernateUtils.getSessionFactory().openSession();
		session.beginTransaction();

		/** create profil **/
		Profil mp = new Profil("noM2", "Prenom3");
		session.save(mp);

		// tester injection hibernate dans spring
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		MProfil profilDao = (MProfil) context.getBean("mProfil");
		Profil profil = new Profil("karim", "benjabrou");
		profilDao.addProfil(profil);
	}
}
