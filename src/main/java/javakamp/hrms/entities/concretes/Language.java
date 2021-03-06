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
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "languages")
public class Language {

	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="language")
    private String language;

    @Min(value=1)
    @Max(value=5)
    @Column(name="level")
    private int level;


    @Column(name="created_date")
    @JsonIgnore
    private LocalDate createdDate=LocalDate.now();

    @Column(name="is_deleted",columnDefinition = "boolean default false")
    @JsonIgnore
    private Boolean isDeleted=false;
    
    @Column(name="is_Active",columnDefinition = "boolean default false")
    @JsonIgnore
    private Boolean isActive=false;
    
	
  		@ManyToOne()
  		@JsonIgnore
  		@JoinColumn(name="job_candidate_id")
  		private JobCandidate jobCandidate;


}
