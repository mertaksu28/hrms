package javakamp.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import javakamp.hrms.entities.concretes.JobCandidate;

public interface JobCandidateDao extends JpaRepository<JobCandidate, Integer> {

	JobCandidate getById(int userId);
	JobCandidate findByEmail(String email);
	JobCandidate findByIdentificationNo(String identificationNo);
}
