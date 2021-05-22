package javakamp.hrms.business.abstracts;

import java.util.List;

import javakamp.hrms.entities.concretes.Job;

public interface JobService {

	void add(Job job);

	void update(Job job);

	void delete(Job job);

	List<Job> getAll();

}
