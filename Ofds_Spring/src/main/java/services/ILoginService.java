package services;

import entities.*;

public interface ILoginService {
	public Login signIn(Login login);
	public Login signOut(Login login);

}
