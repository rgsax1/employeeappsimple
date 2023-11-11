package rodrigo.salles.employeespring.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import rodrigo.salles.employeespring.exception.UserNotFoundException;
import rodrigo.salles.employeespring.model.Employee;
import rodrigo.salles.employeespring.repository.EmployeeRepository;

import java.util.List;
import java.util.UUID;

@AllArgsConstructor
@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    public Employee addEmployee(Employee employee){
        employee.setEmployeeCode(UUID.randomUUID().toString());
        return employeeRepository.save(employee);
    }

    public List<Employee> findAllEmployees() {
        return employeeRepository.findAll();
    }

    public Employee updateEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public Employee findEmployeeById(Long id) {
       return employeeRepository.findEmployeeById(id).orElseThrow(() -> new UserNotFoundException("User by id" + id + " was not found."));
    }

    public void deleteEmployee(Long id) {
        employeeRepository.deleteEmployeeById(id);
    }
}
