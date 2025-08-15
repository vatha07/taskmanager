package com.ptm.taskmanger.service;

import com.ptm.taskmanger.model.Test;
import com.ptm.taskmanger.repository.TestRepository;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;

@Data
@Service
public class TestService {
    private final TestRepository repo;

    public TestService(TestRepository repo) {
        this.repo = repo;
    }

    public List<Test> getAllTest() {
        return repo.findAll();
    }

    public Test createTest(Test test) {
        return repo.save(test);
    }

    public Test markComplete(Long id) {
        Test test = repo.findById(id).orElseThrow(() -> new RuntimeException("Task not found"));
        test.setCompleted(true);
        return repo.save(test);
    }

    public void deleteTest(Long id) {
        repo.deleteById(id);
    }

}
