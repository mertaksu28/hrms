package javakamp.hrms.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Size;

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
@Table(name = "job_candidates")
public class JobCandidate extends User {

	@Size(min = 11, max = 11, message = "11 karakterli olmalıdır")
	@NotEmpty(message = "kimlik numarası boş olamaz")
	@Column(name = "identification_no")
	private String identificationNo;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "phone_number")
	private String phoneNumber;

	@PastOrPresent(message = "doğum tarihi bugünden önce olmalıdır")
	@Column(name = "birth_date")
	private LocalDate birthDate;

	@FutureOrPresent(message = "oluşturulma tarihi bugünden önce olamaz")
	@Column(name = "create_date")
	private LocalDate createDate;

	@Column(name = "search_status")
	private boolean searchStatus;

}
