package com.ptm.taskmanger.repository;

import com.ptm.taskmanger.model.Test;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestRepository extends JpaRepository<Test, Long> {
}
