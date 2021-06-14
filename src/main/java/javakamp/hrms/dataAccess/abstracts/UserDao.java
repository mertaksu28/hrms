package javakamp.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import javakamp.hrms.core.entities.User;
import javakamp.hrms.entities.dtos.UserLoginDto;

public interface UserDao extends JpaRepository<User, Integer> {
	
	User getById(int id);
	
	@Query("select u from User u where u.email = ?1")
	User getByEmail(String email);
	
	@Query("select new javakamp.hrms.entities.dtos.UserLoginDto"
			+ "( c.email, c.password) "
			+ "From User c")
	List<UserLoginDto> getUserDto();

}
