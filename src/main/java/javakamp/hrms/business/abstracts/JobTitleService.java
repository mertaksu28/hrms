package javakamp.hrms.business.abstracts;

import java.util.List;

import javakamp.hrms.core.utulities.results.DataResult;
import javakamp.hrms.core.utulities.results.Result;
import javakamp.hrms.entities.concretes.JobTitle;

public interface JobTitleService {
	
	Result add(JobTitle jobTitle);
    Result update(JobTitle jobTitle);
    Result delete(JobTitle jobTitle);
    DataResult<List<JobTitle>> findAll();
}
