package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import entities.Login;
import services.ILoginService;

@RestController
@RequestMapping("/api")
public class LoginController {
	@Autowired
	private ILoginService Repositories;
	@RequestMapping("/signIn")
	public Login signIn(@RequestBody Login login) {
		Login log = Repositories.signIn(login);
		return log;
	}
	@RequestMapping("/signOut")
	public Login signOut(@RequestBody Login login) {
		Login log = Repositories.signOut(login);
		return log;
	}
}