package javakamp.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javakamp.hrms.business.abstracts.UserService;
import javakamp.hrms.core.entities.User;
import javakamp.hrms.core.utulities.results.DataResult;
import javakamp.hrms.core.utulities.results.ErrorDataResult;
import javakamp.hrms.core.utulities.results.Result;
import javakamp.hrms.core.utulities.results.SuccessDataResult;
import javakamp.hrms.core.utulities.results.SuccessResult;
import javakamp.hrms.dataAccess.abstracts.UserDao;
import lombok.var;

@Service
public class UserManager implements UserService {

	private UserDao userDao;


	@Autowired
	public UserManager(UserDao userDao) {

		this.userDao = userDao;
		
	}
	
	@Override
	public Result add(User user) {
		
		this.userDao.save(user);
		return new SuccessResult();
	}

	@Override
	public DataResult<User> getByEmail(String email) {

		
		return new SuccessDataResult<User>(userDao.getByEmail(email),"getirildi");
		
	}
	@Override
	public DataResult<User> getById(int id) {

		
		var result = this.userDao.getById(id);
		if(result==null) {
			return new ErrorDataResult<>("Bulunamadı");
		}
		
		return new SuccessDataResult<>(result,"getirildi");
		
	}

	@Override
	public DataResult<List<User>> getAll() {
		var result = userDao.findAll();
		return new SuccessDataResult<>(result,"Data Listelendi");
	}
	
	

}
