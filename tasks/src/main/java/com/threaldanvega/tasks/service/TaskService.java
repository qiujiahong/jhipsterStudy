package com.threaldanvega.tasks.service;

import com.threaldanvega.tasks.domain.Task;

public interface TaskService {

    Iterable<Task> list();
    Task save(Task task);
}
