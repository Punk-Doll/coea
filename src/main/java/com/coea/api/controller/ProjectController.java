package com.coea.api.controller;

import com.coea.api.domain.feedback.DataDetailsFeedback;
import com.coea.api.domain.feedback.DataListFeedback;
import com.coea.api.domain.project.*;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@RestController
@RequestMapping("/project")
public class ProjectController {

    @Autowired
    ProjectRepository repository;

    @PostMapping
    @Transactional
    public ResponseEntity createProject(@RequestBody @Valid DataProject request, UriComponentsBuilder uriBuilder) {
        var project = repository.save(new Project(request));
        var uri = uriBuilder.path("/project/{id}").buildAndExpand(project.getId()).toUri();
        return ResponseEntity.created(uri).body(new DataDetailsProject(project));
    }

    @GetMapping
    public List<DataListProject> getProject(){
        return repository.findAll().stream().map(DataListProject::new).toList();

    }

    @GetMapping("/{id}")
    public ResponseEntity getProjectById(@PathVariable Long id){
        var project = repository.getReferenceById(id);
        return ResponseEntity.ok(new DataDetailsProject(project));
    }

    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity deleteProject(@PathVariable Long id){
        repository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
