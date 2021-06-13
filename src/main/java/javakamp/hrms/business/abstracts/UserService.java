package javakamp.hrms.business.abstracts;

import java.util.List;

import javakamp.hrms.core.entities.User;
import javakamp.hrms.core.utulities.results.DataResult;
import javakamp.hrms.core.utulities.results.Result;

public interface UserService {

	Result add(User user);

	DataResult<User> getByEmail(String email);
	
	DataResult<User> getById(int id);

	DataResult<List<User>> getAll();
}
