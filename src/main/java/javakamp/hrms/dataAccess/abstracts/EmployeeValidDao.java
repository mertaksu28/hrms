package javakamp.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import javakamp.hrms.entities.concretes.EmployeeValid;

public interface EmployeeValidDao extends JpaRepository<EmployeeValid, Integer> {

}
