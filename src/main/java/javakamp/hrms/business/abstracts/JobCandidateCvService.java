package javakamp.hrms.business.abstracts;

import org.springframework.web.multipart.MultipartFile;

import javakamp.hrms.core.utulities.results.Result;
import javakamp.hrms.entities.dtos.JobCandidateCvDto;

public interface JobCandidateCvService {
	
	Result add(JobCandidateCvDto jobCandidateCvDto,MultipartFile multipartFile);

}
