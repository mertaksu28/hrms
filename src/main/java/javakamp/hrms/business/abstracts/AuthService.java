package javakamp.hrms.business.abstracts;

import javakamp.hrms.entities.concretes.User;

public interface AuthService {

	void register(User user);

	void login(User user);

	void logout(User user);

	void sendVerificationMail(User user);

	boolean verifyAccount(User user, String verifyCode);

	boolean isEmailValid(User user);

	boolean isEmailExist(User user);

	boolean isIdentityExist(User user);

}
