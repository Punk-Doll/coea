package com.coea.api.controller;

import com.coea.api.domain.feedback.*;
import com.coea.api.domain.opportunity.DataDetailsOpportunity;
import com.coea.api.domain.opportunity.DataListOpportunity;
import com.coea.api.domain.opportunity.UpdateDataOpportunity;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@RestController
@RequestMapping("/feedback")
public class FeedbackController {

    @Autowired
    private FeedbackRepository repository;

    @PostMapping
    @Transactional
    public ResponseEntity createFeedback(@RequestBody @Valid DataFeedback request, UriComponentsBuilder uriBuilder) {
        var feedback = repository.save(new Feedback(request));
        var uri = uriBuilder.path("/job/{id}").buildAndExpand(feedback.getId()).toUri();
        return ResponseEntity.created(uri).body(new DataDetailsFeedback(feedback));
    }

    @GetMapping
    public List<DataListFeedback> getFeedback(){
        return repository.findAll().stream().map(DataListFeedback::new).toList();

    }

    @GetMapping("/{id}")
    public ResponseEntity getFeedbackById(@PathVariable Long id){
        var feedback = repository.getReferenceById(id);
        return ResponseEntity.ok(new DataDetailsFeedback(feedback));
    }

    @PutMapping
    @Transactional
    public ResponseEntity updateFeedback(@RequestBody @Valid UpdateDataFeedback request){
        var feedback = repository.getReferenceById(request.id());
        feedback.updateDataFeedback(request);
        return ResponseEntity.ok(new DataDetailsFeedback(feedback));
    }

    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity deleteFeedback(@PathVariable Long id){
        repository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
