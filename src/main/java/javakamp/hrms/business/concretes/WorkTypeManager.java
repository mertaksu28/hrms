package javakamp.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javakamp.hrms.business.abstracts.WorkTypeService;
import javakamp.hrms.core.utulities.results.DataResult;
import javakamp.hrms.core.utulities.results.Result;
import javakamp.hrms.core.utulities.results.SuccessDataResult;
import javakamp.hrms.core.utulities.results.SuccessResult;
import javakamp.hrms.dataAccess.abstracts.WorkTypeDao;
import javakamp.hrms.entities.concretes.WorkType;

@Service
public class WorkTypeManager implements WorkTypeService {

    private WorkTypeDao workTypeDao;
    @Autowired
    public WorkTypeManager(WorkTypeDao workTypeDao) {
        super();
        this.workTypeDao = workTypeDao;
    }

    @Override
    public DataResult<List<WorkType>> getAll() {
        return new SuccessDataResult<List<WorkType>>(this.workTypeDao.findAll(),"Data listelendi.");
    }

    @Override
    public Result add(WorkType workType) {
        this.workTypeDao.save(workType);
        return new SuccessResult("Çalışma tipleri eklendi");
    }


}
