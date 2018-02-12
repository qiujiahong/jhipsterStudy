package com.threaldanvega.tasks.repository;

import com.threaldanvega.tasks.domain.Task;
import org.springframework.data.repository.CrudRepository;

public interface TaskRepository extends CrudRepository<Task,Long>{


}
