package javakamp.hrms.core.imageUploads;

import java.util.Map;

import org.springframework.web.multipart.MultipartFile;

import javakamp.hrms.core.utulities.results.DataResult;

public interface ImageUploadService {
	
	DataResult<Map> uploadImageFile(MultipartFile imageFile);

}
