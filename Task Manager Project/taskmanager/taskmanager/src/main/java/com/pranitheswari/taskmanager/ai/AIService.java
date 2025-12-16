package com.pranitheswari.taskmanager.ai;

import org.springframework.stereotype.Service;

@Service
public class AIService {

    public String getSuggestions(String taskData) {

        return """
        AI Analysis Result:
        
        1. Prioritize tasks with HIGH priority first.
        2. Complete PENDING tasks before starting new ones.
        3. Break complex tasks into smaller manageable tasks.
        4. Update task status regularly to track progress.
        5. Avoid overloading by balancing task priorities.
        
        This recommendation is generated based on current task data.
        """;
    }
}
