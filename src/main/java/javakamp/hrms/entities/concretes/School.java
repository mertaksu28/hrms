package javakamp.hrms.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "schools")
public class School {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "school_name")
	private String schoolName;

	@Column(name = "school_department")
	private String schoolDepartment;

	@Column(name = "start_date")
	private LocalDate startDate;

	@Column(name = "graduation_date")
	private LocalDate graduationDate;

	@Column(name = "is_gaduate")
	private boolean isGaduate;

	@Column(name = "create_date")
	@JsonIgnore
	private LocalDate createDate = LocalDate.now();

	@Column(name = "is_Active")
	@JsonIgnore
	private boolean isActive;

	// bağlantılar

	@ManyToOne()
	@JsonIgnore
	@JoinColumn(name = "job_candidate_id")
	private JobCandidate jobCandidate;

}
