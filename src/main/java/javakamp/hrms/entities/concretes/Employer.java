package javakamp.hrms.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import javakamp.hrms.core.entities.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = false)
@Data
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
	private LocalDate createDate;

	@Column(name = "search_status")
	private boolean searchStatus;

	
}