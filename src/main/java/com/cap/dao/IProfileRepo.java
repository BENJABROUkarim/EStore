package com.cap.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cap.model.Profil;

@Repository
public interface IProfileRepo extends CrudRepository<Profil, Integer> {
	public Profil findByIdp(int idp);

}
