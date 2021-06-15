package javakamp.hrms.core.validations;

public interface VerificationService {

	void sendVerificationCode(String email);

	String codeGenerator();
	
}
