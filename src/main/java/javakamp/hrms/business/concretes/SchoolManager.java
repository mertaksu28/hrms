package javakamp.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javakamp.hrms.business.abstracts.SchoolService;
import javakamp.hrms.core.utulities.results.DataResult;
import javakamp.hrms.core.utulities.results.ErrorDataResult;
import javakamp.hrms.core.utulities.results.Result;
import javakamp.hrms.core.utulities.results.SuccessDataResult;
import javakamp.hrms.core.utulities.results.SuccessResult;
import javakamp.hrms.dataAccess.abstracts.SchoolDao;
import javakamp.hrms.entities.concretes.School;
import lombok.var;

@Service
public class SchoolManager implements SchoolService {

	private SchoolDao schoolDao;

	@Autowired
	public SchoolManager(SchoolDao schoolDao) {
		super();
		this.schoolDao = schoolDao;
	}

	@Override
	public Result add(School school) {
		schoolDao.save(school);
		return new SuccessResult("okul bilgileri eklendi");
	}

	@Override
	public Result update(School school) {
		schoolDao.save(school);
		return new SuccessResult("okul bilgileri güncellendi");
	}

	@Override
	public DataResult<School> findById(int id) {
		var result = schoolDao.findById(id).get();
		if (result==null) {
			return new ErrorDataResult<>("bulunamadı");
		}
		return new SuccessDataResult<>(result,"Okul getirildi");
	}

	@Override
	public DataResult<List<School>> findAll() {
		var result = schoolDao.findAll();
		if (result==null) {
			return new ErrorDataResult<>("bulunamadı");
		}
		return new SuccessDataResult<>(result,"Data getirildi");
	}
}
