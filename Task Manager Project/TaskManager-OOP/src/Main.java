
public class Main {

    public static void main(String[] args) {

        TaskService taskService = new TaskServiceImpl();

        Task task1 = new Task(1, "Learn Java", "Practice OOP concepts", "HIGH", "PENDING");
        Task task2 = new Task(2, "Build Task Manager", "Core Java project", "MEDIUM", "PENDING");

        taskService.addTask(task1);
        taskService.addTask(task2);

        System.out.println("All Tasks:");
        for (Task task : taskService.getAllTasks()) {
            System.out.println(task.getId() + " | " + task.getTitle() + " | " + task.getStatus());
        }

        System.out.println("\nSearching Task with ID 1:");
        Task foundTask = taskService.searchTask(1);
        System.out.println(foundTask.getTitle() + " - " + foundTask.getStatus());

        System.out.println("\nUpdating Task with ID 2:");
        Task updatedTask = new Task(2, "Build Task Manager", "Updated description", "HIGH", "COMPLETED");
        taskService.updateTask(2, updatedTask);

        System.out.println("\nAll Tasks After Update:");
        for (Task task : taskService.getAllTasks()) {
            System.out.println(task.getId() + " | " + task.getTitle() + " | " + task.getStatus());
        }
    }
}
