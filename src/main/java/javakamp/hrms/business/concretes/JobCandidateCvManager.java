package javakamp.hrms.business.concretes;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javakamp.hrms.business.abstracts.ImageService;
import javakamp.hrms.business.abstracts.JobCandidateCvService;
import javakamp.hrms.business.abstracts.JobExperienceService;
import javakamp.hrms.business.abstracts.LanguageService;
import javakamp.hrms.business.abstracts.SchoolService;
import javakamp.hrms.business.abstracts.SocialNetworkService;
import javakamp.hrms.core.utulities.results.Result;
import javakamp.hrms.core.utulities.results.SuccessResult;
import javakamp.hrms.entities.concretes.Image;
import javakamp.hrms.entities.concretes.JobExperience;
import javakamp.hrms.entities.concretes.Language;
import javakamp.hrms.entities.concretes.School;
import javakamp.hrms.entities.concretes.SocialNetwork;
import javakamp.hrms.entities.dtos.JobCandidateCvDto;

@Service
public class JobCandidateCvManager implements JobCandidateCvService {
	
	private SchoolService schoolService;
    private LanguageService languageService;
    private JobExperienceService jobExperinceService;
    private SocialNetworkService socialNetworkService;
    private ImageService imageService;
    private ModelMapper modelMapper;
	
	
	
	@Autowired
	public JobCandidateCvManager(SchoolService schoolService, LanguageService languageService,
			JobExperienceService jobExperinceService, SocialNetworkService socialNetworkService,
			ImageService imageService,ModelMapper modelMapper) {
		super();
		this.schoolService = schoolService;
		this.languageService = languageService;
		this.jobExperinceService = jobExperinceService;
		this.socialNetworkService = socialNetworkService;
		this.imageService = imageService;
		this.modelMapper = modelMapper;
	}




	@Override
	public Result add(JobCandidateCvDto jobCandidateCvDto,MultipartFile multipartFile) {
		
		School school = modelMapper.map(jobCandidateCvDto.schools, School.class);
		Language language = modelMapper.map(jobCandidateCvDto.languages, Language.class);
		JobExperience jobExperience = modelMapper.map(jobCandidateCvDto.jobExperiences, JobExperience.class);
		SocialNetwork socialNetwork = modelMapper.map(jobCandidateCvDto.socialNetworks, SocialNetwork.class);
		Image image = modelMapper.map(jobCandidateCvDto.image, Image.class);
		
		
		
		schoolService.add(school);
		languageService.add(language);
		jobExperinceService.add(jobExperience);
		socialNetworkService.add(socialNetwork);
		imageService.add(image, multipartFile);
		
		return new SuccessResult("Eklendi");
	}

}
