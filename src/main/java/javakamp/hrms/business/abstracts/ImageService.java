package javakamp.hrms.business.abstracts;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import javakamp.hrms.core.utulities.results.DataResult;
import javakamp.hrms.core.utulities.results.Result;
import javakamp.hrms.entities.concretes.Image;

public interface ImageService {
	
	Result add(Image image,MultipartFile multipartFile);
    Result update(Image image,MultipartFile multipartFile);
    DataResult<Image> findById(int id);
    DataResult<List<Image>> findAll();

}
