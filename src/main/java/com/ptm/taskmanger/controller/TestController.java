package com.ptm.taskmanger.controller;

import com.ptm.taskmanger.model.Test;
import com.ptm.taskmanger.service.TestService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tests")
@CrossOrigin
public class TestController {
    private final TestService service;

    public TestController(TestService service) {
        this.service = service;
    }

    @GetMapping
    public List<Test> getTests() {
        return service.getAllTest();
    }

    @PostMapping
    public Test createTest(@Valid @RequestBody Test test) {
        return service.createTest(test);
    }

    @PutMapping("/{id}/complete")
    public Test completeTest(@PathVariable Long id) {
        return service.markComplete(id);
    }

    @DeleteMapping("/{id}")
    public void deleteTest(@PathVariable Long id) {
        service.deleteTest(id);
    }

}
