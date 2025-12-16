
import java.util.List;

public interface TaskService {

    void addTask(Task task);

    void updateTask(int id, Task task);

    void deleteTask(int id);

    Task searchTask(int id);

    List<Task> getAllTasks();
}
