package javakamp.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import javakamp.hrms.entities.concretes.JobCandidate;

public interface JobCandidateDao extends JpaRepository<JobCandidate, Integer> {

}