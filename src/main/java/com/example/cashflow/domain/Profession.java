package com.example.cashflow.domain;

public enum Profession {
    AIRLINE_PILOT("airline pilot", 9500, 6000, 2500),
    BUSINESS_MGR("business manager", 4600, 3000, 400),
    DOCTOR("doctor", 13200, 8300, 3500),
    ENGINEER("engineer", 4900, 3200, 400),
    JANITOR("janitor", 1600, 1000, 600),
    LAWYER("lawyer", 7500, 5100, 2000),
    MECHANIC("mechanic", 2000, 1300, 700),
    NURSE("nurse", 3100, 2000, 500),
    POLICE_OFFICER("police officer", 3000, 1900, 500),
    SECRETARY("secretary", 2800, 1900, 700),
    TEACHER("teacher", 3300, 2100, 400),
    TRUCK_DRIVER("truck driver", 2500, 1700, 800)
    ;

    private final String name;
    private final int salary;
    private final int expenses;
    private final int saving;

    Profession(String name, int salary, int expenses, int saving) {
        this.name = name;
        this.salary = salary;
        this.expenses = expenses;
        this.saving = saving;
    }

    int getMonthlyCashflow(){
        return salary - expenses;
    }

    int getInitialAccount(){
        return getMonthlyCashflow() + saving;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public int getExpenses() {
        return expenses;
    }
}
