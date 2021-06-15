package javakamp.hrms.business.abstracts;

import javakamp.hrms.core.utulities.results.DataResult;
import javakamp.hrms.core.utulities.results.Result;
import javakamp.hrms.entities.concretes.VerificationCode;

public interface VerificationCodeService {
	
	Result add(VerificationCode code);

	DataResult<VerificationCode> getByUserIdAndVerificationCode(int userId, String verificationCode);

	Result update(VerificationCode code);

}
