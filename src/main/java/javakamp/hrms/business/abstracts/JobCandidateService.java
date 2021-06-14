package javakamp.hrms.business.abstracts;

import java.util.List;

import javakamp.hrms.core.utulities.results.DataResult;
import javakamp.hrms.core.utulities.results.Result;
import javakamp.hrms.entities.concretes.JobCandidate;

public interface JobCandidateService {
	
	Result add(JobCandidate jobCandidate);
	Result update(JobCandidate jobCandidate);
	DataResult<JobCandidate> getById(int userId);
	DataResult<List<JobCandidate>> getAll();

}
