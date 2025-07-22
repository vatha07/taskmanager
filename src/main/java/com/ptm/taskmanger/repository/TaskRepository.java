package com.ptm.taskmanger.repository;

import com.ptm.taskmanger.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
