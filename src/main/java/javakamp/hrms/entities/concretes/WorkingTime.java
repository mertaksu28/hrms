package javakamp.hrms.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "working_time")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler", "jobAdvertisements" })
public class WorkingTime {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "working_time_name")
	private String workingTimeName;

	@OneToMany(mappedBy = "workingTime")
	private List<JobAdvertisement> jobAdvertisement;



}
