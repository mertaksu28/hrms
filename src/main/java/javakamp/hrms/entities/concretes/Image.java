package javakamp.hrms.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "images")
public class Image {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "url")
	private String url;

	@Column(name = "created_date")
	@JsonIgnore
	private LocalDate createdAt = LocalDate.now();

	@Column(name = "is_active", columnDefinition = "boolean default true")
	private Boolean isActive = true;

	@Column(name = "is_deleted", columnDefinition = "boolean default false")
	@JsonIgnore
	private Boolean isDeleted = false;

	@OneToOne(optional = false, fetch = FetchType.LAZY)
	@JsonIgnore
	@JoinColumn(name = "job_candidate_id")
	private JobCandidate jobCandidate;

}
