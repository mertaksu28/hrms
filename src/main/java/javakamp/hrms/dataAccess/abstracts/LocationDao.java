package javakamp.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import javakamp.hrms.entities.concretes.Location;

public interface LocationDao extends JpaRepository<Location, Integer> {

}
