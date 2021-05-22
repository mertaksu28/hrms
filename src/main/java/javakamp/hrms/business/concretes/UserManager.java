package javakamp.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javakamp.hrms.business.abstracts.UserService;
import javakamp.hrms.dataAccess.abstracts.UserDao;
import javakamp.hrms.entities.concretes.User;

@Service
public class UserManager implements UserService {

	private UserDao userDao;

	@Autowired
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public List<User> getAll() {
		return this.userDao.findAll();
	}

	@Override
	public void add(User user) {
		this.userDao.save(user);
	}

	@Override
	public void update(User user) {
		this.userDao.save(user);
	}

	@Override
	public void delete(User user) {
		this.userDao.delete(user);
	}

	@Override
	public User getByEmail(String email) {
		return null;
	}

}
