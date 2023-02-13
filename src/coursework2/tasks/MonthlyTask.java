package coursework2.tasks;

import coursework2.Task;
import coursework2.TaskType;
import validation.WrongInputException;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class MonthlyTask extends Task implements Repeatable {
    public MonthlyTask(String heading, String description, TaskType taskType,
                       LocalDateTime timeOfCreation) throws WrongInputException {
        super(heading, description, taskType, timeOfCreation);
    }

    @Override
    public boolean check(LocalDate date) {
        return (timeOfCreation.toLocalDate().isBefore(date) || timeOfCreation.toLocalDate().equals(date)) &&
                timeOfCreation.getDayOfMonth() == date.getDayOfMonth();
    }

}
