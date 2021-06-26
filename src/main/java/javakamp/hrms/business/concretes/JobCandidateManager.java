package javakamp.hrms.business.concretes;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javakamp.hrms.business.abstracts.JobCandidateService;
import javakamp.hrms.core.adapters.MernisValidationService;
import javakamp.hrms.core.utulities.results.DataResult;
import javakamp.hrms.core.utulities.results.ErrorDataResult;
import javakamp.hrms.core.utulities.results.ErrorResult;
import javakamp.hrms.core.utulities.results.Result;
import javakamp.hrms.core.utulities.results.SuccessDataResult;
import javakamp.hrms.core.utulities.results.SuccessResult;
import javakamp.hrms.dataAccess.abstracts.JobCandidateDao;
import javakamp.hrms.entities.concretes.JobCandidate;
import lombok.var;


@Service
public class JobCandidateManager implements JobCandidateService {
	
	private JobCandidateDao jobCandidateDao;
	private MernisValidationService mernisValidationService;

	@Autowired
	public JobCandidateManager(JobCandidateDao jobCandidateDao, MernisValidationService mernisValidationService) {
		super();
		this.jobCandidateDao = jobCandidateDao;
		this.mernisValidationService = mernisValidationService;

	}

	@Override
	public Result add(JobCandidate jobCandidate) {

		if (!checkIfEmailExists(jobCandidate.getEmail())) {
			return new ErrorResult("Email already exist...");
		}
		if (!checkIfNationalityId(jobCandidate.getIdentificationNo())) {
			return new ErrorResult("Nationality already exist...");
		}
		if(!checkIfRealPerson(jobCandidate.getIdentificationNo(), jobCandidate.getFirstName(), jobCandidate.getLastName(), jobCandidate.getBirthDate())) {
			return new ErrorResult("Gerçek kişi değil...");
		}

		jobCandidateDao.save(jobCandidate);
		return new SuccessResult("Eklendi");
	}

	@Override
	public Result update(JobCandidate jobCandidate) {
		jobCandidateDao.save(jobCandidate);
		return new SuccessResult("Güncellendi");
	}

	@Override
	public DataResult<List<JobCandidate>> getAll() {
		var result = jobCandidateDao.findAll();
		return new SuccessDataResult<>(result, "Data Listelendi");
	}

	@Override
	public DataResult<JobCandidate> getById(int userId) {
		var result = jobCandidateDao.getById(userId);
		if (result == null) {
			return new ErrorDataResult<>("kullanıcı bulunamadı");
		}
		return new SuccessDataResult<>(result, "kullanıcı listelendi");
				
	}

	private boolean checkIfEmailExists(String email) {
		if (this.jobCandidateDao.findByEmail(email) != null) {
			return false;
		}
		return true;

	}

	private boolean checkIfNationalityId(String nationalityId) {
		if (this.jobCandidateDao.findByIdentificationNo(nationalityId) != null) {
			return false;
		}
		return true;
	}
	
	private boolean checkIfRealPerson(String nationalId, String firstName, String lastName, LocalDate birthDate) {

		if (mernisValidationService.validateByMernis(nationalId, firstName, lastName, birthDate)) {
			return true;
		}
		return false;
	}

}

