package javakamp.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javakamp.hrms.entities.concretes.WorkingTime;

@Repository
public interface WorkingTimeDao extends JpaRepository<WorkingTime,Integer>{


}
