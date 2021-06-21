package javakamp.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javakamp.hrms.business.abstracts.VerificationCodeService;
import javakamp.hrms.core.utulities.results.DataResult;
import javakamp.hrms.core.utulities.results.Result;
import javakamp.hrms.core.utulities.results.SuccessDataResult;
import javakamp.hrms.core.utulities.results.SuccessResult;
import javakamp.hrms.dataAccess.abstracts.VerificationCodeDao;
import javakamp.hrms.entities.concretes.VerificationCode;
@Service
public class VerificationCodeManager implements VerificationCodeService {

	private VerificationCodeDao verificationCodeDao;

	@Autowired
	public VerificationCodeManager(VerificationCodeDao verificationCodeDao) {
		super();
		this.verificationCodeDao = verificationCodeDao;
	}

	@Override
	public Result add(VerificationCode code) {
		code.setIsActive(false);
		this.verificationCodeDao.save(code);
		return new SuccessResult("Code added !");
	}

	@Override
	public DataResult<VerificationCode> getByUserIdAndVerificationCode(int userId, String verificationCode) {

		return new SuccessDataResult<VerificationCode>(
				this.verificationCodeDao.findByUserIdAndCode(userId, verificationCode));
	}

	@Override
	public Result update(VerificationCode code) {
		this.verificationCodeDao.save(code);
		return new SuccessResult("Code updated !");
	}

}
