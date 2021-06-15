package javakamp.hrms.business.abstracts;

import java.util.List;

import javakamp.hrms.core.utulities.results.DataResult;
import javakamp.hrms.core.utulities.results.Result;
import javakamp.hrms.entities.concretes.Employee;

public interface EmployeeService {

	Result add(Employee employee);
    Result update(Employee employee);
    DataResult<Employee> findById(int userId);
    DataResult<List<Employee>> findAll();
	
}
