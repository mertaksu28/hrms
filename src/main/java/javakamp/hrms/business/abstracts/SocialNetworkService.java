package javakamp.hrms.business.abstracts;

import java.util.List;

import javakamp.hrms.core.utulities.results.DataResult;
import javakamp.hrms.core.utulities.results.Result;
import javakamp.hrms.entities.concretes.SocialNetwork;

public interface SocialNetworkService {
	
	Result add(SocialNetwork socialNetwork);
    Result update(SocialNetwork socialNetwork);
    DataResult<SocialNetwork> findById(int id);
    DataResult<List<SocialNetwork>> findAll();

}
