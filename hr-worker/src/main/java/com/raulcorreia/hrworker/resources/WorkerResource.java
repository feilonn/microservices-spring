package com.raulcorreia.hrworker.resources;

import com.raulcorreia.hrworker.entities.Worker;
import com.raulcorreia.hrworker.repositories.WorkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/workers")
public class WorkerResource {

    @Autowired
    private WorkerRepository repository;

    @GetMapping
    public ResponseEntity<List<Worker>> findAll() {
        List<Worker> workers = repository.findAll();

        return ResponseEntity.ok(workers);
    }

   @GetMapping("/{workerId}")
   public ResponseEntity<Worker> findById(@PathVariable Long workerId) {
        Worker worker = repository.findById(workerId).get();

        return ResponseEntity.ok(worker);
   }

}
