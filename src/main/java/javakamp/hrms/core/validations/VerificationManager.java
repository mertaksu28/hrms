package javakamp.hrms.core.validations;

import java.util.UUID;

import org.springframework.stereotype.Service;
@Service
public class VerificationManager implements VerificationService {

	@Override
	public void sendVerificationCode(String email) {
		UUID uuid = UUID.randomUUID();
		uuid.toString();
		
	}

	@Override
	public String codeGenerator() {
		UUID uuid = UUID.randomUUID();
		String verificationCode = uuid.toString();
		return verificationCode;
	}

}
