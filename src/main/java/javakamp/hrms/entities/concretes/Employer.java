package javakamp.hrms.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javakamp.hrms.core.entities.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = false)
@Data
@PrimaryKeyJoinColumn(name="id",referencedColumnName = "id")
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "employers")
public class Employer extends User{

	

	@Column(name = "company_name")
	private String companyName;

	@Column(name = "web_address")
	private String webAddress;

	@Column(name = "phone_number")
	private String phoneNumber;

	@Column(name = "create_date")
	private LocalDate createDate = LocalDate.now();
	
	@Column(name = "search_status")
	private boolean searchStatus;
	
	@JsonIgnore
    @Column(name="is_email_verified",columnDefinition = "boolean default false")
	private Boolean isEmailVerified;

	@JsonIgnore
    @Column(name="is_verified_by_emlopyee",columnDefinition = "boolean default false")
	private Boolean isVerifiedByEmlopyee;
	
	@Column(name = "is_active",columnDefinition = "boolean default false")
	@JsonIgnore
	private Boolean isActive;

	
}