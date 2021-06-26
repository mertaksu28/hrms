package javakamp.hrms.business.abstracts;

import java.util.List;

import javakamp.hrms.core.utulities.results.DataResult;
import javakamp.hrms.core.utulities.results.Result;
import javakamp.hrms.entities.concretes.JobExperience;

public interface JobExperienceService {
	
	Result add(JobExperience jobExperience);
    Result update(JobExperience jobExperience);
    DataResult<JobExperience> findById(int id);
    DataResult<List<JobExperience>> findAll();

}
