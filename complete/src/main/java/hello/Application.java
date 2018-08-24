package hello;

import hello.domain.Employee;
import hello.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	private EmployeeRepository employee;

	@Override
	public void run(String... args) throws Exception {
/*		this.employee.save(new Employee("Igor", "Akulov", 55));
		this.employee.save(new Employee("Daria", "Akulova", 11));
		this.employee.save(new Employee("Alex", "Akulov", 20));
		this.employee.save(new Employee("Margarita", "Akulova", 24));*/
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
