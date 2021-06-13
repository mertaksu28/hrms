package javakamp.hrms.core.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import javakamp.hrms.core.entities.User;

public interface UserDao extends JpaRepository<User, Integer> {
	
	

}
