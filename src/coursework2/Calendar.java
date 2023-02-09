package coursework2;

import coursework2.tasks.Repeatable;

import java.time.LocalDate;
import java.util.*;

public class Calendar {
    private final Map<Integer, Task> tasks;

    public Calendar() {
        tasks = new HashMap<>();
    }

    public void addTask(Task task) {
        tasks.put(task.getId(), task);
    }

    public List<Task> getTasksForOneDay(LocalDate date) {
        List<Task> result = new ArrayList<>();
        for (Map.Entry<Integer, Task> entry : tasks.entrySet()) {
            Task task = entry.getValue();
            if (task instanceof Repeatable && ((Repeatable) task).check(date)
                    || !(task instanceof Repeatable) && task.getTimeOfCreation().toLocalDate().equals(date)) {
                result.add(task);
            }
        }
        result.sort(Comparator.comparing(Task::getTimeOfCreation));
        return result;
    }

    public boolean removeTask(Integer id) {
        return tasks.remove(id) != null;
    }

    @Override
    public String toString() {
        return "Задача: " + tasks;
    }
}
