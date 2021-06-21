package javakamp.hrms.api.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javakamp.hrms.business.abstracts.AuthService;
import javakamp.hrms.core.entities.User;
import javakamp.hrms.core.utulities.results.DataResult;
import javakamp.hrms.core.utulities.results.ErrorDataResult;
import javakamp.hrms.core.utulities.results.Result;
import javakamp.hrms.entities.dtos.EmployerRegisterDto;
import javakamp.hrms.entities.dtos.JobCandidateRegisterDto;
import javakamp.hrms.entities.dtos.UserLoginDto;


@RestController
@RequestMapping("/api/auth")
public class AuthsController {

	AuthService authService; 

	@Autowired
	public AuthsController(AuthService authService) {
		super();
		this.authService = authService;
	}
	
	@PostMapping("/jobCandidateRegister")
	public Result jobCandidateRegister(@RequestBody JobCandidateRegisterDto jobCandidateRegisterDto) {
		
		return this.authService.jobCandidateRegister(jobCandidateRegisterDto);
		
	}
	
	@PostMapping("/employerRegister")
	public Result employerRegister(@RequestBody EmployerRegisterDto employerRegisterDto) {
		
		return this.authService.employerRegister(employerRegisterDto);
		
	}
	
	@PostMapping("/userLogin")
	public DataResult<User> userLogin(@RequestBody UserLoginDto userForLoginDto){
		
		return this.authService.login(userForLoginDto);
	}
	
	@GetMapping("/verify") 
	public Result verify(int userId, String verificationCode) {
		
		return this.authService.verifyEmail(userId, verificationCode);
	}
	 
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorDataResult<Object> handleValidationException(MethodArgumentNotValidException exceptions){
		 Map<String,String> validationErrors = new HashMap<String, String>();
        for (FieldError fieldError: exceptions.getBindingResult().getFieldErrors()) {
            validationErrors.put(fieldError.getField(), fieldError.getDefaultMessage());
        }

        ErrorDataResult<Object> errors = new ErrorDataResult<Object>(validationErrors,"Doğrulama Hataları");

        return errors;

    }
	
	
	
}