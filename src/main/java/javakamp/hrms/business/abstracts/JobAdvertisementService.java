package javakamp.hrms.business.abstracts;

import java.util.List;

import javakamp.hrms.core.utulities.results.DataResult;
import javakamp.hrms.core.utulities.results.Result;
import javakamp.hrms.entities.concretes.JobAdvertisement;


public interface JobAdvertisementService {
	
	Result add(JobAdvertisement jobAdvertisement);
    Result update(JobAdvertisement jobAdvertisement);
    Result delete(JobAdvertisement jobAdvertisement);
    DataResult<JobAdvertisement> findById(int id);
    DataResult<List<JobAdvertisement>> findAll();
}
