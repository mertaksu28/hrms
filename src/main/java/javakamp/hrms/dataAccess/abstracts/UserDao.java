package javakamp.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import javakamp.hrms.entities.concretes.User;

public interface UserDao extends JpaRepository<User, Integer> {

}
