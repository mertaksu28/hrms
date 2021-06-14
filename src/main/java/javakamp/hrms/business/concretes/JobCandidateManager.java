package javakamp.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javakamp.hrms.business.abstracts.JobCandidateService;
import javakamp.hrms.core.utulities.results.DataResult;
import javakamp.hrms.core.utulities.results.Result;
import javakamp.hrms.core.utulities.results.SuccessDataResult;
import javakamp.hrms.core.utulities.results.SuccessResult;
import javakamp.hrms.dataAccess.abstracts.JobCandidateDao;
import javakamp.hrms.entities.concretes.JobCandidate;
@Service
public class JobCandidateManager implements JobCandidateService {
	
	private JobCandidateDao jobCandidateDao;
	
	@Autowired
	public JobCandidateManager(JobCandidateDao jobCandidateDao) {
		super();
		this.jobCandidateDao = jobCandidateDao;
	}

	@Override
	public Result add(JobCandidate jobCandidate) {
		this.jobCandidateDao.save(jobCandidate);
		return new SuccessResult("Eklendi");
	}

	@Override
	public Result update(JobCandidate jobCandidate) {
		this.jobCandidateDao.save(jobCandidate);
		return new SuccessResult("Güncellendi");
	}

	@Override
	public DataResult<JobCandidate> getById(int userId) {
		return new SuccessDataResult<JobCandidate>(this.jobCandidateDao.getById(userId), "Data getirildi");
	}

	@Override
	public DataResult<List<JobCandidate>> getAll() {
		return new SuccessDataResult<List<JobCandidate>>(this.jobCandidateDao.findAll(), "Data Listelendi");
	}

}
