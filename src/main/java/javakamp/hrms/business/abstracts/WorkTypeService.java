package javakamp.hrms.business.abstracts;

import java.util.List;

import javakamp.hrms.core.utulities.results.DataResult;
import javakamp.hrms.core.utulities.results.Result;
import javakamp.hrms.entities.concretes.WorkType;

public interface WorkTypeService {
	DataResult<List<WorkType>>getAll();
	Result add(WorkType type);

}
