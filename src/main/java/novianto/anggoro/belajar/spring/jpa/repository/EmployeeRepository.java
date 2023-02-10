package novianto.anggoro.belajar.spring.jpa.repository;

import novianto.anggoro.belajar.spring.jpa.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
