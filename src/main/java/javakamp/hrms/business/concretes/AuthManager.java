package javakamp.hrms.business.concretes;

import javakamp.hrms.business.abstracts.AuthService;
import javakamp.hrms.entities.concretes.User;

public class AuthManager implements AuthService {

	@Override
	public void register(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public void login(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public void logout(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public void sendVerificationMail(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean verifyAccount(User user, String verifyCode) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEmailValid(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEmailExist(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isIdentityExist(User user) {
		// TODO Auto-generated method stub
		return false;
	}

}
