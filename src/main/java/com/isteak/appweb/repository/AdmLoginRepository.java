package com.isteak.appweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.isteak.appweb.model.AdmLogin;

@Repository
public interface AdmLoginRepository extends JpaRepository<AdmLogin, String> {
	AdmLogin findByUSUARIO(String USUARIO);
}
