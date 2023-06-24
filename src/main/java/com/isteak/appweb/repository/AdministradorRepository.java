package com.isteak.appweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.isteak.appweb.model.Administrador;

@Repository
public interface AdministradorRepository extends JpaRepository<Administrador, Integer> {

}
