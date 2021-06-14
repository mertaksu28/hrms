package javakamp.hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javakamp.hrms.business.abstracts.AuthService;
import javakamp.hrms.core.utulities.results.Result;
import javakamp.hrms.entities.concretes.Employee;
import javakamp.hrms.entities.concretes.Employer;
import javakamp.hrms.entities.concretes.JobCandidate;
import javakamp.hrms.entities.dtos.UserLoginDto;

@RestController
@RequestMapping("/api/auth")
public class AuthsController {
	
	private AuthService authService;
	
	@Autowired
	public AuthsController(AuthService authService) {
		super();
		this.authService = authService;
	}
	
	@PostMapping("/employeeRegister")
	public Result employeeRegister(@RequestBody Employee employee) {
		return this.authService.employeeRegister(employee);
	}
	
	@PostMapping("/employerRegister")
	public Result employerRegister(@RequestBody Employer employer) {
		return this.authService.employerRegister(employer);
	}
	
	@PostMapping("/jobCandidateRegister")
	public Result jobCandidateRegister(@RequestBody JobCandidate candidate) {
		return this.authService.jobCandidateRegister(candidate);
	}
	@PostMapping("/userLogin")
	public Result userLogin(@RequestBody UserLoginDto dto) {
		return this.authService.login(dto);
	}

}
