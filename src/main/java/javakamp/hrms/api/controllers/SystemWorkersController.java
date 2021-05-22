package javakamp.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javakamp.hrms.business.abstracts.SystemWorkerService;
import javakamp.hrms.entities.concretes.SystemWorker;

@RestController
@RequestMapping("/api/systemusers")
public class SystemWorkersController {
	private SystemWorkerService systemWorkerService;

	@Autowired
	public SystemWorkersController(SystemWorkerService systemWorkerService) {
		super();
		this.systemWorkerService = systemWorkerService;
	}

	@GetMapping("/getall")
	public List<SystemWorker> getAll() {
		return systemWorkerService.getAll();
	}
}
