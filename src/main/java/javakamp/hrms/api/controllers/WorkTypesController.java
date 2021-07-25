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

import javakamp.hrms.business.abstracts.WorkTypeService;
import javakamp.hrms.core.utulities.results.DataResult;
import javakamp.hrms.core.utulities.results.Result;
import javakamp.hrms.entities.concretes.WorkType;

@CrossOrigin
@RestController
@RequestMapping("/api/workTypes")
public class WorkTypesController {
	private WorkTypeService workTypeService;

	@Autowired
	public WorkTypesController(WorkTypeService workTypeService) {
		super();
		this.workTypeService = workTypeService;
	}

	@GetMapping("/getAll")
	public DataResult<List<WorkType>> getAll() {
		return this.workTypeService.getAll();
	}

	@PostMapping("/add")
	public Result add(@Valid @RequestBody WorkType workType) {
		return workTypeService.add(workType);

	}

}
