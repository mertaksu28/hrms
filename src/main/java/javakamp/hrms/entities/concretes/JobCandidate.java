package javakamp.hrms.entities.concretes;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.istack.Nullable;

import javakamp.hrms.core.entities.User;
import lombok.*;

@EqualsAndHashCode(callSuper = false)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "job_candidates")
public class JobCandidate extends User{

	@Size(min = 11,max = 11,message = "11 karakterli olmalıdır")
	@NotEmpty(message = "kimlik numarası boş olamaz")
	@Column(name = "identification_no")
	private String identificationNo;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "phone_number")
	private String phoneNumber;

	
	@Column(name = "birth_date")
	private LocalDate birthDate;

	
	@Column(name = "create_date")
	@JsonIgnore
	private LocalDate createDate = LocalDate.now();
	
	@Column(name="is_verified_by_email",columnDefinition = "boolean default false")
	private Boolean isEmailVerified;

	@Column(name = "search_status")
	private Boolean searchStatus;
	
	@Column(name = "is_active",columnDefinition = "boolean default false")
	@JsonIgnore
	private Boolean isActive;
	
	@JsonIgnore
	@OneToMany(mappedBy="jobCandidate")
	private List<JobExperience> jobExperiences;
	
	@JsonIgnore
	@OneToMany(mappedBy="jobCandidate")
	private List<Language> languages;
	
	@JsonIgnore
	@OneToMany(mappedBy="jobCandidate")
	private List<SocialNetwork> socialNetworks;
	
	@JsonIgnore
	@OneToMany(mappedBy="jobCandidate")
	private List<School> schools;
	
	
	@Nullable
	@JsonIgnore
	@OneToOne(mappedBy="jobCandidate",optional=true, fetch=FetchType.LAZY)
	private Image image;

}