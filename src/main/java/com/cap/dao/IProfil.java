package com.cap.dao;

import java.util.Set;

import org.hibernate.Session;

import com.cap.model.Profil;

public interface IProfil {

	public void addProfil(Profil p);

	public Profil FindProfile(int i);

	public void delete(Profil profil);
	
	public Set<Profil> AllProfiles();

}
