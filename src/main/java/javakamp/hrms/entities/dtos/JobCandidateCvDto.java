package javakamp.hrms.entities.dtos;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javakamp.hrms.entities.concretes.Image;
import javakamp.hrms.entities.concretes.JobCandidate;
import javakamp.hrms.entities.concretes.JobExperience;
import javakamp.hrms.entities.concretes.Language;
import javakamp.hrms.entities.concretes.School;
import javakamp.hrms.entities.concretes.SocialNetwork;

public class JobCandidateCvDto {
	
	@JsonIgnore
	public JobCandidate jobCandidate;
	
	public School schools;
	
	public SocialNetwork socialNetworks;
	
	public Language languages;
	
	public JobExperience jobExperiences;

	@JsonIgnore
	public Image image;

}
