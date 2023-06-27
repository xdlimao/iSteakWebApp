package com.isteak.appweb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isteak.appweb.model.AdmLogin;
import com.isteak.appweb.repository.AdmLoginRepository;

@Service
public class AdmLoginService {
	@Autowired
	private AdmLoginRepository admLoginRepository;

    public boolean isValidUser(String USUARIO, String SENHA) {
        AdmLogin admLogin = admLoginRepository.findByUSUARIO(USUARIO);
        if (admLogin != null && admLogin.getSENHA().equals(SENHA)) {
            return true;
            // getSENHA é da Entidade e não do JpaRepository
        }
        return false;
    }
}
// insert into ADMLOGIN (USUARIO, SENHA) values ('peralta', 'alimento')