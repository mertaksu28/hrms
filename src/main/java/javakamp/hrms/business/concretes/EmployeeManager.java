package javakamp.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javakamp.hrms.business.abstracts.EmployeeService;
import javakamp.hrms.business.abstracts.EmployerService;
import javakamp.hrms.core.utulities.results.DataResult;
import javakamp.hrms.core.utulities.results.ErrorDataResult;
import javakamp.hrms.core.utulities.results.ErrorResult;
import javakamp.hrms.core.utulities.results.Result;
import javakamp.hrms.core.utulities.results.SuccessDataResult;
import javakamp.hrms.core.utulities.results.SuccessResult;
import javakamp.hrms.dataAccess.abstracts.EmployeeDao;
import javakamp.hrms.entities.concretes.Employee;
import lombok.var;

@Service
public class EmployeeManager implements EmployeeService{

	private EmployeeDao employeeDao;

	@Autowired
	public EmployeeManager(EmployeeDao employeeDao) {
		super();
		this.employeeDao = employeeDao;

	}
	
	@Override
	public Result add(Employee employee) {
		
		if(!this.checkIfEmailExists(employee.getEmail())) {
			return new ErrorResult("Email already exist... ");
		}
	
		employeeDao.save(employee);
		return new SuccessResult();
	}

	@Override
	public Result update(Employee employee) {
		employeeDao.save(employee);
		return new SuccessResult("güncellendi");
	}

	@Override
	public DataResult<Employee> findById(int userId) {
		var result = employeeDao.findById(userId).get();
		if (result==null) {
			return new ErrorDataResult<>("Sistem çalışanı bulunamadı");
		}
		return new SuccessDataResult<>(result,"Sistem çalışanı getirildi");
	}

	@Override
	public DataResult<List<Employee>> findAll() {
		var result = employeeDao.findAll();
		if (result == null) {
			return new ErrorDataResult<>("Sistem çalışanları bulunamadı");
		}
		return new SuccessDataResult<>(result,"Sistem çalışanları listelendi");
	}
	
	
	private boolean checkIfEmailExists(String email) {
		if(this.employeeDao.findByEmail(email) !=null) {
			return false;
		}
		return true;
		
	}
	

	


}
