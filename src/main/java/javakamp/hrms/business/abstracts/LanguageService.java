package javakamp.hrms.business.abstracts;

import java.util.List;

import javakamp.hrms.core.utulities.results.DataResult;
import javakamp.hrms.core.utulities.results.Result;
import javakamp.hrms.entities.concretes.Language;

public interface LanguageService {
	
	Result add(Language language);
    Result update(Language language);
    DataResult<Language> findById(int id);
    DataResult<List<Language>> findAll();

}
