package javakamp.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javakamp.hrms.business.abstracts.LanguageService;
import javakamp.hrms.core.utulities.results.DataResult;
import javakamp.hrms.core.utulities.results.ErrorDataResult;
import javakamp.hrms.core.utulities.results.Result;
import javakamp.hrms.core.utulities.results.SuccessDataResult;
import javakamp.hrms.core.utulities.results.SuccessResult;
import javakamp.hrms.dataAccess.abstracts.LanguageDao;
import javakamp.hrms.entities.concretes.Language;
import lombok.var;

@Service
public class LanguageManager implements LanguageService {
	
	private LanguageDao languageDao;
	@Autowired
	public LanguageManager(LanguageDao languageDao) {
			super();
			this.languageDao = languageDao;
		}

	@Override
	public Result add(Language language) {
		languageDao.save(language);
		return new SuccessResult("Eklendi");
	}

	@Override
	public Result update(Language language) {
		languageDao.save(language);
		return new SuccessResult("Güncellendi");
	}

	@Override
	public DataResult<Language> findById(int id) {
		var result = languageDao.findById(id).get();
		if (result == null) {
			return new ErrorDataResult<>("bulunamadı");
		}
		return new SuccessDataResult<>(result,"Getirildi");
	}

	@Override
	public DataResult<List<Language>> findAll() {
		var result = languageDao.findAll();
		if (result == null) {
			return new ErrorDataResult<>("bulunamadı");
		}
		return new SuccessDataResult<>(result,"Getirildi");
	}

}
