package coursework2;

import validation.WrongInputException;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

import static validation.Validation.checkString;

public abstract class Task {

    public static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("HH mm dd MM yy");
    public static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("dd MM yy");
    private static Integer counter = 1;
    private String heading; //заголовок задачи
    private String description; //описание задачи
    private TaskType taskType; //тип задачи (личная или рабочая)
    protected LocalDateTime timeOfCreation; //дата и время задачи
    private final Integer id;

    public Task(String heading, String description, TaskType taskType,
                LocalDateTime timeOfCreation) throws WrongInputException {
        this.heading = checkString(heading);
        this.description = checkString(description);
        this.taskType = taskType;
        this.timeOfCreation = timeOfCreation;
        this.id = counter++;
    }

    //regionMethods
    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TaskType getTaskType() {
        return taskType;
    }

    public void setTaskType(TaskType taskType) {
        this.taskType = taskType;
    }

    public LocalDateTime getTimeOfCreation() {
        return timeOfCreation;
    }

    public void setTimeOfCreation(LocalDateTime timeOfCreation) {
        this.timeOfCreation = timeOfCreation;
    }

    public Integer getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(heading, task.heading)
                && Objects.equals(description, task.description)
                && taskType == task.taskType
                && Objects.equals(timeOfCreation, task.timeOfCreation)
                && Objects.equals(id, task.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(heading, description, taskType, timeOfCreation, id);
    }

    @Override
    public String toString() {
        return "заголовок: " + heading +
                ", описание: " + description +
                ", тип: " + taskType +
                ", время создания: " + timeOfCreation +
                ", id: " + id;
    }
    //endregion
}
