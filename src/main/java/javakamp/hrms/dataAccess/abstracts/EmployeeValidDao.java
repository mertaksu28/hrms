package javakamp.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import javakamp.hrms.entities.concretes.EmployeeConfirm;


public interface EmployeeValidDao extends JpaRepository<EmployeeConfirm, Integer> {

}
