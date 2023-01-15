package oop_2_1;

import static checkValue.Validatoin.validateStandard;
import static checkValue.Validatoin.validateStandardInt;

public class Human {
    private String name;
    private String town;
    private Integer yearOfBirth;
    private String jobTitle;

    public Human(String name, String town, Integer yearOfBirth, String jobTitle) {
        this.name = validateStandard(name);
        this.town = validateStandard(town);
        this.yearOfBirth = validateStandardInt(yearOfBirth);
        this.jobTitle = validateStandard(jobTitle);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = validateStandard(name);
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = validateStandard(town);
    }

    public Integer getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(Integer yearOfBirth) {
        this.yearOfBirth = validateStandardInt(yearOfBirth);
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = validateStandard(jobTitle);
    }

    @Override
    public String toString() {
        return "Привет! Меня зовут " + name +
                ". Я из города " + town +
                ". Я родился в " + yearOfBirth +
                " году. Я работаю в должности " + jobTitle +
                ". Будем знакомы!";
    }
}
