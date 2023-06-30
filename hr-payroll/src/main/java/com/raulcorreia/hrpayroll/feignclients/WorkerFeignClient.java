package com.raulcorreia.hrpayroll.feignclients;

import com.raulcorreia.hrpayroll.entities.Worker;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.cloud.openfeign.FeignClient;

@Component
@FeignClient(name = "hr-worker", url = "localhost:8001", path = "/workers")
public interface WorkerFeignClient {

    @GetMapping("/{workerId}")
    ResponseEntity<Worker> findById(@PathVariable Long workerId);

}
