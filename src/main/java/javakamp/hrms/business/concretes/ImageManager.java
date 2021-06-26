package javakamp.hrms.business.concretes;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javakamp.hrms.business.abstracts.ImageService;
import javakamp.hrms.core.imageUploads.ImageUploadService;
import javakamp.hrms.core.utulities.results.DataResult;
import javakamp.hrms.core.utulities.results.ErrorDataResult;
import javakamp.hrms.core.utulities.results.Result;
import javakamp.hrms.core.utulities.results.SuccessDataResult;
import javakamp.hrms.core.utulities.results.SuccessResult;
import javakamp.hrms.dataAccess.abstracts.ImageDao;
import javakamp.hrms.entities.concretes.Image;
import lombok.var;

@Service
public class ImageManager implements ImageService {
	
	private ImageDao imageDao;
	private ImageUploadService imageUplodService;
	@Autowired
	public ImageManager(ImageDao imageDao,ImageUploadService imageUplodService) {
		super();
		this.imageDao = imageDao;
		this.imageUplodService=imageUplodService;
	}

	@Override
	public Result add(Image image,MultipartFile multipartFile) {
		Map<String,String> uploadImage = this.imageUplodService.uploadImageFile(multipartFile).getData();
		image.setUrl(uploadImage.get("url"));
		this.imageDao.save(image);
		return new SuccessResult("Image has been added.");
	}

	@Override
	public Result update(Image image,MultipartFile multipartFile) {
		Map<String,String> uploadImage = this.imageUplodService.uploadImageFile(multipartFile).getData();
		image.setUrl(uploadImage.get("url"));
		this.imageDao.save(image);
		return new SuccessResult("Image has been updated.");
	}

	@Override
	public DataResult<Image> findById(int id) {
		var result = this.imageDao.findById(id);
		if(result==null) {
			return new ErrorDataResult<>("Bulunamadı");
		}
		
		return new SuccessDataResult<>(result,"resim getirildi");
	}

	@Override
	public DataResult<List<Image>> findAll() {
		var result = imageDao.findAll();
		return new SuccessDataResult<>(result,"resimler getirildi");
	}

}
