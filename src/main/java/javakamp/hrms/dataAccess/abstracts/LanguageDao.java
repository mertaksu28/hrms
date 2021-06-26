package javakamp.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import javakamp.hrms.entities.concretes.Language;

public interface LanguageDao extends JpaRepository<Language, Integer> {

	List<Language> findAllByJobCandidateId(int jobCandidateId);
	
}
