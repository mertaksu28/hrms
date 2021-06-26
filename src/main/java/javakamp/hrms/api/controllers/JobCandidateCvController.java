package javakamp.hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;


import javakamp.hrms.business.abstracts.JobCandidateCvService;
import javakamp.hrms.business.abstracts.JobCandidateService;
import javakamp.hrms.core.utulities.results.Result;
import javakamp.hrms.entities.concretes.JobCandidate;
import javakamp.hrms.entities.dtos.JobCandidateCvDto;

@RestController
@RequestMapping("/api/auth")
public class JobCandidateCvController {

	private JobCandidateCvService jobCandidateCvService;
	private JobCandidateService jobCandidateService;
	

	@Autowired
	public JobCandidateCvController(JobCandidateCvService jobCandidateCvService,JobCandidateService jobCandidateService) {
		super();
		this.jobCandidateCvService = jobCandidateCvService;
		this.jobCandidateService = jobCandidateService;
	}
	
	@PostMapping("/addCv")
	public Result add(@RequestParam(value = "id") int id,@RequestBody JobCandidateCvDto jobCandidateCvDto,@RequestParam(value = "multipartFile") MultipartFile multipartFile){
		
		JobCandidate jobCandidate = jobCandidateService.getById(id).getData();
		
		jobCandidateCvDto.schools.setJobCandidate(jobCandidate);
		jobCandidateCvDto.languages.setJobCandidate(jobCandidate);
		jobCandidateCvDto.jobExperiences.setJobCandidate(jobCandidate);
		jobCandidateCvDto.socialNetworks.setJobCandidate(jobCandidate);
		jobCandidateCvDto.image.setJobCandidate(jobCandidate);
		
		
		return this.jobCandidateCvService.add(jobCandidateCvDto,multipartFile);
		
	}
	

}
