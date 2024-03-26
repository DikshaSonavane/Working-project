package reactmysqlspring.FinalProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import reactmysqlspring.FinalProject.model.Employee;
import reactmysqlspring.FinalProject.repository.EmployeeRepository;

@SpringBootApplication
public class FinalProjectBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(FinalProjectBackendApplication.class, args);
	}
@Autowired
private EmployeeRepository employeeRepository;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//	Employee employee = new Employee();
//	employee.setFirstName("Diksha");
//		employee.setLastName("Sonaavne");
//		employee.setEmialId("dikshas@gmail.com");
//		employeeRepository.save(employee);
//		
//		Employee employee1 = new Employee();
//		employee1.setFirstName("Mayu");
//		employee1.setLastName("Sonaavne");
//		employee1.setEmialId("smayu@gmail.com");
//		employeeRepository.save(employee1);
//	
		}

}
