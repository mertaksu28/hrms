package javakamp.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javakamp.hrms.business.abstracts.EmployeeService;
import javakamp.hrms.dataAccess.abstracts.EmployeeDao;
import javakamp.hrms.entities.concretes.Employee;

@Service
public class EmployeeManager implements EmployeeService {

	private EmployeeDao employeeDao;

	@Autowired
	public EmployeeManager(EmployeeDao employeeDao) {
		super();
		this.employeeDao = employeeDao;
	}

	@Override
	public void add(Employee employee) {
		this.employeeDao.save(employee);
	}

	@Override
	public void update(Employee employee) {
		this.employeeDao.save(employee);
	}

	@Override
	public void delete(Employee employee) {
		this.employeeDao.delete(employee);
	}

	@Override
	public List<Employee> getAll() {
		return this.employeeDao.findAll();
	}

}
