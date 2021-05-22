package javakamp.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "employers")
public class Employer {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;

	@Column(name = "userid")
	private int userId;

	@Column(name = "companyname")
	private String companyName;

	@Column(name = "website")
	private String webSite;

	@Column(name = "phonenumber")
	private String phoneNumber;

}
