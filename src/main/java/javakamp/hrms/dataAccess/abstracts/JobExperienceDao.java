package javakamp.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import javakamp.hrms.entities.concretes.JobExperience;

public interface JobExperienceDao extends JpaRepository<JobExperience, Integer> {
	
	JobExperience findById(int id);
	List<JobExperience> findAllByJobCandidateId(int jobCandidateId);

}
