package javakamp.hrms.business.abstracts;

import java.util.List;

import javakamp.hrms.core.utulities.results.DataResult;
import javakamp.hrms.core.utulities.results.Result;
import javakamp.hrms.entities.concretes.Employer;

public interface EmployerService {

	Result add(Employer employer);
    Result update(Employer employer);
    DataResult<Employer> findById(int userId);
    DataResult<List<Employer>> findAll();
}
