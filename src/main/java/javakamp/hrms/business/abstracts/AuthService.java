package javakamp.hrms.business.abstracts;

import javakamp.hrms.core.entities.User;
import javakamp.hrms.core.utulities.results.DataResult;
import javakamp.hrms.core.utulities.results.Result;
import javakamp.hrms.entities.concretes.Employee;
import javakamp.hrms.entities.concretes.Employer;
import javakamp.hrms.entities.concretes.JobCandidate;
import javakamp.hrms.entities.dtos.UserLoginDto;

public interface AuthService {
	
	DataResult<Employee> employeeRegister(Employee employee);
	DataResult<Employer> employerRegister(Employer employer);
	DataResult<JobCandidate> jobCandidateRegister(JobCandidate candidate);
	DataResult<User> login(UserLoginDto userLoginDto);
	Result userExists(String email); //?

}
