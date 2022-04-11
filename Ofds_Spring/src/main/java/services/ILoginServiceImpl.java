package services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import entities.Login;
import repositories.ILoginRepository;

public class ILoginServiceImpl implements ILoginService {
	@Autowired
	ILoginRepository repositories;

	@Override
	@Transactional
	public Login signIn(Login login) {
		Login log=null;
		log=repositories.signIn(login);
		return log;
	}

	@Override
	@Transactional
	public Login signOut(Login login) {
		Login log=null;
		log=repositories.signOut(login);
		return log;
	}

}
