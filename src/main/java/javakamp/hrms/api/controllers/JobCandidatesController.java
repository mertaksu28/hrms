package javakamp.hrms.api.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;

import javakamp.hrms.business.abstracts.JobCandidateService;
import javakamp.hrms.core.utulities.results.DataResult;
import javakamp.hrms.core.utulities.results.ErrorDataResult;
import javakamp.hrms.entities.concretes.JobCandidate;

@RestController
@RequestMapping("/api/jobcandidates")
public class JobCandidatesController {

	
private JobCandidateService candidateService;
	
	
	@Autowired
	public JobCandidatesController(JobCandidateService candidateService) {
		
		this.candidateService = candidateService;
	}
	
	
	@PostMapping("/add")
	public ResponseEntity<?> add(@Valid  @RequestBody JobCandidate candidate){
	
		
		return ResponseEntity.ok(candidateService.add(candidate));
		
	}
	
	
	@PostMapping("/getById")
	public DataResult<JobCandidate> getById(@RequestBody int userId){
		return this.candidateService.getById(userId);
	}
	
	@GetMapping("/getAll")
	public DataResult<List<JobCandidate>> getAll(){
		return this.candidateService.getAll();
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
