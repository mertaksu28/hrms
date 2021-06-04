package javakamp.hrms.business.abstracts;

import java.util.List;

import javakamp.hrms.core.utulities.results.DataResult;
import javakamp.hrms.core.utulities.results.Result;
import javakamp.hrms.entities.concretes.Employer;

public interface EmployerService {

	Result add(Employer employer);

	DataResult<List<Employer>> getAll();
}
