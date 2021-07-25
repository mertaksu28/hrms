package javakamp.hrms.api.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javakamp.hrms.business.abstracts.WorkingTimeService;
import javakamp.hrms.core.utulities.results.DataResult;
import javakamp.hrms.core.utulities.results.Result;
import javakamp.hrms.entities.concretes.WorkingTime;

@CrossOrigin
@RestController
@RequestMapping("/api/workingTimes")
public class WorkingTimesController {
	private WorkingTimeService workingTimeService;

	@Autowired

	public WorkingTimesController(WorkingTimeService workingTimeService) {
		super();
		this.workingTimeService = workingTimeService;
	}

	@GetMapping("/getAll")
	public DataResult<List<WorkingTime>> getAll() {
		return this.workingTimeService.getAll();
	}
	
	@PostMapping("/add")
    public Result add(@Valid @RequestBody WorkingTime workingTime) {
        return workingTimeService.add(workingTime);

    }
}
