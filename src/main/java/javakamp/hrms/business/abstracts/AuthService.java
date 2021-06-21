package javakamp.hrms.business.abstracts;

import javakamp.hrms.core.entities.User;
import javakamp.hrms.core.utulities.results.DataResult;
import javakamp.hrms.core.utulities.results.Result;
import javakamp.hrms.entities.concretes.Employee;
import javakamp.hrms.entities.concretes.Employer;
import javakamp.hrms.entities.concretes.JobCandidate;
import javakamp.hrms.entities.dtos.EmployerRegisterDto;
import javakamp.hrms.entities.dtos.JobCandidateRegisterDto;
import javakamp.hrms.entities.dtos.UserLoginDto;

public interface AuthService {


	Result employerRegister(EmployerRegisterDto employerRegisterDto);

	Result jobCandidateRegister(JobCandidateRegisterDto jobCandidateRegisterDto);

	DataResult<User> login(UserLoginDto userForLoginDto);

	Result userExists(String email);

	Result verifyEmail(int user_id, String activationCode);

}