package com.threaldanvega.tasks;

import com.threaldanvega.tasks.domain.Task;
import com.threaldanvega.tasks.service.TaskService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

@SpringBootApplication
public class TasksApplication {

    public static void main(String[] args) {
        SpringApplication.run(TasksApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(TaskService taskService) {
        return args -> {
            taskService.save(new Task(1L,"1create spring boot application", LocalDate.now(),true));
            taskService.save(new Task(2L,"2create spring boot application", LocalDate.now().plus(1, ChronoUnit.DAYS),false));
            taskService.save(new Task(3L,"3create spring boot application", LocalDate.now().plus(3, ChronoUnit.DAYS),false));
            taskService.save(new Task(4L,"4create spring boot application", LocalDate.now().plus(4, ChronoUnit.DAYS),false));
            taskService.save(new Task(5L,"5create spring boot application", LocalDate.now().plus(5, ChronoUnit.DAYS),false));
            taskService.save(new Task(6L,"6create spring boot application", LocalDate.now().plus(10, ChronoUnit.DAYS),false));
            taskService.save(new Task(7L,"7create spring boot application", LocalDate.now().plus(12, ChronoUnit.DAYS),false));
            taskService.save(new Task(8L,"8create spring boot application", LocalDate.now().plus(15, ChronoUnit.DAYS),false));

        };
    }
}
