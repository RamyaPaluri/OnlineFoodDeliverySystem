package repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import entities.Login;

@Repository
public interface ILoginRepository extends JpaRepository<Login,Integer>{
	public Login signIn(Login login);
	public Login signOut(Login login);

}
