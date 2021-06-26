package javakamp.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javakamp.hrms.business.abstracts.JobExperienceService;
import javakamp.hrms.core.utulities.results.DataResult;
import javakamp.hrms.core.utulities.results.ErrorDataResult;
import javakamp.hrms.core.utulities.results.Result;
import javakamp.hrms.core.utulities.results.SuccessDataResult;
import javakamp.hrms.core.utulities.results.SuccessResult;
import javakamp.hrms.dataAccess.abstracts.JobExperienceDao;
import javakamp.hrms.entities.concretes.JobExperience;
import lombok.var;

@Service
public class JobExperienceManager implements JobExperienceService {
	
	private JobExperienceDao jobExperienceDao;
	@Autowired
	public JobExperienceManager(JobExperienceDao jobExperienceDao) {
		super();
		this.jobExperienceDao = jobExperienceDao;
	}

		@Override
		public Result add(JobExperience jobExperience) {
			var result = jobExperienceDao.save(jobExperience);
			return new SuccessResult("Eklendi");
		}

		@Override
		public Result update(JobExperience jobExperience) {
			var result = jobExperienceDao.save(jobExperience);
			return new SuccessResult("Güncellendi");
		}

		@Override
		public DataResult<JobExperience> findById(int id) {
			var result = jobExperienceDao.findById(id);
			if(result==null) {
				return new ErrorDataResult<>("Bulunamadı");
			}
			
			return new SuccessDataResult<>(result,"Getirildi");
		}

		@Override
		public DataResult<List<JobExperience>> findAll() {
			var result = jobExperienceDao.findAll();
			if(result==null) {
				return new ErrorDataResult<>("Bulunamadı");
			}
			
			return new SuccessDataResult<>(result,"Data Getirildi");
		}

}
