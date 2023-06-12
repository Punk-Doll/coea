package com.coea.api.controller;

import com.coea.api.domain.employee.DataDetailsEmployee;
import com.coea.api.domain.employee.DataListEmployee;
import com.coea.api.domain.employee.UpdateDataEmployee;
import com.coea.api.domain.opportunity.*;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@RestController
@RequestMapping("/jobs")
public class OpportunityController {

    @Autowired
    private OpportunityRepository repository;

    @PostMapping
    @Transactional
    public ResponseEntity RegisterJob(@RequestBody @Valid DataOpportunity request, UriComponentsBuilder uriBuilder) {
        var job = repository.save(new Opportunity(request));
        var uri = uriBuilder.path("/job/{id}").buildAndExpand(job.getId()).toUri();
        return ResponseEntity.created(uri).body(new DataDetailsOpportunity(job));
    }

    @GetMapping
    public List<DataListOpportunity> getEmployee(){
        return repository.findAll().stream().map(DataListOpportunity::new).toList();

    }

    @GetMapping("/{id}")
    public ResponseEntity getOpportunityById(@PathVariable Long id){
        var job = repository.getReferenceById(id);
        return ResponseEntity.ok(new DataDetailsOpportunity(job));
    }

    @PutMapping
    @Transactional
    public ResponseEntity updateOpportunity(@RequestBody @Valid UpdateDataOpportunity request){
        var job = repository.getReferenceById(request.id());
        job.updateDataOpportunity(request);
        return ResponseEntity.ok(new DataDetailsOpportunity(job));
    }

    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity deleteOpportunity(@PathVariable Long id){
        repository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
