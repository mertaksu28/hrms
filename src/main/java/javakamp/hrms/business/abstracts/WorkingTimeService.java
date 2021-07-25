package javakamp.hrms.business.abstracts;

import java.util.List;

import javakamp.hrms.core.utulities.results.DataResult;
import javakamp.hrms.core.utulities.results.Result;
import javakamp.hrms.entities.concretes.WorkingTime;

public interface WorkingTimeService {
	DataResult<List<WorkingTime>> getAll();

	Result add(WorkingTime workingTime);

}
