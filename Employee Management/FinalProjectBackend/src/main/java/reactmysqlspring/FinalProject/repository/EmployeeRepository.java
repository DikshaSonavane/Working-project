package reactmysqlspring.FinalProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import reactmysqlspring.FinalProject.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
//all crud dtabase methods
	
	
}
