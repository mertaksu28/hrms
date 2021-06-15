package javakamp.hrms.core.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;

public class AppConfig {

	@Bean
	public ModelMapper modelMapper() {

		return new ModelMapper();
	}

	@Bean
	public Cloudinary cloudinary() {

		return new Cloudinary(ObjectUtils.asMap("cloud_name", "dvhjahgug", "api_key", "668249166956188", "api_secret",
				"CZ32kZTIRHqwBT5BIJrEd3Y9Fho"));

	}
}
