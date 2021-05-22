package javakamp.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javakamp.hrms.business.abstracts.EmployerService;
import javakamp.hrms.dataAccess.abstracts.EmployerDao;
import javakamp.hrms.entities.concretes.Employer;

@Service
public class EmployerManager implements EmployerService {

	private EmployerDao employerDao;

	@Autowired
	public EmployerManager(EmployerDao employerDao) {
		super();
		this.employerDao = employerDao;
	}

	@Override
	public void add(Employer employer) {
		this.employerDao.save(employer);
	}

	@Override
	public void update(Employer employer) {
		this.employerDao.save(employer);
	}

	@Override
	public void delete(Employer employer) {
		this.employerDao.delete(employer);
	}

	@Override
	public List<Employer> getAll() {
		return this.employerDao.findAll();
	}

}
