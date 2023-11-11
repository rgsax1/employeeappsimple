package rodrigo.salles.employeespring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rodrigo.salles.employeespring.model.Employee;

import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    void deleteEmployeeById(Long id);

    Optional <Employee> findEmployeeById(Long id);
}
