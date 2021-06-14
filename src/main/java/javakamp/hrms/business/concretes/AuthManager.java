package javakamp.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javakamp.hrms.business.abstracts.AuthService;
import javakamp.hrms.business.abstracts.EmployeeService;
import javakamp.hrms.business.abstracts.EmployerService;
import javakamp.hrms.business.abstracts.JobCandidateService;
import javakamp.hrms.business.abstracts.UserService;
import javakamp.hrms.core.entities.User;
import javakamp.hrms.core.utulities.results.DataResult;
import javakamp.hrms.core.utulities.results.ErrorDataResult;
import javakamp.hrms.core.utulities.results.Result;
import javakamp.hrms.core.utulities.results.SuccessDataResult;
import javakamp.hrms.entities.concretes.Employee;
import javakamp.hrms.entities.concretes.Employer;
import javakamp.hrms.entities.concretes.JobCandidate;
import javakamp.hrms.entities.dtos.UserLoginDto;
import lombok.var;
@Service
public class AuthManager implements AuthService {
	
	private EmployeeService employeeService;
	private EmployerService employerService;
	private JobCandidateService jobCandidateService;
	private UserService userService;
	@Autowired
	public AuthManager(EmployeeService employeeService, EmployerService employerService,
			JobCandidateService jobCandidateService, UserService userService) {
		super();
		this.employeeService = employeeService;
		this.employerService = employerService;
		this.jobCandidateService = jobCandidateService;
		this.userService = userService;
	}

	@Override
	public DataResult<Employee> employeeRegister(Employee employee) {
		this.employeeService.add(employee);
		return new SuccessDataResult<Employee>(employee,"Kayıt edildi");
	}

	@Override
	public DataResult<Employer> employerRegister(Employer employer) {
		this.employerService.add(employer);
		return new SuccessDataResult<Employer>(employer, "Kayıt edildi");
	}

	@Override
	public DataResult<JobCandidate> jobCandidateRegister(JobCandidate candidate) {
		this.jobCandidateService.add(candidate);
		return new SuccessDataResult<JobCandidate>(candidate, "Kayıt Edildi");
	}
	// ?
	@Override
	public DataResult<User> login(UserLoginDto userLoginDto) {
		var userCheck = userService.getByEmail(userLoginDto.getEmail());
		if (userCheck.getData()==null) {
			return new ErrorDataResult<>("Giriş olumsuz");
		}
		
		return new SuccessDataResult<User>(userCheck.getData(), "Giriş Olumlu");
	}

	@Override
	public Result userExists(String email) {
		// TODO Auto-generated method stub
		return null;
	}

}
