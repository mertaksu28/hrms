package javakamp.hrms.business.abstracts;

import java.util.List;

import javakamp.hrms.core.utulities.results.DataResult;
import javakamp.hrms.core.utulities.results.Result;
import javakamp.hrms.entities.concretes.School;

public interface SchoolService {
	
	Result add(School school);
    Result update(School school);
    DataResult<School> findById(int id);
    DataResult<List<School>> findAll();

}
