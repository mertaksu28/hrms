package javakamp.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javakamp.hrms.business.abstracts.JobService;
import javakamp.hrms.dataAccess.abstracts.JobDao;
import javakamp.hrms.entities.concretes.Job;

@Service
public class JobManager implements JobService {

	private JobDao jobDao;

	@Autowired
	public JobManager(JobDao jobDao) {
		super();
		this.jobDao = jobDao;
	}

	@Override
	public void add(Job job) {
		this.jobDao.save(job);
	}

	@Override
	public void update(Job job) {
		this.jobDao.save(job);
	}

	@Override
	public void delete(Job job) {
		this.jobDao.delete(job);
	}

	@Override
	public List<Job> getAll() {
		return this.jobDao.findAll();
	}

}
