
import java.util.ArrayList;
import java.util.List;

public class TaskServiceImpl implements TaskService {

    private List<Task> tasks = new ArrayList<>();

    @Override
    public void addTask(Task task) {
        if (task.getTitle() == null || task.getTitle().isEmpty()) {
            throw new IllegalArgumentException("Task title cannot be empty");
        }
        tasks.add(task);
    }

    @Override
    public void updateTask(int id, Task updatedTask) {
        for (Task task : tasks) {
            if (task.getId() == id) {
                task.setTitle(updatedTask.getTitle());
                task.setDescription(updatedTask.getDescription());
                task.setPriority(updatedTask.getPriority());
                task.setStatus(updatedTask.getStatus());
                return;
            }
        }
        throw new RuntimeException("Task not found");
    }

    @Override
    public void deleteTask(int id) {
        tasks.removeIf(task -> task.getId() == id);
    }

    @Override
    public Task searchTask(int id) {
        for (Task task : tasks) {
            if (task.getId() == id) {
                return task;
            }
        }
        throw new RuntimeException("Task not found");
    }

    @Override
    public List<Task> getAllTasks() {
        return tasks;
    }
}
