package javakamp.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javakamp.hrms.business.abstracts.JobAdvertisementService;
import javakamp.hrms.core.utulities.results.DataResult;
import javakamp.hrms.core.utulities.results.Result;
import javakamp.hrms.entities.concretes.JobAdvertisement;

@RestController
@RequestMapping("/api/jobadvertisement")
public class JobAdvertisementsController {
	
	private JobAdvertisementService adveJobAdvertisementService;
	
	@Autowired
	public JobAdvertisementsController(JobAdvertisementService adveJobAdvertisementService) {
		super();
		this.adveJobAdvertisementService = adveJobAdvertisementService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<JobAdvertisement>> getAll(){
		return this.adveJobAdvertisementService.getAll();
	}
	@PostMapping("/add")
	public Result add(JobAdvertisement jobAdvertisement) {
		return this.adveJobAdvertisementService.add(jobAdvertisement);
	}

}
