package javakamp.hrms.entities.concretes;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "job_advertisements")
public class JobAdvertisement {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "employer_id")
	private int employer_id;

	@Column(name = "job_title_id")
	private int jobTitleId;
	
	@Column(name = "location_id")
	private int locationId;
	
	@Column(name = "open_position_count")
	private int openPositionCount;
	
	@Column(name = "experience")
	private String experience;
	
	@Column(name = "min_salary")
	private double minSalary;
	
	@Column(name = "max_salary")
	private double maxSalary;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "end_application_date")
	private LocalDate endApplicationDate;
	
	@Column(name = "create_date")
	@JsonIgnore
	private LocalDate createDate = LocalDate.now();
	
	@Column(name = "is_active")
	@JsonIgnore
	private Boolean isActive;
	
	@ManyToOne()
    @JoinColumn(name = "work_type_id")
    private WorkType workType;

    @ManyToOne()
    @JoinColumn(name = "working_time_id")
    private WorkingTime workingTime;

}
