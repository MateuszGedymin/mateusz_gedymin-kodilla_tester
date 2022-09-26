package com.kodilla.abstracts.homework.two;

public abstract class Job {

    private final int salary;
    private final String responsibilities;

    private final String jobName;

    public Job(String jobName,int salary, String responsibilities) {
        this.salary = salary;
        this.responsibilities = responsibilities;
        this.jobName = jobName;
    }

    public String getJobName() {
        return jobName;
    }

    public int getSalary() {
        return salary;
    }

    public String getResponsibilities() {
        return responsibilities;
    }

    public abstract void salary();
    public abstract void responsibilities();
}
