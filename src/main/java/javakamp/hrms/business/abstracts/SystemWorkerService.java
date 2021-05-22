package javakamp.hrms.business.abstracts;

import java.util.List;

import javakamp.hrms.entities.concretes.SystemWorker;

public interface SystemWorkerService {

	void add(SystemWorker systemWorker);

	void update(SystemWorker systemWorker);

	void delete(SystemWorker systemWorker);

	List<SystemWorker> getAll();
}
