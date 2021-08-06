package javakamp.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javakamp.hrms.business.abstracts.JobAdvertisementService;
import javakamp.hrms.core.utulities.results.DataResult;
import javakamp.hrms.core.utulities.results.ErrorResult;
import javakamp.hrms.core.utulities.results.Result;
import javakamp.hrms.core.utulities.results.SuccessDataResult;
import javakamp.hrms.core.utulities.results.SuccessResult;
import javakamp.hrms.dataAccess.abstracts.JobAdvertisementDao;
import javakamp.hrms.entities.concretes.JobAdvertisement;
import lombok.var;

@Service
public class JobAdvertisementManager implements JobAdvertisementService {

	private JobAdvertisementDao jobAdvertisementDao;

	@Autowired
	public JobAdvertisementManager(JobAdvertisementDao jobAdvertisementDao) {
		super();
		this.jobAdvertisementDao = jobAdvertisementDao;
	}

	@Override
	public DataResult<List<JobAdvertisement>> findAll() {
		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.findAll(),
				"İş İlanları Listelendi");
	}

	@Override
	public Result add(JobAdvertisement jobAdvertisement) {
		this.jobAdvertisementDao.save(jobAdvertisement);
		return new SuccessResult("İş İlanı Eklendi");
	}

	@Override
	public Result update(JobAdvertisement jobAdvertisement) {
		this.jobAdvertisementDao.save(jobAdvertisement);
		return new SuccessResult("İş ilanı güncellendi");
	}

	@Override
	public Result delete(int id) {
		this.jobAdvertisementDao.deleteById(id);
		return new SuccessResult("İş ilanı silindi");
	}

	@Override
	public DataResult<List<JobAdvertisement>> findById(int id) {
		var result = this.jobAdvertisementDao.findById(id);
		return new SuccessDataResult<List<JobAdvertisement>>(result + "İş ilanı getirili");
	}

	@Override
	public Result confirmed(int id) {
		try {
			JobAdvertisement current = this.jobAdvertisementDao.getOne(id);
			
			current.setConfirmed(true);
			
			this.jobAdvertisementDao.save(current);
			return new SuccessResult("İş ilanı onaylandı.");
		} catch (Exception e) {
			return new ErrorResult("İş ilanı onaylanamadı.");
		}
	}

}
