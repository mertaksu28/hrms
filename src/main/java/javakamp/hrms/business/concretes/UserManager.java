package javakamp.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javakamp.hrms.business.abstracts.UserService;
import javakamp.hrms.core.dataAccess.abstracts.UserDao;
import javakamp.hrms.core.entities.User;
import javakamp.hrms.core.utulities.results.DataResult;
import javakamp.hrms.core.utulities.results.Result;
import javakamp.hrms.core.utulities.results.SuccessResult;

@Service
public class UserManager implements UserService {

	private UserDao userDao;

	@Autowired
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public Result add(User user) {
		userDao.save(user);
		return new SuccessResult("Eklendi");
	}

	@Override
	public DataResult<User> getByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<List<User>> getAll() {
		// TODO Auto-generated method stub
		return null;
	}


}
