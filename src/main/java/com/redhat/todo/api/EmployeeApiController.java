package com.redhat.todo.api;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import com.redhat.todo.daos.EmployeeRepository;
import com.redhat.todo.exception.ResourceNotFoundException;
import com.redhat.todo.model.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-01-24T17:30:20.735351-05:00[America/New_York]")
@Controller
@RequestMapping("${openapi.feedback360Survey.base-path:}")
public class EmployeeApiController implements EmployeeApi {

    private final NativeWebRequest request;

    @Autowired
    private EmployeeRepository employeeRepo;

    @org.springframework.beans.factory.annotation.Autowired
    public EmployeeApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

    @Override
    public ResponseEntity<Employee> getEmployeeById(String employeeId) {
        Optional<Employee> employee = employeeRepo.findById(employeeId);
        return ResponseEntity.ok(employee.orElseThrow(() -> 
                    new ResourceNotFoundException("Employee not found when running getEmployeeById with id: " + employeeId)));
    }

    @Override
    public ResponseEntity<List<Employee>> getEmployees(@Valid String filterBy, @Valid String filter,
            @Valid String sortBy, @Valid String sortOrder, @Valid Integer offset, @Valid Integer maxResults) {

        return ResponseEntity.ok(employeeRepo.findAll());
    }

    
    
}
