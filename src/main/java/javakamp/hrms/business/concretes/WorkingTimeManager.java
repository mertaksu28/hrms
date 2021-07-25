package javakamp.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javakamp.hrms.business.abstracts.WorkingTimeService;
import javakamp.hrms.core.utulities.results.DataResult;
import javakamp.hrms.core.utulities.results.Result;
import javakamp.hrms.core.utulities.results.SuccessDataResult;
import javakamp.hrms.core.utulities.results.SuccessResult;
import javakamp.hrms.dataAccess.abstracts.WorkingTimeDao;
import javakamp.hrms.entities.concretes.WorkingTime;



@Service
public class WorkingTimeManager implements WorkingTimeService {
	
	private WorkingTimeDao workingTimeDao;
    @Autowired
    public WorkingTimeManager(WorkingTimeDao workingTimeDao) {
        super();
        this.workingTimeDao = workingTimeDao;
    }

	@Override
	public DataResult<List<WorkingTime>> getAll() {
		return new SuccessDataResult<List<WorkingTime>>(workingTimeDao.findAll(),"Data listelendi.");
	}

	@Override
	public Result add(WorkingTime workingTime) {
		this.workingTimeDao.save(workingTime);
        return new SuccessResult("Çalışma zamanı eklendi");
	}



}
