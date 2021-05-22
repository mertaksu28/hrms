package javakamp.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import javakamp.hrms.entities.concretes.SystemWorker;

public interface SystemWorkerDao extends JpaRepository<SystemWorker, Integer> {

}
