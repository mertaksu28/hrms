package javakamp.hrms.entities.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "employees")
public class Employee {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;

	@Column(name = "userid")
	private int userId;

	@Column(name = "jobid")
	private int jobId;

	@Column(name = "firstname")
	private String firstName;

	@Column(name = "lastname")
	private String lastName;

	@Column(name = "identitynumber")
	private String identityNumber;

	@Column(name = "dateofbirth")
	private Date dateOfBirth;

}