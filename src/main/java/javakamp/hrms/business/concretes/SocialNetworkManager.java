package javakamp.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javakamp.hrms.business.abstracts.SocialNetworkService;
import javakamp.hrms.core.utulities.results.DataResult;
import javakamp.hrms.core.utulities.results.ErrorDataResult;
import javakamp.hrms.core.utulities.results.Result;
import javakamp.hrms.core.utulities.results.SuccessDataResult;
import javakamp.hrms.core.utulities.results.SuccessResult;
import javakamp.hrms.dataAccess.abstracts.SocialNetworkDao;
import javakamp.hrms.entities.concretes.SocialNetwork;
import lombok.var;

@Service
public class SocialNetworkManager implements SocialNetworkService{
	
	private SocialNetworkDao socialNetworkDao;

	@Autowired
	public SocialNetworkManager(SocialNetworkDao socialNetworkDao) {
		super();
		this.socialNetworkDao = socialNetworkDao;
	}

	@Override
	public Result add(SocialNetwork socialNetwork) {
		socialNetworkDao.save(socialNetwork);
		return new SuccessResult("Sosyal ağlar eklendi");
	}

	@Override
	public Result update(SocialNetwork socialNetwork) {
		socialNetworkDao.save(socialNetwork);
		return new SuccessResult("Sosyal ağlar güncellendi");
	}

	@Override
	public DataResult<SocialNetwork> findById(int id) {
		var result = socialNetworkDao.findById(id).get();
		if (result==null) {
			return new ErrorDataResult<>("bulunamadı");
		}
		return new SuccessDataResult<>(result,"Data getirildi");
	}

	@Override
	public DataResult<List<SocialNetwork>> findAll() {
		var result = socialNetworkDao.findAll();
		if (result==null) {
			return new ErrorDataResult<>("bulunamadı");
		}
		return new SuccessDataResult<>(result,"Data getirildi");
	}

}
