package javakamp.hrms.business.abstracts;

import java.util.List;

import javakamp.hrms.core.utulities.results.DataResult;
import javakamp.hrms.core.utulities.results.Result;
import javakamp.hrms.entities.concretes.Location;

public interface LocationService {
	
	Result add(Location location);
    Result update(Location location);
    Result delete(Location location);
    DataResult<List<Location>> getAll();

}
