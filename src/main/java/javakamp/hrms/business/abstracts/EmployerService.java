package javakamp.hrms.business.abstracts;

import java.util.List;

import javakamp.hrms.entities.concretes.Employer;

public interface EmployerService {

	void add(Employer employer);

	void update(Employer employer);

	void delete(Employer employer);

	List<Employer> getAll();
}
