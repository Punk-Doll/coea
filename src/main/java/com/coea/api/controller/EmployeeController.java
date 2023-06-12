package com.coea.api.controller;

import com.coea.api.domain.employee.*;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeRepository repository;

    @PostMapping
    @Transactional
    public ResponseEntity RegisterEmployee(@RequestBody @Valid DataEmployee request, UriComponentsBuilder uriBuilder) {
        var employee = repository.save(new Employee(request));
        var uri = uriBuilder.path("/employee/{id}").buildAndExpand(employee.getId()).toUri();
        return ResponseEntity.created(uri).body(new DataDetailsEmployee(employee));
    }

    @GetMapping
    public List<DataListEmployee> getEmployee(){
        return repository.findAll().stream().map(DataListEmployee::new).toList();

    }

    @GetMapping("/{id}")
    public ResponseEntity getEmployeeById(@PathVariable Long id){
        var employee = repository.getReferenceById(id);
        return ResponseEntity.ok(new DataDetailsEmployee(employee));
    }

    @PutMapping
    @Transactional
    public ResponseEntity updateEmployee(@RequestBody @Valid UpdateDataEmployee request){
        var employee = repository.getReferenceById(request.id());
        employee.updateDataEmployee(request);
        return ResponseEntity.ok(new DataDetailsEmployee(employee));
    }

    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity deleteEmplyee(@PathVariable Long id){
        repository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
