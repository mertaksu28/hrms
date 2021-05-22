package javakamp.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javakamp.hrms.business.abstracts.SystemWorkerService;
import javakamp.hrms.dataAccess.abstracts.SystemWorkerDao;
import javakamp.hrms.entities.concretes.SystemWorker;

@Service
public class SystemWorkerManager implements SystemWorkerService {

	private SystemWorkerDao systemWorkerDao;

	@Autowired
	public SystemWorkerManager(SystemWorkerDao systemWorkerDao) {
		super();
		this.systemWorkerDao = systemWorkerDao;
	}

	@Override
	public void add(SystemWorker systemWorker) {
		this.systemWorkerDao.save(systemWorker);
	}

	@Override
	public void update(SystemWorker systemWorker) {
		this.systemWorkerDao.save(systemWorker);
	}

	@Override
	public void delete(SystemWorker systemWorker) {
		this.systemWorkerDao.delete(systemWorker);
	}

	@Override
	public List<SystemWorker> getAll() {
		return this.systemWorkerDao.findAll();
	}

}
