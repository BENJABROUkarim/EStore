package com.cap.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cap.model.Profil;

@Service
public class ServiceRepo {

	@Autowired
	IProfileRepo iProfileRepo;

	public void addProfil(Profil profil) {
		iProfileRepo.save(profil);
	}

	public void findByIdp(int idp) {
		iProfileRepo.findByIdp(idp);
	}
}
