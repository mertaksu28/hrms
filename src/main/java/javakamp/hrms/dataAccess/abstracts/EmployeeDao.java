package javakamp.hrms.dataAccess.abstracts;


import org.springframework.data.jpa.repository.JpaRepository;

import javakamp.hrms.entities.concretes.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Integer> {

	Employee findById(int userId);
	Employee findByEmail(String email);
	
}
