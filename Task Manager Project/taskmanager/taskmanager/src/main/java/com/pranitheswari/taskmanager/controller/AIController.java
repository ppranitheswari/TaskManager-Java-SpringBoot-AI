package com.pranitheswari.taskmanager.controller;

import com.pranitheswari.taskmanager.ai.AIService;
import com.pranitheswari.taskmanager.entity.Task;
import com.pranitheswari.taskmanager.service.TaskService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ai")
public class AIController {

    private final TaskService taskService;
    private final AIService aiService;

    public AIController(TaskService taskService, AIService aiService) {
        this.taskService = taskService;
        this.aiService = aiService;
    }

    @PostMapping("/suggest")
    public String getAISuggestions() throws Exception {
        List<Task> tasks = taskService.getAllTasks();
        return aiService.getSuggestions(tasks.toString());
    }
}
